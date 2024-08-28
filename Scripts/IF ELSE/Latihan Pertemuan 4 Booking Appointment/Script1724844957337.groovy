import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('BLOCKS/Open Browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('BLOCKS/Login Success and Custom Keyword'), [('Username') : 'John Doe', ('Password') : 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Page_Appointment_Confirmation/dropdown_facility'), 'Seoul CURA Healthcare Center', 
    false)

//If Else checkbox apply hospital
'apply hospital admission'
if (hospital_readmission == true) {
    WebUI.check(findTestObject('Object Repository/P.BA01-Booking Appointment (Positive)/INPUT/input_Apply for hospital'))
}

//WebUI.check(findTestObject('P.BA01-Booking Appointment (Positive)/INPUT/input_Apply for hospital'))
// Switch case choose programs
//WebUI.click(findTestObject('IF ELSE SCRIPT MODE/input_Medicaid_programs'))
def select_radio = healthcare_program

'isi program'
switch (select_radio) {
    case select_radio = 'Medicaid':
        println(select_radio)

        WebUI.click(findTestObject('IF ELSE SCRIPT MODE/input_Medicaid_programs'))

        break
    case select_radio = 'Medicare':
        println(select_radio)

        WebUI.click(findTestObject('IF ELSE SCRIPT MODE/input_Medicare_programs'))

        break
    case select_radio = 'None':
        println(select_radio)

        WebUI.click(findTestObject('IF ELSE SCRIPT MODE/input_None_programs'))
    default:
        println(select_radio)

        WebUI.click(findTestObject('IF ELSE SCRIPT MODE/input_None_programs'))

        break
}

WebUI.setText(findTestObject('IF ELSE SCRIPT MODE/input_Visit Date (Required)_visit_date'), '10/10/2024')

WebUI.setText(findTestObject('Object Repository/P.BA01-Booking Appointment (Positive)/INPUT/textarea_Comment'), 'GERD')

WebUI.click(findTestObject('IF ELSE SCRIPT MODE/button_Book Appointment'))

WebUI.verifyElementVisible(findTestObject('Object Repository/P.BA01-Booking Appointment (Positive)/BUTTON/HEADING/h1_CURA Healthcare'))

WebUI.verifyElementPresent(findTestObject('Page_Appointment_Confirmation/lbl_Appointment Confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Appointment_Confirmation/lbl_subtitle'), 0)

WebUI.verifyElementText(findTestObject('Page_Appointment_Confirmation/lbl_isi_facility'), 'Seoul CURA Healthcare Center')

//If else verify checkbox apply hospital
if (hospital_readmission == true) {
    WebUI.verifyElementText(findTestObject('IF ELSE SCRIPT MODE/lbl_yes_no'), 'Yes')
} else {
    WebUI.verifyElementText(findTestObject('IF ELSE SCRIPT MODE/lbl_yes_no'), 'No', FailureHandling.OPTIONAL)
}

//WebUI.verifyElementText(findTestObject('Page_Appointment_Confirmation/lbl_yes_no'), 'Yes')
//WebUI.verifyElementText(findTestObject('Page_Appointment_Confirmation/lbl_isi_program'), 'Medicaid')
'verify isi program'
switch (select_radio) {
    case select_radio = 'Medicaid':
        println(select_radio)

        WebUI.verifyElementText(findTestObject('Page_Appointment_Confirmation/lbl_isi_program'), 'Medicaid')

        break
    case select_radio = 'Medicare':
        println(select_radio)

        WebUI.verifyElementText(findTestObject('Page_Appointment_Confirmation/lbl_isi_program'), 'Medicare')

        break
    case select_radio = 'None':
        println(select_radio)

        WebUI.verifyElementText(findTestObject('Page_Appointment_Confirmation/lbl_isi_program'), 'None')
    default:
        println(select_radio)

        WebUI.verifyElementText(findTestObject('Page_Appointment_Confirmation/lbl_isi_program'), 'None')

        break
}

WebUI.verifyElementText(findTestObject('IF ELSE SCRIPT MODE/lbl_isi_komen'), 'GERD')


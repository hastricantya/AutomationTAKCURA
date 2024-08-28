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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/P.BA04-Booking Appointment none (Positive)/SPAN/a_Make Appointment'))

WebUI.setText(findTestObject('Object Repository/P.BA04-Booking Appointment none (Positive)/INPUT/input_Username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/P.BA04-Booking Appointment none (Positive)/INPUT/input_Password'), 
    'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/P.BA04-Booking Appointment none (Positive)/button_Login'))

WebUI.verifyElementVisible(findTestObject('Object Repository/P.BA04-Booking Appointment none (Positive)/SPAN/h2_Make Appointment'))

WebUI.click(findTestObject('Object Repository/P.BA04-Booking Appointment none (Positive)/INPUT/input_None_programs'))

WebUI.click(findTestObject('Object Repository/P.BA04-Booking Appointment none (Positive)/INPUT/div_Visit Date'))

WebUI.click(findTestObject('Object Repository/P.BA04-Booking Appointment none (Positive)/SPAN/td_date 7'))

WebUI.setText(findTestObject('Object Repository/P.BA04-Booking Appointment none (Positive)/INPUT/textarea_Comment'), 'none')

WebUI.click(findTestObject('Object Repository/P.BA04-Booking Appointment none (Positive)/button_Book Appointment'))

WebUI.verifyElementVisible(findTestObject('Object Repository/P.BA04-Booking Appointment none (Positive)/SPAN/h2_Appointment Confirmation'))

WebUI.click(findTestObject('Object Repository/P.BA04-Booking Appointment none (Positive)/SPAN/a_Go to Homepage'))

WebUI.closeBrowser()


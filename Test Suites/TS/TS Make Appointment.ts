<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>TS Make Appointment</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>8fc940d0-ff43-4e1f-8ed2-958aeb9f14b5</testSuiteGuid>
   <testCaseLink>
      <guid>5dfd1356-7ea5-4e5a-bd38-7f4369ef884a</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/BLOCKS/Open Browser</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>a0770935-6118-4e5f-b521-a704579b4edb</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/BLOCKS/Login Success and Custom Keyword</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>2d1ec453-0be4-4685-a7b6-2b79b9dbb5bd</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/KATALON DATA/Test Data Login Heroku</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>2d1ec453-0be4-4685-a7b6-2b79b9dbb5bd</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Username</value>
         <variableId>aacac50d-660c-4e40-95d3-c45d77173357</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>2d1ec453-0be4-4685-a7b6-2b79b9dbb5bd</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Password</value>
         <variableId>b3300f61-87c9-4549-81b6-0d9fa5662ce6</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>5430f7a0-24a4-4511-814c-a870ba6e04b6</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/BLOCKS/Booking Appointment Success</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>751bb2d8-43b7-4841-8a9e-76d41554053d</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/BLOCKS/Close Browser</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
</TestSuiteEntity>

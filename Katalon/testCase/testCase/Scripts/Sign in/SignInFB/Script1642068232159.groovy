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

WebUI.navigateToUrl('http://localhost:8080/')

WebUI.click(findTestObject('Object Repository/Page_Element/a_Sign In (3)'))

WebUI.click(findTestObject('Object Repository/Page_Element/div_Forgot password_mx_AccessibleButton mx__35ae1c'))

WebUI.setText(findTestObject('Object Repository/Page_Log in to Facebook  Facebook/input_Log in to Facebook_email'), 'mykhanhlop9lt@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log in to Facebook  Facebook/input_Log in to Facebook_pass'), 
    'kB8wMbJL3qwdyESTTp3j5g==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Log in to Facebook  Facebook/input_Log in to Facebook_pass'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Facebook/a_Bn khng nhn c m'))

WebUI.click(findTestObject('Object Repository/Page_Facebook/a_Nhn tin m ng nhp cho ti'))

WebUI.click(findTestObject('Object Repository/Page_Facebook/a_ng'))

WebUI.setText(findTestObject('Object Repository/Page_Facebook/input_Khi bn nhn c m gm 6 ch s, hy nhp m   _6860bb'), '581552')

WebUI.sendKeys(findTestObject('Object Repository/Page_Facebook/input_Khi bn nhn c m gm 6 ch s, hy nhp m   _6860bb'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Facebook/div_ng lu'))

WebUI.click(findTestObject('Object Repository/Page_Facebook/input_Lu trnh duyt_name_action_selected'))

WebUI.click(findTestObject('Object Repository/Page_Facebook/button_Tip tc'))

WebUI.click(findTestObject('Object Repository/Page_ng nhp bng Facebook/span_Tip tc di tn Nht'))

WebUI.setText(findTestObject('Object Repository/Page_Create your account/input__username (3)'), 'minhnhutfb')

WebUI.click(findTestObject('Object Repository/Page_Create your account/input_Checking if username is available_pri_ce088f'))

WebUI.click(findTestObject('Object Repository/Page_Create your account/input_Checking if username is available_pri_ce088f'))

WebUI.click(findTestObject('Object Repository/Page_Agree to terms and conditions/p_I have read and agree to the terms and co_a99c95'))

WebUI.click(findTestObject('Object Repository/Page_Agree to terms and conditions/input_minhnhutfbmatrix.org_accepted_version'))

WebUI.click(findTestObject('Object Repository/Page_Agree to terms and conditions/input_terms and conditions_primary-button (3)'))

WebUI.click(findTestObject('Object Repository/Page_Continue to your account/a_Continue (4)'))


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

WebUI.click(findTestObject('Object Repository/Page_Element/a_Sign In (4)'))

WebUI.click(findTestObject('Object Repository/Page_Element/img (4)'))

WebUI.setText(findTestObject('Object Repository/Page_Sign in with AppleID/input_Use your AppleID to sign in to matrix_4113a2 (2)'), 
    'bincuibap341510@icloud.com')

WebUI.sendKeys(findTestObject('Object Repository/Page_Sign in with AppleID/input_Use your AppleID to sign in to matrix_4113a2 (2)'), 
    Keys.chord(Keys.ENTER))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in with AppleID/input_Password_password_text_field (2)'), 
    'yFuCCpfGexsOHcj2Udb1lw==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Sign in with AppleID/input_Password_password_text_field (2)'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Sign in with AppleID/input_Two-Factor Authentication_char0 (1)'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Sign in with AppleID/input_Two-Factor Authentication_char1 (1)'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Sign in with AppleID/input_Two-Factor Authentication_char2 (1)'), '4')

WebUI.setText(findTestObject('Object Repository/Page_Sign in with AppleID/input_Two-Factor Authentication_char3 (1)'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Sign in with AppleID/input_Two-Factor Authentication_char4 (1)'), '6')

WebUI.setText(findTestObject('Object Repository/Page_Sign in with AppleID/input_Two-Factor Authentication_char5 (1)'), '1')


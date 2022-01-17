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

WebUI.click(findTestObject('Object Repository/Page_Element/div_Sign In (3)'))

WebUI.click(findTestObject('Object Repository/Page_Element/img (5)'))

WebUI.setText(findTestObject('Object Repository/Page_Sign in with AppleID/input_Use your AppleID to sign in to matrix_4113a2 (3)'), 
    'bincuibap341510@icloud.com')

WebUI.sendKeys(findTestObject('Object Repository/Page_Sign in with AppleID/input_Use your AppleID to sign in to matrix_4113a2 (3)'), 
    Keys.chord(Keys.ENTER))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in with AppleID/input_Password_password_text_field (3)'), 
    'kB8wMbJL3qwdyESTTp3j5g==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Sign in with AppleID/input_Password_password_text_field (3)'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Sign in with AppleID/button_Trust (2)'))

WebUI.click(findTestObject('Object Repository/Page_Sign in with AppleID/div_Continue (2)'))

WebUI.click(findTestObject('Object Repository/Page_Continue to your account/a_Continue (5)'))

WebUI.click(findTestObject('Object Repository/Page_Element/div_Verify with Security Key'))

WebUI.click(findTestObject('Object Repository/Page_Element/div_Security Key'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Element/input_Security Key_mx_securityKey'), '2xtrZCeBa6ui62bmiQGjDjjiWrEw0h5pd2hXWEcGFEPA1KYKRCYe9Qn84j1AsnWrb98ZqH6DWG4DJW/VEBQ76A==')

WebUI.click(findTestObject('Object Repository/Page_Element/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Element/div_Done'))


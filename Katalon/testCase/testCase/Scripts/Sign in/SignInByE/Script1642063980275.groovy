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

WebUI.click(findTestObject('Object Repository/Page_Element/div_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_Element/img'))

WebUI.setText(findTestObject('Object Repository/Page_ng nhp - Ti khon Google/input_matrix.org_identifier'), 'tmnhut19@apcs.vn')

WebUI.click(findTestObject('Object Repository/Page_ng nhp - Ti khon Google/div_iu khon dch v_VfPpkd-RLmnJb'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ng nhp - Ti khon Google/input_Qu nhiu ln th khng thnh cng_password'), 
    '85FPKLwMiVQY7KMdwvYGzw==')

WebUI.click(findTestObject('Object Repository/Page_ng nhp - Ti khon Google/span_Tip theo'))

WebUI.setText(findTestObject('Object Repository/Page_Create your account/input__username'), 'nhutminh')

WebUI.click(findTestObject('Object Repository/Page_Create your account/form_Username                              _cae74d'))

WebUI.click(findTestObject('Object Repository/Page_Create your account/input_matrix.org_primary-button'))

WebUI.click(findTestObject('Object Repository/Page_Agree to terms and conditions/input_nhutminhmatrix.org_accepted_version'))

WebUI.click(findTestObject('Object Repository/Page_Agree to terms and conditions/input_terms and conditions_primary-button'))

WebUI.click(findTestObject('Object Repository/Page_Continue to your account/a_Continue'))


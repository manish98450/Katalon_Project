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

//WebUI.openBrowser('')

//WebUI.navigateToUrl('https://www.facebook.com/')

WebUI.click(findTestObject('Object Repository/FaceBookPages/Facebook _RegistrationValidation_OR/a_Create new account'))

WebUI.setText(findTestObject('Object Repository/FaceBookPages/Facebook _RegistrationValidation_OR/input_firstname'), 'sam')

WebUI.setText(findTestObject('Object Repository/FaceBookPages/Facebook _RegistrationValidation_OR/input_lastname'), 'bahadur')

WebUI.setText(findTestObject('Object Repository/FaceBookPages/Facebook _RegistrationValidation_OR/input_reg_email__'), 'manish_pandey@srmap.edu.in')

WebUI.setText(findTestObject('Object Repository/FaceBookPages/Facebook _RegistrationValidation_OR/input_reg_email_confirmation__'), 
    '')

WebUI.click(findTestObject('Object Repository/FaceBookPages/Facebook _RegistrationValidation_OR/input_reg_email_confirmation__'))

WebUI.setText(findTestObject('Object Repository/FaceBookPages/Facebook _RegistrationValidation_OR/input_reg_email__'), 'mp9080952@gmail.com')

WebUI.setText(findTestObject('Object Repository/FaceBookPages/Facebook _RegistrationValidation_OR/input_reg_email_confirmation__'), 
    'mp9080952@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/FaceBookPages/Facebook _RegistrationValidation_OR/input_reg_passwd__'), 
    'XIuaCJqjxDL1xSur83Ap0A==')

WebUI.selectOptionByValue(findTestObject('Object Repository/FaceBookPages/Facebook _RegistrationValidation_OR/select_123456789101112131415161718192021222_566da4'), 
    '26', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FaceBookPages/Facebook _RegistrationValidation_OR/select_123456789101112131415161718192021222_566da4'), 
    '15', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FaceBookPages/Facebook _RegistrationValidation_OR/select_JanFebMarAprMayJunJulAugSepOctNovDec'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FaceBookPages/Facebook _RegistrationValidation_OR/select_202420232022202120202019201820172016_7237a8'), 
    '2017', true)

WebUI.click(findTestObject('Object Repository/FaceBookPages/Facebook _RegistrationValidation_OR/input_sex'))

WebUI.click(findTestObject('Object Repository/FaceBookPages/Facebook _RegistrationValidation_OR/button_Sign Up'))

//WebUI.closeBrowser()


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

WebUI.navigateToUrl('https://en.wikipedia.org/wiki/Fish')

WebUI.click(findTestObject('Object Repository/Page_Fish - Wikipedia/a_whale shark'))

WebUI.click(findTestObject('Object Repository/Page_Whale shark - Wikipedia/span_Upload file_vector-icon mw-ui-icon-sea_526750'))

WebUI.setText(findTestObject('Object Repository/Page_Whale shark - Wikipedia/input_Search_search'), 'orca')

WebUI.click(findTestObject('Object Repository/Page_Fish - Wikipedia/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Orca - Wikipedia/img_86_mw-file-element'))

WebUI.click(findTestObject('Object Repository/Page_Orcas in Punta Norte Valdes Peninsula _613cf7/button_Mobile view_mw-mmv-fullscreen'))

WebUI.click(findTestObject('Object Repository/Page_Orcas in Punta Norte Valdes Peninsula _613cf7/button_Mobile view_mw-mmv-close'))

WebUI.closeBrowser()


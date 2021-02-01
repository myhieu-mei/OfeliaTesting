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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ofelia.vn/')

WebUI.click(findTestObject('Object Repository/Page_OFLIA Vietnam Official Store  OFLIA Vit Nam/div_Quick view_grid-product__secondary-imag_5ea12e'))

WebUI.click(findTestObject('Object Repository/Page_STUNNIN  OFLIA Vit Nam/button_Thm vo gi'))

WebUI.click(findTestObject('Object Repository/Page_STUNNIN  OFLIA Vit Nam/button_Thanh ton'))

WebUI.setText(findTestObject('Object Repository/Page_Thng tin khch hng - OFLIA Vit Nam - Thanh ton/input_Email_checkoutemail'), 
    Email)

WebUI.setText(findTestObject('Object Repository/Page_Thng tin khch hng - OFLIA Vit Nam - Thanh ton/input_H_checkoutshipping_addressfirst_name'), 
    Lastname)

WebUI.setText(findTestObject('Object Repository/Page_Thng tin khch hng - OFLIA Vit Nam - Thanh ton/input_Tn_checkoutshipping_addresslast_name'), 
    Firstname)

WebUI.setText(findTestObject('Object Repository/Page_Thng tin khch hng - OFLIA Vit Nam - Thanh ton/input_a ch_checkoutshipping_addressaddress1'), 
    Address)

WebUI.setText(findTestObject('Object Repository/Page_Thng tin khch hng - OFLIA Vit Nam - Thanh ton/input_Phng  x, Qun  huyn_checkoutshipping_a_3654e9'), 
    District)

WebUI.setText(findTestObject('Object Repository/Page_Thng tin khch hng - OFLIA Vit Nam - Thanh ton/input_TnhThnh ph_checkoutshipping_addresscity'), 
    City)

WebUI.setText(findTestObject('Object Repository/Page_Thng tin khch hng - OFLIA Vit Nam - Thanh ton/input_M bu chnh (in 70000)_checkoutshipping_f2f1d3'), 
    Code)

WebUI.setText(findTestObject('Object Repository/Page_Thng tin khch hng - OFLIA Vit Nam - Thanh ton/input_in thoi_checkoutshipping_addressphone'), 
    NumPhone)

WebUI.click(findTestObject('Object Repository/Page_Thng tin khch hng - OFLIA Vit Nam - Thanh ton/button_Tip tc n vn chuyn'))

WebUI.closeBrowser()


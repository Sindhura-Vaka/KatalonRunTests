import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

import static org.junit.Assert.*

import org.eclipse.persistence.internal.oxm.record.json.JSONParser.object_return as object_return
import org.junit.After as After
import org.junit.Test
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities as DesiredCapabilities
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

System.setProperty('webdriver.chrome.driver', 'C:/Users/Saraswathi/Documents/chrome driver/chromedriver_win32/chromedriver.exe')

ChromeOptions options = new ChromeOptions()

options.addExtensions(new File('C:/Users/Saraswathi/Downloads/ln-feature etensions/letznav_player.crx'))

DesiredCapabilities capabilities = new DesiredCapabilities()

capabilities.setCapability(ChromeOptions.CAPABILITY, options)

WebDriver driver = new ChromeDriver(capabilities)

DriverFactory.changeWebDriver(driver)

WebUI.maximizeWindow()

driver.get('http://111.93.27.187:8889/niku/nu')

WebUI.setText(findTestObject('PlayerTest/Login/input_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('PlayerTest/Login/input_passWord'), 'oXB/KjQMcvK4mXdX7k8g6Q==')

WebUI.click(findTestObject('PlayerTest/Login/input_ppm_login_button'))

WebUI.click(findTestObject('PlayerTest/Toggle and search/Click Player'))

WebUI.waitForElementVisible(findTestObject('PlayerTest/Toggle and search/Search Player'), 15)

WebUI.focus(findTestObject('PlayerTest/Toggle and search/Search Player'))

WebUI.setText(findTestObject('PlayerTest/Toggle and search/Search Player'), 'Project')

WebUI.click(findTestObject('PlayerTest/Toggle and search/objectttttt'))

Thread.sleep(1500)

WebUI.mouseOver(findTestObject('PlayerTest/ApplicationElements/span_Home PreviousNext Persona'))

WebUI.waitForElementVisible(findTestObject('PlayerTest/ApplicationElements/a_Projects'), 50)

WebUI.waitForElementVisible(findTestObject('PlayerTest/WorkFlow Balloons/Balloon Header'), 5)

WebUI.click(findTestObject('PlayerTest/ApplicationElements/a_Projects'))

WebUI.waitForElementVisible(findTestObject('PlayerTest/WorkFlow Balloons/Balloon Header'), 5)

WebUI.click(findTestObject('PlayerTest/ApplicationElements/button_New'))

WebUI.waitForElementVisible(findTestObject('PlayerTest/WorkFlow Balloons/Balloon Header'), 5)

WebUI.click(findTestObject('PlayerTest/WorkFlow Balloons/Next'))
WebUI.click(findTestObject('PlayerTest/WorkFlow Balloons/Next'))
WebUI.click(findTestObject('PlayerTest/WorkFlow Balloons/Next'))
WebUI.click(findTestObject('PlayerTest/WorkFlow Balloons/Next'))
WebUI.click(findTestObject('PlayerTest/WorkFlow Balloons/Next'))
WebUI.click(findTestObject('PlayerTest/ApplicationElements/button_Save'))
WebUI.click(findTestObject('PlayerTest/WorkFlow Balloons/Done'))


WebUI.closeBrowser()


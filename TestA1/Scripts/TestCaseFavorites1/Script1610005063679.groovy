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

Mobile.startApplication('D:\\key\\radio.apk', true)

'Waiting Application Start Finally'
Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

'Play Radio'
Mobile.tap(findTestObject('favorites/PlayOrPause'), 0)

'Waiting Play Radio'
WebUI.delay(5)

'Select Playlist'
Mobile.tap(findTestObject('favorites/Playlist'), 0)

'Waiting Load Playlist'
WebUI.delay(5)

'Select VOV3 Channel'
Mobile.tap(findTestObject('Object Repository/favorites/android.widget.TextView - VOV3'), 0)

'Waiting.. Load VOV3 Channel'
WebUI.delay(5)

'Play VOV3 Channel'
Mobile.tap(findTestObject('favorites/PlayOrPause'), 0)

'Loading... VOV3 Channel'
WebUI.delay(5)

'Click Favorites'
Mobile.tap(findTestObject('favorites/Love'), 0)

WebUI.delay(5)

'Select Playlist'
Mobile.tap(findTestObject('favorites/Playlist'), 0)

'Waiting Load Playlist'
WebUI.delay(5)

'Select SocTrang Channel'
Mobile.tap(findTestObject('favorites/SocTrangChannel'), 0)

'Waiting.. Load SocTrang Channel'
WebUI.delay(5)

'Play SocTrang Channel'
Mobile.tap(findTestObject('favorites/PlayOrPause'), 0)

'Loading... SocTrang Channel'
WebUI.delay(5)

'Click Favorite'
Mobile.tap(findTestObject('favorites/Love'), 0)

WebUI.delay(5)

'Select Playlist'
Mobile.tap(findTestObject('favorites/Playlist'), 0)

'Waiting Load Playlist'
WebUI.delay(5)

'Select Favorite Channel'
Mobile.tap(findTestObject('favorites/FavoritesChannel'), 0)

'Waiting Load Favorite Playlist'
WebUI.delay(5)

'Select Favorite VOV3 Channel '
Mobile.tap(findTestObject('Object Repository/favorites/android.widget.TextView - VOV1'), 0)

'Loading...'
WebUI.delay(5)

'Play'
Mobile.tap(findTestObject('favorites/PlayOrPause'), 0)

WebUI.delay(10)

Mobile.closeApplication()


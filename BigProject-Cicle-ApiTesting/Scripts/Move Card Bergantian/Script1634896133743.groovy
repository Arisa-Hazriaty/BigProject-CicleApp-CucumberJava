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

//Card A
WS.sendRequest(findTestObject('MoveCard', [('url') : GlobalVariable.url, ('boardId') : GlobalVariable.boardId,
	        ('draggableIdSource') : '616d85a31bb5417a53df3ac4'
            , ('type') : GlobalVariable.type, ('droppableIdSource') : GlobalVariable.dropabbleIdSource, ('reason') : GlobalVariable.reason
            , ('mode') : GlobalVariable.mode, ('droppableIdDestination') : GlobalVariable.dropabbleIdDestination, ('indexSource') : 0
            , ('indexDestination') : 0]))

//Card B
WS.sendRequest(findTestObject('MoveCard', [('url') : GlobalVariable.url, ('boardId') : GlobalVariable.boardId, ('draggableIdSource') : '616d859c1bb54170dfdf3aaa'
            , ('type') : GlobalVariable.type, ('droppableIdSource') : GlobalVariable.dropabbleIdSource, ('reason') : GlobalVariable.reason
            , ('mode') : GlobalVariable.mode, ('droppableIdDestination') : GlobalVariable.dropabbleIdDestination, ('indexSource') : 0
            , ('indexDestination') : 1]))

//Card C
WS.sendRequest(findTestObject('MoveCard', [('url') : GlobalVariable.url, ('boardId') : GlobalVariable.boardId, ('draggableIdSource') : '616d86861bb5417442df3ccb'
			, ('type') : GlobalVariable.type, ('droppableIdSource') : GlobalVariable.dropabbleIdSource, ('reason') : GlobalVariable.reason
			, ('mode') : GlobalVariable.mode, ('droppableIdDestination') : GlobalVariable.dropabbleIdDestination, ('indexSource') : 0
			, ('indexDestination') : 2]))

//Card D
WS.sendRequest(findTestObject('MoveCard', [('url') : GlobalVariable.url, ('boardId') : GlobalVariable.boardId, ('draggableIdSource') : '61726708bc729e32a7752ce5'
	, ('type') : GlobalVariable.type, ('droppableIdSource') : GlobalVariable.dropabbleIdSource, ('reason') : GlobalVariable.reason
	, ('mode') : GlobalVariable.mode, ('droppableIdDestination') : GlobalVariable.dropabbleIdDestination, ('indexSource') : 0
	, ('indexDestination') : 3]))

//Card E
WS.sendRequest(findTestObject('MoveCard', [('url') : GlobalVariable.url, ('boardId') : GlobalVariable.boardId, ('draggableIdSource') : '6172671abc729e5011752e14'
	, ('type') : GlobalVariable.type, ('droppableIdSource') : GlobalVariable.dropabbleIdSource, ('reason') : GlobalVariable.reason
	, ('mode') : GlobalVariable.mode, ('droppableIdDestination') : GlobalVariable.dropabbleIdDestination, ('indexSource') : 0
	, ('indexDestination') : 4]))

//Card F
WS.sendRequest(findTestObject('MoveCard', [('url') : GlobalVariable.url, ('boardId') : GlobalVariable.boardId, ('draggableIdSource') : '61726725bc729e9173752e35'
	, ('type') : GlobalVariable.type, ('droppableIdSource') : GlobalVariable.dropabbleIdSource, ('reason') : GlobalVariable.reason
	, ('mode') : GlobalVariable.mode, ('droppableIdDestination') : GlobalVariable.dropabbleIdDestination, ('indexSource') : 0
	, ('indexDestination') : 5]))

//Card G
WS.sendRequest(findTestObject('MoveCard', [('url') : GlobalVariable.url, ('boardId') : GlobalVariable.boardId, ('draggableIdSource') : '61726779bc729e41fd7530b1'
	, ('type') : GlobalVariable.type, ('droppableIdSource') : GlobalVariable.dropabbleIdSource, ('reason') : GlobalVariable.reason
	, ('mode') : GlobalVariable.mode, ('droppableIdDestination') : GlobalVariable.dropabbleIdDestination, ('indexSource') : 0
	, ('indexDestination') : 6]))

//Card H
WS.sendRequest(findTestObject('MoveCard', [('url') : GlobalVariable.url, ('boardId') : GlobalVariable.boardId, ('draggableIdSource') : '61726782bc729e5eb67530d2'
	, ('type') : GlobalVariable.type, ('droppableIdSource') : GlobalVariable.dropabbleIdSource, ('reason') : GlobalVariable.reason
	, ('mode') : GlobalVariable.mode, ('droppableIdDestination') : GlobalVariable.dropabbleIdDestination, ('indexSource') : 0
	, ('indexDestination') : 7]))

//Card I
WS.sendRequest(findTestObject('MoveCard', [('url') : GlobalVariable.url, ('boardId') : GlobalVariable.boardId, ('draggableIdSource') : '6172678abc729e8da7753180'
	, ('type') : GlobalVariable.type, ('droppableIdSource') : GlobalVariable.dropabbleIdSource, ('reason') : GlobalVariable.reason
	, ('mode') : GlobalVariable.mode, ('droppableIdDestination') : GlobalVariable.dropabbleIdDestination, ('indexSource') : 0
	, ('indexDestination') : 8]))

//Card J
WS.sendRequest(findTestObject('MoveCard', [('url') : GlobalVariable.url, ('boardId') : GlobalVariable.boardId, ('draggableIdSource') : '61726791bc729e34b27531a1'
	, ('type') : GlobalVariable.type, ('droppableIdSource') : GlobalVariable.dropabbleIdSource, ('reason') : GlobalVariable.reason
	, ('mode') : GlobalVariable.mode, ('droppableIdDestination') : GlobalVariable.dropabbleIdDestination, ('indexSource') : 0
	, ('indexDestination') : 9]))
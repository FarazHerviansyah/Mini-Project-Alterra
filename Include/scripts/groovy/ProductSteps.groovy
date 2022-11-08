import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class ProductSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Post call to https://alta-shop.herokuapp.com/api/products")
	def getCalltoUrlAddNewProduct() {
		println("\n Post call to https://alta-shop.herokuapp.com/api/products")
		WS.sendRequest(findTestObject('Products/AddANewProduct'))
	}

	@Given("Get call to https://alta-shop.herokuapp.com/api/products/584")
	def getCalltoUrlGetProcutbyID() {
		println("\n Get call to https://alta-shop.herokuapp.com/api/products/584")
		WS.sendRequest(findTestObject('Products/UserGetProductByID'))
	}
	
	@Given("Get call to https://alta-shop.herokuapp.com/api/products/1")
	def getCalltoUrlGetProcutbyIDUsingInvalidIDcaller() {
		println("\n Get call to https://alta-shop.herokuapp.com/api/products/1")
		WS.sendRequest(findTestObject('Products/NegUserGetProductByID_UsingInvalidID-caller'))
	}
	
	@Then("I receive Invalid HTTP response code 404")
	def receiveInvalidResponse404() {
		println("I receive Invalid HTTP response code 404")
		WS.verifyResponseStatusCode(response, 404)
	}
	
	@Given("Post call to https://alta-shop.herokuapp.com/api/products/582/ratings")
	def getCalltoUrlPostAssignProductRating() {
		println("\n Post call to https://alta-shop.herokuapp.com/api/products/582/ratings")
		WS.sendRequest(findTestObject('Products/UserAssignAProductRating'))
	}
	
	@Given("Post call to https://alta-shop.herokuapp.com/api/products/510/ratings")
	def getCalltoUrlPostAssignProductRatingWithoutLoginAccount() {
		println("\n Post call to https://alta-shop.herokuapp.com/api/products/510/ratings")
		WS.sendRequest(findTestObject('Products/NegUserAssignAProductRating_WithoutLoginAccount'))
	}
	
	@Given("Get call to https://alta-shop.herokuapp.com/api/products/582/ratings")
	def getCalltoUrlGetProductRating() {
		println("\n Get call to https://alta-shop.herokuapp.com/api/products/582/ratings")
		WS.sendRequest(findTestObject('Products/ProductRating'))
	}
	
	@Given("Post call to https://alta-shop.herokuapp.com/api/products/582/comments")
	def getCalltoUrlPostCreateACommentForProduct() {
		println("\n Post call to https://alta-shop.herokuapp.com/api/products/582/comments")
		WS.sendRequest(findTestObject('Products/UserCreateACommentForProduct'))
	}
	
	@Given("Post call to https://alta-shop.herokuapp.com/api/products/510/comments")
	def getCalltoUrlPostCreateACommentForProductWithoutLoginAccount() {
		println("\n Post call to https://alta-shop.herokuapp.com/api/products/510/comments")
		WS.sendRequest(findTestObject('Products/NegUserCreateACommentForPoduct_WithoutLoginAccount'))
	}
	
	@Given("Get call to https://alta-shop.herokuapp.com/api/products/510/comments")
	def getCalltoUrlGetSeeProducttComment() {
		println("\n Get call to https://alta-shop.herokuapp.com/api/products/510/comments")
		WS.sendRequest(findTestObject('Products/ProductComment'))
	}
	
	@Given("Get call to https://alta-shop.herokuapp.com/api/productss")
	def getCalltoUrlGetSeeAllProduct() {
		println("\n Get call to https://alta-shop.herokuapp.com/api/products")
		WS.sendRequest(findTestObject('Products/AllProduct'))
	}
	
	@Given("Delete call to https://alta-shop.herokuapp.com/api/products/510")
	def getCalltoUrlDeleteAProduct() {
		println("\n Delete call to https://alta-shop.herokuapp.com/api/products/510")
		WS.sendRequest(findTestObject('Products/UserDeleteAProduct'))
	}
	
	
}
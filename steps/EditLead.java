package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLead extends BaseClass{
	
	

	@Then("Click on Find Leads")
	public void clickOnFindLeads() {
		driver.findElement(By.linkText("Find Leads")).click();

	}
	@Given("Click Phone Button")
	public void clickPhoneButton() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();

	}
	@Given("Enter phone number as {string}")
	public void enterPhoneNumber(String phonenumber) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phonenumber);
	}
	@When("Click on Find Leads button")
	public void clickOnFindLeadsButton() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}

	@Then("Click on first lead from the search result")
	public void clickOnFirstLeadFromTheSearchResult() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	@Given("click on Edit Button")
	public void clickOnEditButton() {
		driver.findElement(By.linkText("Edit")).click();
	}
	@Given("update the company name")
	public void updateTheCompanyName() {
		WebElement element = driver.findElement(By.id("updateLeadForm_companyName"));
		element.clear();
		element.sendKeys("TCS");
		
	}
	@When("Click on update button")
	public void clickOnUpdateButton() {
		driver.findElement(By.name("submitButton")).click();
		System.out.println("Lead is updated sucessfully");

	}

}

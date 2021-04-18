package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DeleteLead extends BaseClass{
	
	@Given("Enter phone number")
	public void enterPhoneNumber() {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9");
	}

	
	@Then("Click on delete button")
	public void clickOnDeleteButton() {
		driver.findElement(By.linkText("Delete")).click();
		System.out.println("The lead is successfully deleted");
	}


}

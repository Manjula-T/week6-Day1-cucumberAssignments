package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DuplicateLead extends BaseClass{

@Given("click on Duplicate Button")
public void clickOnDuplicateButton() {
	driver.findElement(By.linkText("Duplicate Lead")).click();
    
}
@When("Click on Create Lead Button")
public void clickOnCreateLeadButton() {
	driver.findElement(By.name("submitButton")).click();
	System.out.println("Duplicate Lead is created sucessfully");
  
}

}

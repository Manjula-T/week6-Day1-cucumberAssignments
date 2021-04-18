package steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MergeLead extends BaseClass {

	@Then("Click on Merge Leads")
	public void clickOnMergeLeads() {
		driver.findElement(By.linkText("Merge Leads")).click();
	}
	@Then("Click on Find Lead icon")
	public void clickOnFindLeadIcon() {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
	}
	@Then("Go to child1 window")
	public void goToChild1Window() {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
	}
	@Then("Enter the first name as {string}")
	public void enterTheFirstNameAs(String firstname) {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstname);
	}
	
	
	@Then("click on the lead ID1")
	public void clickOnTheLeadID() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	@Then("Go to parent1 window")
	public void goToParent1Window() {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(0));
	}
	@Given("Click on to Lead icon")
	public void clickOnToLeadIcon() {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	}
	@Given("Go to child2 window")
	public void goToChild2Window() {
	
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
	}
	@Given("Enter the Second name as {string}")
	public void enterTheSecondNameAs(String secondname) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(secondname);
		//driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
	}

	
	 @Given("click on the lead ID2") 
	 public void clickOnTheLeadID2() { 
		 driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	 }
	
	@When("Go to parent2 window")
	public void goToParent2Window() {
		
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(0));
	}
	@Then("click on Merge button")
	public void clickOnMergeButton() {
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
	}
	@Then("accept the alert")
	public void acceptTheAlert() {
	
		driver.switchTo().alert().accept();
		System.out.println("Leads are merged sucessfully");
	}

}

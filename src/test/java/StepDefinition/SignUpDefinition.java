package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import Hooks.Hooks1;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUpDefinition {
	WebDriver driver=Hooks1.driver;
	@Given("^Admin is on the login page of Real Estate$")
	public void admin_is_on_the_login_page_of_real_estate() {
		try {
			String expected = "My Profile";
			String actual = driver.findElement(By.xpath("//h2[contains(text(),'My Profile')]")).getText();
			Assert.assertEquals(actual, expected);
			
		} 
		catch (Exception e) 
		{ 
			System.out.println (e);
			Assert.fail();
		}
	}
	
	 
	    

	@When("^admin will enter the UserId \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void admin_will_enter_the_UserId_and_password(String arg1, String arg2) {
		
		try {
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@name='log']")).sendKeys(arg1);
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(arg2);
		}
		catch (Exception e)
		{
			System.out.println(e);
			Assert.fail();
		}
	
	    
	}

	@When("^admin will click on the login button$")
	public void admin_will_click_on_the_login_button() {
		try {
			driver.findElement(By.xpath("//input[@name='login']")).click();
		}
		catch (Exception e)
		{
			System.out.println(e);
			Assert.fail();
		}
	    
	    
	}

	@When("^will be redirected to the the dashboard of the real estate page$")
	public void will_be_redirected_to_the_the_dashboard_of_the_real_estate_page() {
		
		try {
			String expected = "Dashboard";
			String actual = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).getText();
			Assert.assertEquals(actual, expected);
			
		} 
		catch (Exception e) 
		{
			System.out.println (e);
			Assert.fail();
		}
	}

	@When("^will click on the Users$")
	public void will_click_on_the_Users() {
		
		try {
			driver.findElement(By.xpath("//div[contains(text(),'Users')]")).click();
		}
		catch (Exception e)
		{
			System.out.println(e);
			Assert.fail();
		}
		
	}

	@When("^will click on the Your Profile$")
	public void will_click_on_the_Your_Profile() {
		
		try {
			driver.findElement(By.xpath("//a[contains(text(),'Your Profile')]")).click();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
	    
	}

	@Then("^admin will be redirected to the Your Profile page$")
	public void admin_will_be_redirected_to_the_Your_Profile_page() {
		
		try {
			String expected = "Profile";
			String actual = driver.findElement(By.xpath("//h1[contains(text(),'Profile')]")).getText();
			Assert.assertEquals(actual, expected);
			
		} 
		catch (Exception e) 
		{ 
			System.out.println (e);
			Assert.fail();
		}
	    
	}
	
	@When("^user will enter the value under Personal Options$")
	public void user_will_enter_the_value_under_Personal_Options() {
		
		try {
			String expected = "Personal Options";
			String actual = driver.findElement(By.xpath("//h2[contains(text(),'Personal Options')]")).getText();
			Assert.assertEquals(actual, expected);
			
		} 
		catch (Exception e) 
		{ 
			System.out.println (e);
			Assert.fail();
		}
	    
	}
	
	@When("^user will click on Visual Editor$")
	public void user_will_click_on_Visual_Editor()  {
		try {
			driver.findElement(By.xpath("//input[@id='rich_editing']")).click();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

	@When("^user will click on Syntax Highlighting$")
	public void user_will_click_on_Syntax_Highlighting()  {
		try {
			driver.findElement(By.xpath("//input[@id='syntax_highlighting']")).click();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	@When("^user will click on Admin Color Scheme$")
	public void user_will_click_on_Admin_Color_Scheme()  {
		try {
			driver.findElement(By.xpath("//input[@id='admin_color_midnight']")).click();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

	@When("^user will click on Keyboard Shortcuts$")
	public void user_will_click_on_Keyboard_Shortcuts()  {
		try {
			driver.findElement(By.xpath("//input[@id='comment_shortcuts']")).click();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

	@When("^user will click on Toolbar$")
	public void user_will_click_on_Toolbar()  {
		try {
			driver.findElement(By.xpath("//input[@id='admin_bar_front']")).click();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

	
	
	@When("^user enters the value under Name section$")
	public void user_enters_the_value_under_Name_section() {
		
		try {
			String expected = "Name";
			String actual = driver.findElement(By.xpath("//h2[contains(text(),'Name')]")).getText();
			Assert.assertEquals(actual, expected);
			
		} 
		catch (Exception e) 
		{ 
			System.out.println (e);
			Assert.fail();
		}
	    
	}
	
	
	@And("^user will check if the Username is \"([^\"]*)\"$")
	public void user_will_check_if_the_Username_is(String arg1)  {
		
		try {
			Boolean UserName = driver.findElement(By.xpath("//input[@id='user_login']")).isDisplayed();
			if (UserName == true) {
			}
		}
		catch (Exception e)
		{
			System.out.println (e);
			Assert.fail();
		}
	    
	    
	}


	@And("^user will write \"([^\"]*)\" in the First Name place$")
	public void user_will_write_in_the_First_Name_place(String arg1) {
		try {
			driver.findElement(By.xpath("//input[@id='first_name']")).clear();
			driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(arg1);
			Thread.sleep(1000);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		   
	}

	@When("^user will write \"([^\"]*)\" in the Last Name place$")
	public void user_will_write_in_the_Last_Name_place(String arg1)  {
		try {
			driver.findElement(By.xpath("//input[@id='last_name']")).clear();
			driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys(arg1);
			Thread.sleep(1000);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	   
	    
	}

	@When("^user will write \"([^\"]*)\" in the Nickname place$")
	public void user_will_write_in_the_Nickname_place(String arg1)  {
		try {
			driver.findElement(By.xpath("//input[@id='nickname']")).clear();
			driver.findElement(By.xpath("//input[@id='nickname']")).sendKeys(arg1);
			Thread.sleep(1000);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	    
	    
	}
	
	@When("^user will select from \"([^\"]*)\" in Display name publicly as$")
	public void user_will_select_from_in_Display_name_publicly_as(String arg1)  {
		
		try {
			Select obj=new Select(driver.findElement(By.id("display_name")));
			obj.selectByVisibleText(arg1);
			
			 //driver.findElement(By.xpath("//*[@id=\"display_name\"]")).click();
			 //driver.findElement(By.xpath("//option[contains(text(),'simran gupta')]")).click();
			 
			Thread.sleep(1000);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	    
	}
	
	
	
	
	

	@When("^user enters the value under Contact Info$")
	public void user_enters_the_value_under_Contact_Info() {
		try {
			String expected = "Contact Info";
			String actual = driver.findElement(By.xpath("//h2[contains(text(),'Contact Info')]")).getText();
			Assert.assertEquals(actual, expected);
			
		} 
		catch (Exception e) 
		{ 
			System.out.println (e);
			Assert.fail();
		}
	    
	}

	@When("^user will write \"([^\"]*)\" in Email$")
	public void user_will_write_in_Email(String arg1)  {
		
		try {
			driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(arg1);
			Thread.sleep(1000);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
	}
	

	@When("^user will write \"([^\"]*)\" in Website$")
	public void user_will_write_in_Website(String arg1)  {
		try {
			driver.findElement(By.xpath("//*[@id=\"url\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"url\"]")).sendKeys(arg1);
			Thread.sleep(1000);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	@When("^user will write \"([^\"]*)\" in Phone$")
	public void user_will_write_in_Phone(String arg1)  {
		try {
			driver.findElement(By.xpath("//*[@id=\"phone\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys(arg1);
			Thread.sleep(1000);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	    
	}

	@When("^user will write \"([^\"]*)\" in Twitter$")
	public void user_will_write_in_Twitter(String arg1)  {
		try {
			driver.findElement(By.xpath("//*[@id=\"twitter\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"twitter\"]")).sendKeys(arg1);
			Thread.sleep(1000);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	    
	}

	@When("^user will write \"([^\"]*)\" in Facebook URL$")
	public void user_will_write_in_Facebook_URL(String arg1)  {
		try {
			driver.findElement(By.xpath("//*[@id=\"facebook\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"facebook\"]")).sendKeys(arg1);
			Thread.sleep(1000);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	
	}
	
	@When("^user will write \"([^\"]*)\" in Linkedin$")
	public void user_will_write_in_Linkedin(String arg1){
		
		try {
			driver.findElement(By.xpath("//*[@id=\"linkedin\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"linkedin\"]")).sendKeys(arg1);
			Thread.sleep(3000);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	    
	}

	@When("^user enters the value under About Yourself$")
	public void user_enters_the_value_under_About_Yourself()  {
		try {
			String expected = "About Yourself";
			String actual = driver.findElement(By.xpath("//*[@id=\"your-profile\"]/h2[4]")).getText();
			Assert.assertEquals(actual, expected);
			
		} 
		catch (Exception e) 
		{ 
			System.out.println (e);
			Assert.fail();
		}
	}

	@When("^user will write \"([^\"]*)\" in Biographical Info$")
	public void user_will_write_in_Biographical_Info(String arg1) {
		try {
			driver.findElement(By.xpath("//*[@id=\"description\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"description\"]")).sendKeys(arg1);
			Thread.sleep(3000);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

	}
	
	@When("^user will click on Gravatar on Profile Picture field$")
	public void user_will_click_on_Gravatar_on_Profile_Picture_field()  {
		try {
			driver.findElement(By.xpath("//a[contains(text(),'Gravatar')]")).click();
			driver.navigate().back();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	@When("^user will write \"([^\"]*)\" in New Password$")
	public void user_will_write_in_New_Password(String arg1) {
	    
		try {
			driver.findElement(By.xpath("//button[contains(text(),'Generate Password')]")).click();
			driver.findElement(By.xpath("//tbody/tr[@id='password']/td[1]/div[1]/button[1]/span[1]")).click();
			driver.findElement(By.xpath("//input[@id='pass1']")).clear();
			driver.findElement(By.xpath("//input[@id='pass1']")).sendKeys(arg1);
			Thread.sleep(3000);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

	}
	
	@When("^user will click on Log Out Everywhere Else$")
	
	 public void user_will_click_on_Log_Out_Everywhere_Else() {
	  
		try {
			driver.findElement(By.xpath("//button[@id='destroy-sessions']")).click();
			driver.findElement(By.xpath("//p[contains(text(),'You are now logged out everywhere else.')]")).isDisplayed();
			Thread.sleep(2000);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	 
	 }


	@When("^user will enter the value under Realteo Avatar$")
	public void user_will_enter_the_value_under_Realteo_Avatar()  {
		try {
			String expected = "Realteo Avatar";
			String actual = driver.findElement(By.xpath("//*[@id=\"your-profile\"]/h3[1]")).getText();
			Assert.assertEquals(actual, expected);
			
		} 
		catch (Exception e) 
		{ 
			System.out.println (e);
			Assert.fail();
		}
	    
	}

	@When("^user will write \"([^\"]*)\" in Agent Avatar$")
	public void user_will_write_in_Agent_Avatar(String arg1)  {
		try {
			driver.findElement(By.xpath("//*[@id=\"agent-avatar\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"agent-avatar\"]")).sendKeys(arg1);
			Thread.sleep(1000);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	   
	}

	@When("^user will check for Extra profile information$")
	public void user_will_check_for_Extra_profile_information()  {
		try {
			String expected = "Extra profile information";
			String actual = driver.findElement(By.xpath("//*[@id=\"your-profile\"]/h3[2]")).getText();
			Assert.assertEquals(actual, expected);
			
		} 
		catch (Exception e) 
		{ 
			System.out.println (e);
			Assert.fail();
		}
	}

	@When("^user will write \"([^\"]*)\" in Title$")
	public void user_will_write_in_Title(String arg1) {
		try {
			driver.findElement(By.xpath("//*[@id=\"agent-title\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"agent-title\"]")).sendKeys(arg1);
			Thread.sleep(1000);
		}
		catch (Exception e)
		{
			System.out.println(e);
		} 
	}

	@When("^user will check for Customer billing address$")
	public void user_will_check_for_Customer_billing_address()  {
		try {
			String expected = "Customer billing address";
			String actual = driver.findElement(By.xpath("//*[@id=\"your-profile\"]/h2[6]")).getText();
			Assert.assertEquals(actual, expected);
			
		} 
		catch (Exception e) 
		{ 
			System.out.println (e);
			Assert.fail();
		}
	    
	}

	@When("^user will write \"([^\"]*)\" in First Name field$")
	public void user_will_write_in_First_Name_field(String arg1)  {
		try {
			driver.findElement(By.xpath("//*[@id=\"billing_first_name\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"billing_first_name\"]")).sendKeys(arg1);
			Thread.sleep(1000);
		}
		catch (Exception e)
		{
			System.out.println(e);
		} 
	}

	@When("^user will write \"([^\"]*)\" in Last Name field$")
	public void user_will_write_in_Last_Name_field(String arg1) {
		try {
			driver.findElement(By.xpath("//*[@id=\"billing_last_name\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"billing_last_name\"]")).sendKeys(arg1);
			Thread.sleep(1000);
		}
		catch (Exception e)
		{
			System.out.println(e);
		} 
 
	}

	@When("^user will write \"([^\"]*)\" in Company field$")
	public void user_will_write_in_Company_field(String arg1) {
		try {
			driver.findElement(By.xpath("//*[@id=\"billing_company\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"billing_company\"]")).sendKeys(arg1);
			Thread.sleep(1000);
		}
		catch (Exception e)
		{
			System.out.println(e);
		} 
	    
	}

	@When("^user will write \"([^\"]*)\" in Address line1$")
	public void user_will_write_in_Address_line1(String arg1) {
		try {
			driver.findElement(By.xpath("//*[@id=\"billing_address_1\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"billing_address_1\"]")).sendKeys(arg1);
			Thread.sleep(1000);
		}
		catch (Exception e)
		{
			System.out.println(e);
		} 
	}
	
	@When("^user will write \"([^\"]*)\" in Address line2$")
	public void user_will_write_in_Address_line2(String arg1) {
		try {
			driver.findElement(By.xpath("//*[@id=\"billing_address_2\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"billing_address_2\"]")).sendKeys(arg1);
			Thread.sleep(1000);
		}
		catch (Exception e)
		{
			System.out.println(e);
		} 
	}

	@When("^user will write \"([^\"]*)\" in City field$")
	public void user_will_write_in_City_field(String arg1)  {
		try {
			driver.findElement(By.xpath("//*[@id=\"billing_city\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"billing_city\"]")).sendKeys(arg1);
			Thread.sleep(3000);
		}
		catch (Exception e)
		{
			System.out.println(e);
		} 
	   
	}

	@When("^user will write \"([^\"]*)\" in Postcode / ZIP$")
	public void user_will_write_in_Postcode_ZIP(String arg1)  {
		try {
			driver.findElement(By.xpath("//*[@id=\"billing_postcode\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"billing_postcode\"]")).sendKeys(arg1);
			Thread.sleep(3000);
		}
		catch (Exception e)
		{
			System.out.println(e);
		} 

	}

	@When("^user will select \"([^\"]*)\" from Country$")
	public void user_will_select_from_Country(String arg1)  {
		try {
			Select obj=new Select(driver.findElement(By.id("select2-billing_country-container")));
			obj.deselectByVisibleText(arg1);
			//driver.findElement(By.xpath("//html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[3]/form[1]/table[8]/tbody[1]/tr[8]/td[1]/span[1]/span[1]/span[1]/span[1]")).click();
			//driver.findElement(By.xpath("/html[1]/body[1]/span[1]/span[1]/span[2]/ul[1]/li[104]")).click();
			Thread.sleep(2000);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	   
	}

	
	  @When("^user will select \"([^\"]*)\" from State / County$") 
	  public void user_will_select_from_State_County(String arg1) {
	  
	  try { 
		  Select obj=new Select(driver.findElement(By.id("select2-billing_state-container")));
		  obj.deselectByVisibleText(arg1);
		  //driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[3]/form[1]/table[8]/tbody[1]/tr[9]/td[1]/span[1]/span[1]/span[1]/span[1]")).click(); 
		  //driver.findElement(By.xpath("/html[1]/body[1]/span[1]/span[1]/span[2]/ul[1]/li[5]")).click();

	  Thread.sleep(3000); 
	  } 
	  catch (Exception e) 
	  {
	  System.out.println(e); 
	  }
	 
	    
	    
	}

	@When("^user will write \"([^\"]*)\" in Phone field$")
	public void user_will_write_in_Phone_field(String arg1) {
		try {
			driver.findElement(By.xpath("//input[@id='billing_phone']")).clear();
			driver.findElement(By.xpath("//input[@id='billing_phone']")).sendKeys(arg1);
			Thread.sleep(2000);
		}
		catch (Exception e)
		{
			System.out.println(e);
		} 
	}

	@When("^user will write \"([^\"]*)\" in Email address$")
	public void user_will_write_in_Email_address(String arg1)  {
		try {
			driver.findElement(By.xpath("//input[@id='billing_email']")).clear();
			driver.findElement(By.xpath("//input[@id='billing_email']")).sendKeys(arg1);
			Thread.sleep(2000);
		}
		catch (Exception e)
		{
			System.out.println(e);
		} 
	}

	@When("^user will click Copy$")
	public void user_will_click_Copy()  {
	try {
		driver.findElement(By.xpath("//*[@id=\"copy_billing\"]")).click();
		Thread.sleep(2000);
	}
	catch (Exception e)
	{
		System.out.println(e);
	}
	}
	
	
	 

	
	@Then("^will click on Update Profile$")
	public void will_click_on_Update_Profile() {
		
			
			try {
				
				driver.findElement(By.xpath("//input[@id='submit']")).click();
				String expected = "Profile ‹ Real Estate — WordPress";
				String actual = driver.getTitle();
				Assert.assertEquals(actual, expected);
				System.out.println ("Its working");
				
			} 
			catch (Exception e) 
			{ 
				System.out.println (e);
				Assert.fail();
			}
	}
}
		    
		




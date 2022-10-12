package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinitions {
	public static WebDriver driver;
	@Given("^user launch application$")
	public void user_launch_application() throws Throwable {
		

driver.get("https://google.com");
		System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://staging.x0pa.ai/app/roboroy");  
        driver.findElement(By.id("hs-eu-confirmation-button")).click();
        driver.findElement(By.linkText("Candidate Login")).click();   
	}

	@When("^user enter valid credentials$")
	public void user_enter_valid_credentials() throws Throwable
	{
		driver.findElement(By.name("username")).sendKeys("paul@trainingqa.com");
		driver.findElement(By.name("password")).sendKeys("XPAStag0");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='mb-2']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(4000);
		}

	@When("^Close Browser$")
	public void close_Browser() throws InterruptedException 
	{
		driver.close();
	}    

	@When("^user click on logout$")
	public void user_click_on_logout() throws InterruptedException 
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@aria-label='Logout']")).click();
		Thread.sleep(5000);
	}

	@When("^User clicks on Jobs Menu$")
	public void user_clicks_on_Jobs_Menu() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/section/div[1]/div/header/nav/ul/li[2]/a/span/b")).click();
				    
	}

	@When("^select create new job section$")
	public void select_create_new_job_section() throws InterruptedException 
	{
		 driver.findElement(By.linkText("Create New Job")).click();
		 Thread.sleep(2000);
	}
	@When("^click on Start button of form$")
	public void click_on_Start_button_of_form() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[@class='mt-3']//child::button[contains(text(),'Start')]")).click(); 
		Thread.sleep(3000);
	}

@When("^choose office location$")
public void choose_office_location() throws Throwable {
        WebElement OfficeAddress=driver.findElement(By.xpath("//input[@id='react-select-3-input']"));
	    OfficeAddress.sendKeys("Hyderabad");
	    Thread.sleep(2000);
		OfficeAddress.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		OfficeAddress.sendKeys(Keys.ENTER);
		Thread.sleep(2000);  
		driver.findElement(By.xpath("//div[@class='ml-2']//child::button[contains(text(),'Submit')]")).click();
	}
   @When("^click on Add New Office button to add new office Address$")
	public void click_on_Add_New_Office_button_to_add_new_office_Address() throws InterruptedException 
    {
	    WebElement addnewoffice=driver.findElement(By.xpath("//button[contains(text(),'Add New office')]"));
	    addnewoffice.click();
		driver.findElement(By.id("addressLine1")).sendKeys("peaceful city");
		Thread.sleep(2000);
		WebElement city=driver.findElement(By.id("react-select-12-input"));
		city.sendKeys("Hyderabad");
		Thread.sleep(3000);
		city.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(5000);
		city.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		Select country=new Select(driver.findElement(By.id("country")));
		country.selectByVisibleText("India");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='app-container']/div[1]/div/div[3]/div/section/div/div/div[4]/div/div[3]/button[2]")).click();
	
	}

	@When("^add Job Title$")
	public void add_Job_Title() throws Throwable
	{
		WebElement jobtitle=driver.findElement(By.xpath("//input[@placeholder='Job Title']"));
		jobtitle.sendKeys("Java Developers");
		Thread.sleep(2000);    
	}

	@When("^select Job Status$")
	public void select_Job_Status() throws Throwable
	{
		WebElement jobstatus=driver.findElement(By.xpath("//input[@id='react-select-4-input']"));
		jobstatus.sendKeys("Both");
		jobstatus.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		jobstatus.sendKeys(Keys.ENTER);
		Thread.sleep(2000);  
	}

	@When("^Select Country Location$")
	public void select_Country_Location() throws Throwable 
	{
		WebElement countrylocation=driver.findElement(By.xpath("//input[@id='react-select-5-input']"));
		countrylocation.sendKeys("india");
		countrylocation.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		countrylocation.sendKeys(Keys.ENTER);
		Thread.sleep(2000);   
	}

	@When("^Select City location$")
	public void select_City_location() throws Throwable
	{
		WebElement citylocation=driver.findElement(By.id("react-select-6-input"));
		citylocation.sendKeys("Hyderabad");
		citylocation.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(5000);
		citylocation.sendKeys(Keys.ENTER);
		Thread.sleep(3000);   
	}

	@When("^add skills$")
	public void add_skills() throws Throwable 
	{
		WebElement skills=driver.findElement(By.id("react-select-7-input"));
		skills.sendKeys("java");
		skills.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		skills.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		skills.sendKeys("sql");
		skills.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		skills.sendKeys(Keys.ENTER);
		Thread.sleep(4000);    
	}

	@When("^add Qualification$")
	public void add_Qualification() throws Throwable
	{
		 WebElement qualification=driver.findElement(By.xpath("//input[@id='react-select-8-input']"));
	     qualification.sendKeys("b");
	     qualification.sendKeys(Keys.ARROW_DOWN);
	     Thread.sleep(2000);
	     qualification.sendKeys(Keys.ENTER);
	     Thread.sleep(2000);	
	}

	@When("^add job type$")
	public void add_job_type() throws Throwable {
		WebElement jobtype=driver.findElement(By.xpath("//input[@id='react-select-9-input']"));
		jobtype.sendKeys("per");
	    jobtype.sendKeys(Keys.ARROW_DOWN);
	    Thread.sleep(2000);
	    jobtype.sendKeys(Keys.ENTER);
	    Thread.sleep(2000);
	}

	@When("^select minimum experience$")
	public void select_minimum_experience() throws Throwable
	{
	driver.findElement(By.xpath("//input[@id='minExp']")).sendKeys("3");;
	Thread.sleep(2000);	
	}

	@When("^select maximum experience$")
	public void select_maximum_experience() throws Throwable
	{
	driver.findElement(By.id("maxExp")).sendKeys("5");
	Thread.sleep(2000);	
	}
	@When("^choose Employment type$")
	public void choose_Employment_type() throws Throwable 
	{
		WebElement emptype=driver.findElement(By.xpath("//input[@id='react-select-10-input']"));
		emptype.sendKeys("full time");
		emptype.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		emptype.sendKeys(Keys.ENTER);
		Thread.sleep(2000);   
	}

	@When("^add no of vacancies$")
	public void add_no_of_vacancies() throws Throwable 
	{
		WebElement vacancies=driver.findElement(By.xpath("//input[@id='noOfVacancies']"));
		vacancies.click();
		Thread.sleep(2000);
		vacancies.sendKeys("15");
		Thread.sleep(2000);
	}

	@When("^add Job Description$")
	public void add_Job_Description() throws Throwable 
	{
		driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[1]")).sendKeys("writing test cases,Exploratory Testing,Automation Testing");
		Thread.sleep(2000);   
	}

	@When("^add Job Requirements$")
	public void add_Job_Requirements() throws Throwable {
		driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys("candidates should join immediately & candidates should have knowledge on selenium and core java");
		Thread.sleep(2000);  
		driver.findElement(By.xpath("//div[@class='ml-2']//child::button[contains(text(),'Submit')]")).click();
	}
	@When("^click on Add Collaborator Button$")
	public void click_on_Add_Collaborator_Button() throws InterruptedException 
	{
		Thread.sleep(2000);	
	 driver.findElement(By.xpath("/html/body/section/div[1]/div/div[3]/div/section/div/div/div[4]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div/div/button")).click();  
	}

	@Then("^choose role of collaborator$")
	public void choose_role_of_collaborator() throws InterruptedException
	{
	Thread.sleep(2000);
	Select roleofCol=new Select(driver.findElement(By.xpath("//select[@name='selectedRoleId']"))); 
	roleofCol.selectByVisibleText("Team Member");
	Thread.sleep(2000);
	}

	@Then("^Select User$")
	public void select_User() throws InterruptedException
	{
	WebElement selectUser=driver.findElement(By.xpath("//input[@id='react-select-28-input']"));
	selectUser.sendKeys("Sai Kishore");
	selectUser.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(2000);
	selectUser.sendKeys(Keys.ENTER);
	Thread.sleep(2000); 
	}

	@Then("^click on Add button$")
	public void click_on_Add_button()
	{
		driver.findElement(By.xpath("(//button[contains(text(),'Add')])[3]")).click(); 
	}
	
@When("^add skills and Education$")
public void add_skills_and_Education()
{
    driver.findElement(By.xpath("(//li[@class='sui-single-option-facet__item inactive'])[1]")).click();
}
    @When("^add industry field$")
    public void add_industry_field() throws InterruptedException 
    {
    WebElement industry=driver.findElement(By.xpath("//input[@id='react-select-13-input']"));
    industry.sendKeys("Computer Software");
    Thread.sleep(2000);
	industry.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(2000);
	industry.sendKeys(Keys.ENTER);
	Thread.sleep(2000); 
    }
    @When("^add keyword field$")
    public void add_keyword_field() throws InterruptedException 
    {
	WebElement keyword =driver.findElement(By.xpath("//input[@id='react-select-14-input']"));
    keyword.sendKeys("java");
	keyword.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(2000);
	keyword.sendKeys(Keys.ENTER);
	Thread.sleep(2000);
    }
    @When("^add Education$")
    public void add_Education() throws Throwable {
       
    
	WebElement education=driver.findElement(By.xpath("//input[@id='react-select-15-input']"));
	education.sendKeys("bsc");
	education.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(2000);
	education.sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='sui-single-option-facet__link active']")).click();
}
@When("^click on Additional Information$")
public void click_on_Additional_Information() throws Throwable {
   driver.findElement(By.xpath("/html/body/section/div[1]/div/div[3]/div/section/div/div/div[2]/div[3]/div[2]/div/div[1]/div/div/div/div/ul/li[3]/a")).click();
}
@When("^add Work Location$")
   public void add_Work_Location() throws Throwable {
      
   
   driver.findElement(By.xpath("//textarea[@id='workLocation']")).sendKeys("Hyderabad");
   }
@When("^add working Hours$")
public void add_working_Hours() throws Throwable {
   

   driver.findElement(By.xpath("//textarea[@name='workHours']")).sendKeys("8hrs");
}
@When("^enter minimal Annual Salary$")
public void enter_minimal_Annual_Salary() throws Throwable {
  

   driver.findElement(By.xpath("//input[@id='minSalary']")).sendKeys("30,000");
}
@When("^enter maximum Annual Salary$")
public void enter_maximum_Annual_Salary() throws Throwable {
   

   driver.findElement(By.xpath("//input[@id='maxSalary']")).sendKeys("1,00,000");
}

@When("^add pre screening questions$")
public void add_pre_screening_questions() throws Throwable {
   driver.findElement(By.xpath("/html/body/section/div[1]/div/div[3]/div/section/div/div/div[2]/div[3]/div[2]/div/div[1]/div/div/div/div/ul/li[4]/a")).click();
}
@When("^click on Add Question button$")
   public void click_on_Add_Question_button() throws Throwable 
   {
       
   driver.findElement(By.xpath("//button[contains(text(),'Select Questions')]")).click();
   }
@When("^enter Question$")
public void enter_Question() throws Throwable {
    

   driver.findElement(By.xpath("(//button[contains(text(),'Add')])[1]")).click();
   driver.findElement(By.xpath("//textarea[@name='question']")).sendKeys("what is your graduation CGPA?");
}
@When("^choose the Category of Question$")
public void choose_the_Category_of_Question() throws Throwable {
    

   WebElement category=driver.findElement(By.xpath("//input[@id='react-select-13-input']"));
   category.sendKeys("HR");
   category.sendKeys(Keys.ARROW_DOWN);
   Thread.sleep(2000);
   category.sendKeys(Keys.ENTER);
   Thread.sleep(2000);
}
@Then("^click on Submit Button$")
public void click_on_Submit_Button() throws Throwable {
   

   driver.findElement(By.xpath("(//button[contains(text(),'Submit')])[1]")).click();
   Thread.sleep(2000);
}
@Then("^Select questions from Questions List$")
public void select_questions_from_Questions_List() throws Throwable {
  


   driver.findElement(By.xpath("(//label[@class='bx--checkbox-label'])[2]")).click();
   Thread.sleep(2000);
}
@Then("^click on Add Selected$")
public void click_on_Add_Selected() throws Throwable {
  

   driver.findElement(By.xpath("//button[contains(text(),'Add Selected')]")).click();
   Thread.sleep(2000);
}	
}



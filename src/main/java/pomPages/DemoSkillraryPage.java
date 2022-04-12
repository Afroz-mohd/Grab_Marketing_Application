package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSkillraryPage 
{
	@FindBy(xpath="//a[text()='COURSE']")
	private WebElement coursetab;
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtrainingtab;
	
	public DemoSkillraryPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getCoursetab() {
		return coursetab;
	}
	
	public void seleniumtraining()
	{
		seleniumtrainingtab.click();
	}
	
}

package scripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddtoCartPage;
import pomPages.DemoSkillraryPage;
import pomPages.SkillraryLoginPage;

public class TestCase1 extends BaseClass
{

	@Test
	public void tc1()
	{
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.demoskillarypage();
		
		DemoSkillraryPage d=new DemoSkillraryPage(driver);
		utilities.switchTabs(driver);
		utilities.mouseHover(driver,d.getCoursetab());
		d.seleniumtraining();
		
		AddtoCartPage ad=new AddtoCartPage(driver);
		utilities.doubleclick(driver, ad.getPlusbtn());
		ad.addtocartbutton();
		utilities.alertpopup(driver);
		
	}
}

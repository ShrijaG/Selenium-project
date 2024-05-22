package testpkg;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import basepkg.Crocsbase;
import pagepkg.Crocspage;
import utilspkg.Xlutils;



public class Crocstest extends Crocsbase {
	
@Test(priority=1)
public void test() throws InterruptedException
{
	Crocspage ob= new Crocspage(driver);
	Thread.sleep(3000);
	ob.myaccount();
}
@Test(priority=2)
public void verifyLoginWithValidCred()throws Exception
{
	//driver.manage().timeouts().implicitlyWait(DurationOFSeconds(10));
Crocspage p1=new Crocspage(driver);	
//Reading the data from the excel file by the specified path
String xl="C:\\Users\\shrij\\Documents\\lazyjacks.xlsx";
String sheet="Sheet1";
int rowCount=Xlutils.getRowCount(xl, sheet);
for(int i=1;i<=rowCount;i++)
{
	String UserName=Xlutils.getCellValues(xl, sheet, i, 0);
	System.out.println("username....."+UserName);
	String Pwd=Xlutils.getCellValues(xl, sheet, i, 1);
	System.out.println("password....."+Pwd);
	p1.clear();
	//passing username and password as parameters
	p1.setvalues(UserName, Pwd);
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,300)", "");
	
	//submitting the data by clicking on login button
	p1.loginclick();
}

}
@Test(priority=3)
public void selection() throws Exception
{
Crocspage ob=new Crocspage(driver);
Thread.sleep(3000);
ob.ladies();

JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,600)", "");
Thread.sleep(3000);
ob.product1();

JavascriptExecutor js1=(JavascriptExecutor)driver;
js1.executeScript("window.scrollBy(0,800)", "");
Thread.sleep(3000);
ob.addtocart();
driver.navigate().to("https://lazyjacks.co.uk/collections/ladies-tops");

JavascriptExecutor js2=(JavascriptExecutor)driver;
js2.executeScript("window.scrollBy(0,600)", "");
Thread.sleep(3000);
ob.product2();

JavascriptExecutor js3=(JavascriptExecutor)driver;
js3.executeScript("window.scrollBy(0,800)", "");
Thread.sleep(3000);
ob.addtocart();
Thread.sleep(3000);
ob.checkout();

ob.details();
driver.navigate().to("https://lazyjacks.co.uk/");
ob.myaccount();
Thread.sleep(3000);
ob.logout();


}
}
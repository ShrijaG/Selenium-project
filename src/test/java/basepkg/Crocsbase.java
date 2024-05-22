package basepkg;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Crocsbase 
{
public static ChromeDriver driver;
String baseurl="https://lazyjacks.co.uk/";
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
	driver.manage().window().maximize();
}

}

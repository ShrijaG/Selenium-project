package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Crocspage {
	WebDriver driver;
	
//Account sign in 
@FindBy(xpath="//*[@id=\"shopify-section-sections--15059766640758__header\"]/div/header/div/a[1]")
WebElement myaccount;

//sign in
@FindBy(id="CustomerEmail")
WebElement email;

@FindBy(id="CustomerPassword")
WebElement password;

@FindBy(xpath="//*[@id=\"customer_login\"]/button")
WebElement signin;

//@FindBy(xpath="//*[@id=\"HeaderMenu-signature-sweatshirts\"]")
//WebElement signature;

@FindBy(xpath="//*[@id=\"HeaderMenu-ladies\"]/span")
WebElement ladies;

//@FindBy(xpath="//*[@id=\"CardLink-template--15059766116470__product-grid-7181619134582\"]")
//WebElement product1;

@FindBy(xpath = "//*[@id=\"HeaderMenu-ladies-clothing\"]/span")
WebElement clothing;

@FindBy(xpath ="//*[@id=\"HeaderMenu-ladies-clothing-ladies-tops\"]")
WebElement ladiestops;

@FindBy(xpath="/html/body/main/div[2]/div/div/div/div/ul/li[2]/div/div/div[2]/div[1]/h3/a")
WebElement product1;
@FindBy(name="plus")
WebElement plus;
@FindBy(name="add")
WebElement addtocart;

@FindBy(xpath="/html/body/main/div[2]/div/div/div/div/ul/li[3]/div/div/div[2]/div[1]/h3/a")
WebElement product2;

@FindBy(name="checkout")
WebElement checkout;

@FindBy(name="company")
WebElement company;
@FindBy(name="address1")
WebElement address;
@FindBy(name="address2")
WebElement apartment;
@FindBy(name="city")
WebElement city;
@FindBy(name="postalCode")
WebElement postcode;

@FindBy(xpath="//*[@id=\"shopify-section-template--15059766378614__main\"]/div/div[1]/a")
WebElement logout;

public Crocspage(ChromeDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void myaccount()
{
	myaccount.click();
}
public void setvalues(String mail,String pswd) 
{
	email.sendKeys(mail);
	password.sendKeys(pswd);
	
}
public void loginclick()
{
	signin.submit();
}
public void clear()
{
	email.clear();
	password.clear();
}
public void ladies()
{
	ladies.click();
	clothing.click();
	ladiestops.click();
}
public void product1()
{
	product1.click();
	
}
public void addtocart()
{
	plus.click();
	addtocart.click();
	
}
public void product2()
{
	product2.click();
}
public void checkout()
{
	checkout.click();
}
public void details()
{
	company.sendKeys("abc");
	address.sendKeys("rosegarden");
	apartment.sendKeys("rose");
	city.sendKeys("kochi");
	postcode.sendKeys("568734");
	
}
public void logout()
{
	logout.click();
}
}

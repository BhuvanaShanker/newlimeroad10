package NewLimeRoad_Project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Cucumber.NewLimeRoad.Base_LimeRoad;

public class New_Lime_Page extends Base_LimeRoad implements New_Lime {

	New_Lime_Page() {
		PageFactory.initElements(driver, this);
		
}

	@FindBy(xpath = choose_men)
	private WebElement Choose_Men;

	public WebElement getChoose_Men() {
		return Choose_Men;
	}
	
	@FindBy(xpath = sub_men_product)
	private WebElement Sub_Product;

	public WebElement getSub_Product() {
		return Sub_Product;
	}
	
	@FindBy(xpath = brand)
	private WebElement Brand;

	public WebElement getBrand() {
		return Brand;
	}
	
	@FindBy(xpath = bee)
	private WebElement Bee;

	public WebElement getBee() {
		return Bee;
	}
	
	@FindBy(xpath = choose_dress)
	private WebElement Choose_Dress;

	public WebElement getChoose_Dress() {
		return Choose_Dress;
	}
	
	@FindBy(xpath = choose_size)
	private WebElement Size;

	public WebElement getSize() {
		return Size;
	}
	
	@FindBy(xpath = Addtocart)
	private WebElement addtocart;

	public WebElement getAddtocart() {
		return addtocart;
	}
	
}

package elementos;

import org.openqa.selenium.By;

public class ElementoCompraTablet {
	
	private By btComprarTablet = By.xpath("//*[@id=\"tabletsImg\"]");
	
	private By btTablet1 = By.xpath("//*[@id=\"16\"]");
	
	private By btGrayColorTablet1 = By.xpath("/html/body/div[3]/section/article[1]/div[2]/div[2]/div/div[1]/div[1]/span[2]");

	private By btQuantidadeTablet1 = By.xpath("//*[@id=\"productProperties\"]/div[2]/e-sec-plus-minus/div/div[2]/input");
	
	private By btAddCartTablet1 = By.xpath("//*[@id=\"productProperties\"]/div[4]/button");
	
	private By btCartTablet1 = By.xpath("//*[@id=\"menuCart\"]");
	
	private By btCheckoutTablet1 = By.xpath("//*[@id=\"checkOutButton\"]");
	
	private By btRegister = By.xpath("//*[@id=\"registration_btn\"]");
	
	private By bt = By.xpath("");
	

	
	public By getBtComprarTablet() {
		return btComprarTablet;
	}
	
	public By getBtTablet1() {
		return btTablet1;
	}
	
	public By getBtGrayColorTablet1() {
		return btGrayColorTablet1;
	}
	
	public By getBtQuantidadeTablet1() {
		return btQuantidadeTablet1;
	}
	
	public By getBtAddCartTablet1() {
		return btAddCartTablet1;
	}

	public By getBtCartTablet1() {
		return btCartTablet1;
	}
	
	public By getBtCheckoutTablet1() {
		return btCheckoutTablet1;
	}
	
	public By getBtRegister() {
		return btRegister;
	}
}

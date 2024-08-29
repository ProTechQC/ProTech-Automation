package elementos;

import org.openqa.selenium.By;

public class ElementoLogin {
	
	private By btUsername = By.xpath("//*[@id=\"formCover\"]/div[1]/div[1]/sec-view[1]/div/input");

	private By btEmail = By.xpath("//*[@id=\"formCover\"]/div[1]/div[1]/sec-view[2]/div/input");
	
	private By btPassword = By.xpath("//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[1]/div/input");
	
	private By btConfirmPassword = By.xpath("//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[2]/div/input");

	private By btCheckbox = By.xpath("//*[@id=\"formCover\"]/sec-view/div/input");
	
	private By btRegister = By.xpath("//*[@id=\"register_btn\"]");
	
	public By getBtUsername() {
		return btUsername;
	}

	public By getBtEmail() {
		return btEmail;
	}

	public By getBtPassword() {
		return btPassword;
	}

	public By getBtConfirmPassword() {
		return btConfirmPassword;
	}
	
	public By getBtCheckbox() {
		return btCheckbox;
	}
	
	public By getRegister() {
		return btRegister;
	}
	
}

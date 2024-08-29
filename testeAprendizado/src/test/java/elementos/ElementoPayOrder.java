package elementos;

import org.openqa.selenium.By;

public class ElementoPayOrder {

	private By btNext = By.xpath("//*[@id=\"next_btn\"]");

	private By btMasterCredit = By.xpath("//*[@id=\"paymentMethod\"]/div/div[1]/div[2]/input");
	
	private By cpCardNumber = By.xpath("//*[@id=\"creditCard\"]");
	
	private By cpCVV = By.xpath("//*[@id=\"paymentMethod\"]/div/div[4]/sec-form/div[1]/sec-view[2]/div/input");
	
	private By cpCardholder = By.xpath("//*[@id=\"paymentMethod\"]/div/div[4]/sec-form/div[2]/sec-view/div/input");
	
	private By btPay = By.xpath("//*[@id=\"pay_now_btn_ManualPayment\"]");
	
	public By getBtNext() {
		return btNext;
	}

	public By getBtMasterCredit() {
		return btMasterCredit;
	}

	public By getCpCardNumber() {
		return cpCardNumber;
	}

	public By getCpCVV() {
		return cpCVV;
	}

	public By getCpCardholder() {
		return cpCardholder;
	}

	public By getBtPay() {
		return btPay;
	}
	
	
}

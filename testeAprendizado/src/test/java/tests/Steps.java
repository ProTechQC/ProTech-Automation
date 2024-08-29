package tests;

import elementos.ElementoCompraTablet;
import elementos.ElementoLogin;
import elementos.ElementoPayOrder;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class Steps {
	
	Metodos met = new Metodos();
	ElementoCompraTablet tab = new ElementoCompraTablet();
	ElementoLogin log = new ElementoLogin();
	ElementoPayOrder pay = new ElementoPayOrder();

	@Given("que eu esteja no {string}")
	public void que_eu_esteja_no(String site) throws Throwable {
		met.abrirSite(site, "CHROME");
		met.pausa(4000);
		
	    
	}

	@When("responder os campos")
	public void responder_os_campos() throws Throwable {
		met.clicar(tab.getBtComprarTablet());
		met.pausa(2000);
		met.clicar(tab.getBtTablet1());
		met.pausa(2000);
		met.clicar(tab.getBtGrayColorTablet1());
		met.preencher(tab.getBtQuantidadeTablet1(), "3");
		met.clicar(tab.getBtAddCartTablet1());
		met.clicar(tab.getBtCartTablet1());
		met.pausa(2000);
		met.clicar(tab.getBtCheckoutTablet1());
		met.pausa(2000);
		met.clicar(tab.getBtRegister());
		met.pausa(2000);
		met.preencher(log.getBtUsername(), met.getNome("abc"));
		met.preencher(log.getBtEmail(), met.getEmail());
		met.preencher(log.getBtPassword(), "12345aB");
		met.preencher(log.getBtConfirmPassword(), "12345aB");
		met.clicar(log.getBtCheckbox());
		met.clicar(log.getRegister());
		
	}

	@Then("valido as informacao tirar print de envio de compra")
	public void valido_as_informacao_tirar_print_de_envio_de_compra() throws Throwable {
		met.pausa(4000);
		met.clicar(pay.getBtNext());
		met.clicar(pay.getBtMasterCredit());
		met.preencher(pay.getCpCardNumber(), met.getCartao());
		met.preencher(pay.getCpCVV(), met.getCVV());
		met.preencher(pay.getCpCardholder(), met.getCardholder("abc"));
		met.clicar(pay.getBtPay());
	}
}

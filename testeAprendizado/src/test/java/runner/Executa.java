package runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		// mostrar o caminho das features
		features = "src/test/resources/features/",
		// mostrar pacote estão os steps para execução
		glue = "tests",
		//tags para direcionar a execusão dos testes
		tags = "@allTest",
		// formatacão do console cucumber | report html
		plugin = {"pretty", "html:target/report.html"},
		// monchrome deixa mais limpo o console, sem trazer caracteres especiais
		monochrome = true,
		// Deixa os metodos com padrao da linguagem Java ao inves de underline 
		snippets = SnippetType.CAMELCASE,
		// não executa o teste ele so valida o mapeamento se falta terminar alguma coisa, padrão deixar false
		dryRun = false
		)
public class Executa {

}

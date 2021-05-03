package br.df.lseabra.test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import java.util.Map;
import org.hamcrest.Matchers;
import org.junit.Test;
import br.df.lseabra.core.BaseTest;

public class ConsultasTest extends BaseTest {

	
	@Test
	public void consultaCepValido() {
		
		Map<String, String> cep = criarElemento("cep","91060-900");
		
		given()
			.pathParams(cep)
		.when()
			.get("/{cep}/json")
		.then()
			.log().all()
		    .statusCode(200)
            .body("cep", is("91060-900"))
            .body("logradouro", is("Avenida Assis Brasil 3940"))
            .body("complemento", is(""))
            .body("bairro", is("São Sebastião"))
            .body("localidade", is("Porto Alegre"))
            .body("uf", is("RS"))
            .body("ibge", is("4314902"));
			
	}
	@Test
	public void consultaCepInexistente() {
		
		Map<String, String> cep = criarElemento("cep","00000002");
		
		given()
			.pathParams(cep)
		.when()
			.get("/{cep}/json")
		.then()
			.log().all()
		    .statusCode(200)
            .body("erro", is(true));

			
	}
	@Test
	public void consultaCepComFormatoInvalido() {
		Map<String, String> cep = criarElemento("cep","9106090A0");
		
		given()
			.pathParams(cep)
		.when()
			.get("/{cep}/json")
		.then()
			.log().all()
		    .statusCode(400)
		    .body("html.body.h1",Matchers.is("Erro 400"))
		    .body("html.body.h3",Matchers.is("Verifique a sua URL (Bad Request)")); 
	}
	@Test
	public void consultaCepExtra() {
				
		given()
		.when()
			.get("/RS/Gravatai/Barroso/json/")
		.then()
			.log().all()
		    .statusCode(200)
		    .body("$", Matchers.hasSize(2))
            .body("cep[0]", is("94085-170"))
            .body("logradouro[0]", is("Rua Ari Barroso"))
            .body("complemento[0]", is(""))
            .body("bairro[0]", is("Morada do Vale I"))
            .body("localidade[0]", is("Gravataí"))
            .body("uf[0]", is("RS"))
            .body("cep[1]", is("94175-000"))
            .body("logradouro[1]", is("Rua Almirante Barroso"))
            .body("complemento[1]", is(""))
            .body("bairro[1]", is("Recanto Corcunda"))
            .body("localidade[1]", is("Gravataí"))
            .body("uf[1]", is("RS"));

			
	}
	
}

package com.bolsafamilia.bolsafamilia;

import com.bolsafamilia.bolsafamilia.Model.DadosPorMunicipio;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@SpringBootTest
class BolsafamiliaApplicationTests {

	@Test
	public void consumidorAPI() {
			RestTemplate template = new RestTemplate();

			UriComponents uri = UriComponentsBuilder.newInstance()
					.scheme("http")
					.host("www.transparencia.gov.br")
					.path("/api-de-dados/bolsa-familia-por-municipio")
					.queryParam("mesAno", "201505")
					.queryParam("codigoIbge", "2903201")
					.queryParam("pagina", "1")
					.build();

			DadosPorMunicipio[] resposta = template.getForObject(uri.toUriString(), DadosPorMunicipio[].class);
			System.out.println(resposta[0].getResultado());

		}

}

package com.bolsafamilia.bolsafamilia.Controller;

import com.bolsafamilia.bolsafamilia.Model.DadosPorMunicipio;
import com.bolsafamilia.bolsafamilia.Model.DadosDePesquisa;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@Controller
public class PesquisaController {

    public DadosDePesquisa dadosDePesquisa = new DadosDePesquisa();
    public DadosPorMunicipio dadosPorMunicipio = new DadosPorMunicipio();

    @GetMapping("/pesquisa")
    public String formularioDePesquisa(Model model) {
        model.addAttribute("dadosDePesquisa", dadosDePesquisa);
        return "pesquisa";
    }

    @PostMapping("/pesquisa")
    public String respostaDaPesquisa(Model model, DadosDePesquisa dadosDePesquisa) {
        fazConsultaDeDados(dadosDePesquisa);
        model.addAttribute("dadosPorMunicipio", dadosPorMunicipio);
        return "resposta";
    }

    public void fazConsultaDeDados(DadosDePesquisa dadosDePesquisa) {
        RestTemplate template = new RestTemplate();

        UriComponents uri = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("www.transparencia.gov.br")
                .path("/api-de-dados/bolsa-familia-por-municipio")
                .queryParam("mesAno",  dadosDePesquisa.getMesAno())
                .queryParam("codigoIbge", dadosDePesquisa.getCodigoIbge())
                .queryParam("pagina", "1")
                .build();

        DadosPorMunicipio[] respostaDaPesquisa = template.getForObject(uri.toUriString(), DadosPorMunicipio[].class);
        dadosPorMunicipio = respostaDaPesquisa[0];
    }
}

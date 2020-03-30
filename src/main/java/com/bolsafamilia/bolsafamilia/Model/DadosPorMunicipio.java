package com.bolsafamilia.bolsafamilia.Model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DadosPorMunicipio {
    private String dataReferencia;
    private int id;
    private Municipio municipio;
    private Number quantidadeBeneficiados;
    private TipoBeneficio tipo;
    private Number valor;

    public String getDataReferencia() {
        return dataReferencia;
    }

    public void setDataReferencia(String dataReferencia) {
        this.dataReferencia = dataReferencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public Number getQuantidadeBeneficiados() {
        return quantidadeBeneficiados;
    }

    public void setQuantidadeBeneficiados(Number quantidadeBeneficiados) {
        this.quantidadeBeneficiados = quantidadeBeneficiados;
    }

    public TipoBeneficio getTipo() {
        return tipo;
    }

    public void setTipo(TipoBeneficio tipo) {
        this.tipo = tipo;
    }

    public Number getValor() {
        return valor;
    }

    public void setValor(Number valor) {
        this.valor = valor;
    }

    public String getResultado() {
        return "No município de " + municipio.getNomeIBGE() + " - " + municipio.getUf().getSigla()
                + ", na data " + dataReferencia + ", um total de " + quantidadeBeneficiados.toString() +
                " pessoas foram beneficiadas no programa da bolsa família, totalizando R$ " + valor.longValue()
                + " investidos.";
    }
}

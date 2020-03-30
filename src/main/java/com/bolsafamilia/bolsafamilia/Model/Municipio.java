package com.bolsafamilia.bolsafamilia.Model;

public class Municipio {
    private String codigoIBGE;
    private String nomeIBGE;
    private String nomeIBGEsemAcento;
    private String pais;
    private Uf uf;

    public String getCodigoIBGE() {
        return codigoIBGE;
    }

    public void setCodigoIBGE(String codigoIBGE) {
        this.codigoIBGE = codigoIBGE;
    }

    public String getNomeIBGE() {
        return nomeIBGE;
    }

    public void setNomeIBGE(String nomeIBGE) {
        this.nomeIBGE = nomeIBGE;
    }

    public String getNomeIBGEsemAcento() {
        return nomeIBGEsemAcento;
    }

    public void setNomeIBGEsemAcento(String nomeIBGEsemAcento) {
        this.nomeIBGEsemAcento = nomeIBGEsemAcento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Uf getUf() {
        return uf;
    }

    public void setUf(Uf uf) {
        this.uf = uf;
    }
}

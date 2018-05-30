package model;

import interfacegrafica.JanelaDaDonaMaria;
import interfaces.Curioso;
import interfaces.Fofoqueiro;

public class Desempregado implements Curioso{

    private Conversa faltaDoQueFazer = new Conversa();
    private Fofoqueiro casaDaDonaMaria;

    public Desempregado(Fofoqueiro casaDaDonaMaria) {
        this.casaDaDonaMaria = casaDaDonaMaria;
        this.casaDaDonaMaria.incluirNaConversa(this);
    }
    
    @Override
    public void atualiza(Conversa cv) {
        this.faltaDoQueFazer = cv;
        mostrar();
    }

    public String mostrar() {
        String tudo = "";
        tudo += faltaDoQueFazer.getCuDeCurioso();
        JanelaDaDonaMaria.setjTextAreaDesempregado(tudo);
        return tudo;
    }

    @Override
    public void jogarLenhaNaFogueira(String asnera) {
        this.faltaDoQueFazer.setCuDeCurioso("DESEMPREGADO: " + asnera);
        this.casaDaDonaMaria.setPotoca(faltaDoQueFazer);
//        this.casaDaDonaMaria.espalharIntriga();
    }
    
}

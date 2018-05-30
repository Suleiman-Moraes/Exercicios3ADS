package model;

import interfaces.Curioso;
import interfaces.Fofoqueiro;
import java.util.ArrayList;
import java.util.List;

public class CasaDaDonaMaria implements Fofoqueiro{
    private List bandoDeAtoas;
    private Conversa potoca;

    public CasaDaDonaMaria() {
        this.bandoDeAtoas = new ArrayList();
    }

    @Override
    public void incluirNaConversa(Curioso cv) {
        bandoDeAtoas.add(cv);
    }

    @Override
    public void darVacuoNoCurioso(Curioso cv) {
        int i = bandoDeAtoas.indexOf(cv);
        if(i >= 0) bandoDeAtoas.remove(i);
    }

    @Override
    public void espalharIntriga() {
        bandoDeAtoas.forEach(x -> ((Curioso) x).atualiza(potoca));
    }
    
    @Override
    public void setPotoca(Conversa cv){
        this.potoca = new Conversa(cv);
        espalharIntriga();
    }
}

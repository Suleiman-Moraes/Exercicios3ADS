/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.text.SimpleDateFormat;
import model.Aluno;

/**
 *
 * @author Veronika
 */
public class OrdernacaoAnoNome extends ClasseOrdenacao{
    @Override
    public boolean compara(Aluno a, Aluno b) {
        String x = new SimpleDateFormat("yyyy/MM/dd").format(a.getDataDeAdmicao());
        String y = new SimpleDateFormat("yyyy/MM/dd").format(b.getDataDeAdmicao());
        String[] aa = {x, a.getNome()};
        String[] bb = {y, b.getNome()};
        
        for (int i = 0; i < bb.length; i++) {
            if(aa[i].compareToIgnoreCase(bb[i]) < 0) return true;
            else if(aa[i].compareToIgnoreCase(bb[i]) > 0) return false;
        }
        return true;
    }
}

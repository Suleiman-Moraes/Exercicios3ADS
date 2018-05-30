package exercicios.exercicio08;

import util.ListaSimples;
import util.No;

public class Lista extends ListaSimples{

    public Comparable pegarElemento(int cod) {
        if(eVazia()) return null;
        No aux = inicio;
        while (aux != null) {            
            if(((Produto)aux.getInfo()).getCodigo() == cod){
                return aux.getInfo();
            }
            aux = aux.getProximoNo();
        }
        return null;
    }

    public Comparable retirarElemento(int cod) {
        return super.retirarElemento(pegarElemento(cod)); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void alterarElemento(Comparable elemneto){
        retirarElemento(((Produto)elemneto).getCodigo());
        insereOrdenado(elemneto);
    }
    
    
}

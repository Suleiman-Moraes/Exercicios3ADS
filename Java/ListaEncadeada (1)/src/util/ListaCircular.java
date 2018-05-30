package util;

public class ListaCircular {

    private No fim;

    public ListaCircular() {
    }

    public boolean eVazia() {
        return fim == null;
    }

    public void insereNoFim(Comparable elemento) {
        No novo = new No(elemento, null);

        if (eVazia()) {
            novo.setProximoNo(novo);
            fim = novo;
        } else {
            novo.setProximoNo(fim.getProximoNo());
            fim.setProximoNo(novo);
            fim = novo;
        }
    }

    public void insereOrdenado(Comparable elemento) {
        No novo = new No(elemento, null);

        if (eVazia()) {
            insereNoFim(elemento);
        } else {
            No ant = null, prox;
            prox = fim.getProximoNo();
            while (prox != fim && elemento.compareTo(prox.getInfo()) > 0) {
                ant = prox;
                prox = prox.getProximoNo();
            }
            if (ant == null) {
                if (elemento.compareTo(prox.getInfo()) > 0) {
                    insereNoFim(elemento);
                } else {
                    insereNoInicio(elemento);
                }
            } else {
                if (prox == fim) {
                    if (elemento.compareTo(prox.getInfo()) > 0) {
                        insereNoFim(elemento);
                    } else {
                        insereNoInicio(elemento);
                    }
                }
                else{
                    ant.setProximoNo(novo);
                    novo.setProximoNo(prox);
                }
            }

//            if(ant == null)insereNoInicio(elemento);
//            else{
////                if(prox == null) insereNoFim(elemento);
////                else {
                    
////                }
//            }
        }
    }
    
    public void insereOrdenadoS(Comparable elemento) {
        No novo = new No(elemento, null);

        if (eVazia()) {
            insereNoFim(elemento);
        } else {
            No ant = null, prox;
            prox = fim.getProximoNo();
            while (elemento.compareTo(prox.getInfo()) > 0) {
                ant = prox;
                if(prox == fim){
                    ant = null;
                    break;
                }
                prox = prox.getProximoNo();
            }
            if (ant == null) {
                if (elemento.compareTo(prox.getInfo()) > 0) {
                    insereNoFim(elemento);
                } else {
                    insereNoInicio(elemento);
                }
            } else {
                ant.setProximoNo(novo);
                    novo.setProximoNo(prox);
            }

//            if(ant == null)insereNoInicio(elemento);
//            else{
////                if(prox == null) insereNoFim(elemento);
////                else {
                    
////                }
//            }
        }
    }

    public void mostraLista() {
        if (!eVazia()) {
            No aux = fim.getProximoNo();
            while (aux != fim) {
                System.out.println(aux.getInfo());
                aux = aux.getProximoNo();
            }
            System.out.println(aux.getInfo());
        }
    }

    public void insereNoInicio(Comparable elemento) {
        No novo = new No(elemento, null);

        if (eVazia()) {
            novo.setProximoNo(novo);
            fim = novo;
        } else {
            novo.setProximoNo(fim.getProximoNo());
            fim.setProximoNo(novo);
        }
    }
}

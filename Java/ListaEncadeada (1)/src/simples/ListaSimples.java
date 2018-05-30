package simples;
public class ListaSimples {
    No inicio;
    No fim;

    public ListaSimples() {}
//    public ListaSimples(No inicio, No fim) {
//        this.inicio = inicio;
//        this.fim = fim;
//    }
    public boolean eVazia(){return inicio == null && fim == null;}
    
    public void insereNoInicio(int numero){
        No novo = new No(numero, null);
        
        if(eVazia()) fim = novo;
        else novo.setProximoNo(inicio);
        
        inicio = novo;
    }
    
    public void insereNoFim(int numero){
        No novo = new No(numero, null);
        
        if(eVazia()) inicio = novo;
        else fim.setProximoNo(novo);
        
        fim = novo;
    }
    
    public void insereOrdenado(int numero){
        No novo = new No(numero, null);
        
        if(eVazia()){
            inicio = novo;
            fim = novo;
        }
        else{
            No ant = null, prox;
            prox = inicio;
            while(prox != null && numero > prox.getInfo()){
                ant = prox;
                prox = prox.getProximoNo();
            }
            if(ant == null)insereNoInicio(numero);
            else{
                if(prox == null) insereNoFim(numero);
                else {
                    if(prox == null) insereNoFim(numero);
                    else{
                        ant.setProximoNo(novo);
                        novo.setProximoNo(prox);
                    }
                }
            }
        }
    }
    
    public No retirarElemento(int numero){
        if(!eVazia()) {
            No prox = inicio;
            No ultimo = null;
            if(numero <= fim.getInfo() && numero >= inicio.getInfo()){
                while(prox != null && prox.getInfo() <= numero){
                    if(prox.getInfo() == numero){
                        if(inicio == fim){
                            inicio = null;
                            fim = null;
                        }
                        else if(ultimo == null){
                            inicio = prox.getProximoNo();
                            return prox;
                        }else if(prox.getProximoNo() == null){
                            ultimo.setProximoNo(null);
                            fim = ultimo;
                            return prox;
                        }
                        else {
                            ultimo.setProximoNo(prox.getProximoNo());
                           return prox;
                        }
                    }
                    else if(prox.getInfo() > numero){
                        return null;
                    }
                    ultimo = prox;
                    prox = prox.getProximoNo();
                }
            }
        }
        return null;
    }
    
    public void mostraLista(){
        No aux = inicio;
        if(eVazia()){
            System.out.println("Lista Vazia");
        }
        while (aux != null) {            
            System.out.println(aux.getInfo());
            aux = aux.getProximoNo();
        }
    }
}

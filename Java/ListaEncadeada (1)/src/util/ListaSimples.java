package util;
public class ListaSimples {
    protected No inicio;
    protected No fim;

    public ListaSimples() {}
    
    public boolean eVazia(){return inicio == null && fim == null;}
    
    public Comparable pegarElemento(Comparable elemento){
        if(eVazia()) return null;
        No aux = inicio;
        while (aux != null) {            
            if(aux.getInfo().equals(elemento)){
                return aux.getInfo();
            }
            aux = aux.getProximoNo();
        }
        return null;
    }
    
    public void insereNoInicio(Comparable elemento){
        No novo = new No(elemento, null);
        
        if(eVazia()) fim = novo;
        else novo.setProximoNo(inicio);
        
        inicio = novo;
    }
    
    public void insereNoFim(Comparable elemento){
        No novo = new No(elemento, null);
        
        if(eVazia()) inicio = novo;
        else fim.setProximoNo(novo);
        
        fim = novo;
    }
    
    public void insereOrdenado(Comparable elemento){
        No novo = new No(elemento, null);
        
        if(eVazia()){
            inicio = novo;
            fim = novo;
        }
        else{
            No ant = null, prox;
            prox = inicio;
            while(prox != null && elemento.compareTo(prox.getInfo()) > 0){
                ant = prox;
                prox = prox.getProximoNo();
            }
            if(ant == null)insereNoInicio(elemento);
            else{
                if(prox == null) insereNoFim(elemento);
                else {
                    if(prox == null) insereNoFim(elemento);
                    else{
                        ant.setProximoNo(novo);
                        novo.setProximoNo(prox);
                    }
                }
            }
        }
    }
    
    public Comparable retirarElemento(Comparable elemento){
        if(elemento == null) return null;
        if(!eVazia()) {
            No prox = inicio;
            No ultimo = null;
            if(elemento.compareTo(fim.getInfo()) <= 0 && elemento.compareTo(inicio.getInfo()) >= 0){
                while(prox != null && prox.getInfo().compareTo(elemento) <= 0){
                    if(prox.getInfo().compareTo(elemento) == 0){
                        if(inicio.getInfo().compareTo(fim.getInfo()) == 0){
                            inicio = null;
                            fim = null;
                            return prox.getInfo();
                        }else if(prox.getProximoNo() == null){
                            ultimo.setProximoNo(null);
                            fim = ultimo;
                            return prox.getInfo();
                        }
                        else if(ultimo == null){
                            inicio = prox.getProximoNo();
                            return prox.getInfo();
                        }else {
                            ultimo.setProximoNo(prox.getProximoNo());
                            return prox.getInfo();
                        }
                    }
                    else if(prox.getInfo().compareTo(elemento) > 0){
                        return null;
                    }
                    ultimo = prox;
                    prox = prox.getProximoNo();
                }
            }
        }
        return null;
    }
    
    public Comparable retirarPrimeiroElemento(){
        if(!eVazia()) {
            No prox = inicio;
            No ultimo = null;
            if(inicio.getInfo().compareTo(fim.getInfo()) == 0){
                inicio = null;
                fim = null;
                return prox.getInfo();
            }else if(ultimo == null){
                inicio = prox.getProximoNo();
                return prox.getInfo();
            }
        }
        return null;
    }
    
    public int size(){
        No aux = inicio;
        int cont = 0;
        while (aux != null) {            
            cont ++;
            aux = aux.getProximoNo();
        }
        return cont;
    }
    
    public void mostraLista(){
        No aux = inicio;
        while (aux != null) {            
            System.out.println(aux.getInfo());
            aux = aux.getProximoNo();
        }
    }

    public void ordenarLista(){
        ListaSimples lista = new ListaSimples();
        No aux = inicio;
        while (aux != null) {  
            lista.insereOrdenado(aux.getInfo());
            aux = aux.getProximoNo();
        }
        inicio = lista.getInicioNo();
        fim = lista.getFimNo();
    }
    
    public void adcionarLista(ListaSimples lista){
        No aux = inicio;
        while (aux != null) {  
            if(aux.getProximoNo() == null){
                aux.setProximoNo(lista.getInicioNo());
                break;
            }
            aux = aux.getProximoNo();
        }
        fim = lista.getFimNo();
    }
    
    public Comparable getInicio() {
        return inicio.getInfo();
    }

    public Comparable getFim() {
        return fim.getInfo();
    }
    
    private No getInicioNo() {
        return inicio;
    }

    private No getFimNo() {
        return fim;
    }
}

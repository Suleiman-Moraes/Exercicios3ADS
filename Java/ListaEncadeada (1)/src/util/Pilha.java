package util;

public class Pilha {
    private No topo;

    public Pilha() {
        topo = null;
    }
    
    public boolean eVazia(){
        if(this == null){
            return true;
        }
        return topo == null;
    }
    
    public void empilhar(Comparable num){
        try {
            No novo = new No(num, null);
            if(eVazia()) topo = novo;
            else{
                novo.setProximoNo(topo);
                topo = novo;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Comparable desempilhar(){
        if(eVazia()) return null;
        else{
            Comparable aux = topo.getInfo();
            topo = topo.getProximoNo();
            return aux;
        }
    }
    
    public Comparable consultarTopo(){
        if(eVazia()) return null;
        return topo.getInfo();
    }
    
    public String mostrarLista(){
        if(eVazia()){
            System.out.println("Lista Vazia");
            return "";
        }
        No aux = topo;
        StringBuffer tudo = new StringBuffer("");
        while (aux != null) {            
            System.out.println(aux.getInfo());
            tudo.append(aux.getInfo());
            aux = aux.getProximoNo();
        }
        return tudo.toString();
    }
    
    public void ordenar(){
        if(!eVazia()){
            Pilha amarela = new Pilha();
            Comparable iten = this.desempilhar();
            while (iten != null) {
                if(amarela.consultarTopo() != null && iten.compareTo(amarela.consultarTopo()) > 0){
                    Pilha aux = transfere(amarela, iten);
                    amarela.empilhar(iten);
                    amarela = transfere(amarela, aux);
                }else if(amarela.consultarTopo() == null){
                    amarela.empilhar(iten);
                }else{
                    amarela.empilhar(iten);
                } 
                iten = this.desempilhar();
            }
            this.topo = amarela.getTopoNo();
        }
    }
    
    public Pilha ordenar(Pilha aaa){
        if(!eVazia()){
            Pilha amarela = new Pilha();
            Comparable iten = aaa.desempilhar();
            while (iten != null) {
                if(amarela.consultarTopo() != null && iten.compareTo(amarela.consultarTopo()) > 0){
                    Pilha aux = transfere(amarela, iten);
                    amarela.empilhar(iten);
                    amarela = transfere(amarela, aux);
                }else if(amarela.consultarTopo() == null){
                    amarela.empilhar(iten);
                }else{
                    amarela.empilhar(iten);
                } 
                iten = aaa.desempilhar();
            }
            return amarela;
        }
        return null;
    }
    
    private Pilha transfere(Pilha p, Comparable ate){
        if(p.eVazia() || ate == null) return null;
        
        Pilha nova = new Pilha();
        while(p.consultarTopo() != null){
            if(p.consultarTopo().compareTo(ate) <= 0){
                nova.empilhar(p.desempilhar());
            }else break;
        }
        
        return nova;
    }
    
    private Pilha transfere(Pilha p){
        if(eVazia()) return null;
        
        Pilha nova = new Pilha();
        while(p.consultarTopo() != null){
            nova.empilhar(p.desempilhar());
        }
        
        return nova;
    }
    
    private Pilha transfere(Pilha a, Pilha b){
        if(b.eVazia()) return a;
        
        while(b.consultarTopo() != null){
            a.empilhar(b.desempilhar());
        }
        
        return a;
    }
    
    public Comparable getTopo() {
        return topo.getInfo();
    }
    
    private No getTopoNo() {
        return topo;
    }
}

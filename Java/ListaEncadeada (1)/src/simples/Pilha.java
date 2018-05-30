package simples;
public class Pilha {
    private No topo;

    public Pilha() {}
    
    public boolean eVazia(){return topo == null;}
    
    public void empilhar(int num){
        No novo = new No(num, null);
        if(eVazia()) topo = novo;
        else{
            novo.setProximoNo(topo);
            topo = novo;
        }
    }
    
    public Integer desempilhar(int num){
        if(eVazia()) return null;
        else{
            int aux = topo.getInfo();
            topo = topo.getProximoNo();
            return aux;
        }
    }
    
    public Integer consultarTopo(){
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
}

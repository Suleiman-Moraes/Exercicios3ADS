package model.antiga;

import interfaces.IVendas;
import java.util.ArrayList;
import java.util.List;
public class Busao implements IVendas{
    private List<Boolean> poltronas = new ArrayList<>();
    private static String etinerario = "";

    public Busao(String etinerario){
        this.etinerario = etinerario;
        restart();
    }
    
    @Override
    public void alocarPoltronas(boolean ocupacao, int posicao) throws Exception{
        if(posicao > 43) throw new Exception("Poltrona Inexixtente.");
        this.poltronas.set(posicao, ocupacao);
    }
    @Deprecated
    public List<Integer> listarPoltronasVazias(){
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < poltronas.size() ; i++) {
            if(poltronas.get(i) == false)lista.add(i);
        }
        return lista;
    }
    @Deprecated
    public List<Boolean> listarPoltronasCheias(){
        List<Boolean> lista = new ArrayList<>();
        for (Boolean x : poltronas) {
            if(x == true)lista.add(x);
        }
        return lista;
    }
    @Override
    public void restart(){
        boolean[] poltrona = new boolean[44];
        for (Boolean x : poltrona) {
            poltronas.add(x);
        }
    }
    @Deprecated
    public boolean disponibilidade(int x){
        return poltronas.get(x);
    }
    @Override
    public String miniatura(){
        String tudo = etinerario.toUpperCase()+"\n=====================\n";
                    //+ "|00[ON][OF]01<>02[ON][OF]03|";
        String on = "[ON]";
        String of = "[of]";
        
        int cont = 1;
        for (int i = 0; i < 10; i++) {
            if(cont == 1){
                if(poltronas.get(i)) tudo += "|0"+i+on;
                else tudo += "|0"+i+of;
                cont ++;
            }
            else if(cont == 2){
                if(poltronas.get(i)) tudo += on+"0"+i;
                else tudo += of+"0"+i;
                cont ++;
            }
            else if(cont == 3){
                if(poltronas.get(i)) tudo += "<>0"+i+on;
                else tudo += "<>0"+i+of;
                cont ++;
            }
            else if(cont == 4){
                if(poltronas.get(i)) tudo += on+"0"+i+"|\n";
                else tudo += of+"0"+i+"|\n";
                cont = 1;
            }
        }
        cont = 1;
        tudo += "<<<<<<\"porta\"|\n";
        for (int i = 10; i < poltronas.size(); i++) {
            if(cont == 1){
                if(poltronas.get(i)) tudo += "|"+i+on;
                else tudo += "|"+i+of;
                cont ++;
            }
            else if(cont == 2){
                if(poltronas.get(i)) tudo += on+""+i;
                else tudo += of+""+i;
                cont ++;
            }
            else if(cont == 3){
                if(poltronas.get(i)) tudo += "<>"+i+on;
                else tudo += "<>"+i+of;
                cont ++;
            }
            else if(cont == 4){
                if(poltronas.get(i)) tudo += on+""+i+"|\n";
                else tudo += of+""+i+"|\n";
                cont = 1;
            }
        }
        tudo += " >>>\"banheiro\"|\n=====================";
        return tudo;
    }
}

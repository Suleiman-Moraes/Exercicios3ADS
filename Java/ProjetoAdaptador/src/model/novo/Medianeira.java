package model.novo;

import java.util.ArrayList;
import java.util.List;

public class Medianeira {
    private List<Boolean> poltronas = new ArrayList<>();
    private static String etinerario = "Auto Vição Nossa Senhora de Medianeira\n";

    public Medianeira(String etinerario){
        this.etinerario += etinerario;
        restartNoMedianeira();
    }
    
    public void alocarPoltronasNoMedianeira(boolean ocupacao, int posicao) throws Exception{
        if(posicao > 43) throw new Exception("Poltrona Inexixtente.");
        this.poltronas.set(posicao, ocupacao);
    }
    public void restartNoMedianeira(){
        boolean[] poltrona = new boolean[44];
        for (Boolean x : poltrona) {
            poltronas.add(x);
        }
    }
    public String miniaturaNoMedianeira(){
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

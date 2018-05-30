package main;

import enums.Legendas;
import fabrica.FabricaAbstrata;
import interfaces.IServico;
import javax.swing.JOptionPane;

public class Main {
    
    public static void imprimir(IServico servico, FabricaAbstrata empresa){
        StringBuilder tudo = new StringBuilder("");
        tudo.append("Nome da Empresa: ").append(empresa.getEmpresa());
        tudo.append("\nCidade: ").append(empresa.getCidade());
        tudo.append("\nDescrição: ").append(servico.getDescricao());
        tudo.append("\nValor: ").append(servico.getValor());
        JOptionPane.showMessageDialog(null, tudo.toString(), "Imprimir", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void main(String[] args) {
        try {
            Object tipoFabrica;
            Object[] op = FabricaAbstrata.getListaFabrica();
            
            do {                
                tipoFabrica = JOptionPane.showInputDialog(null, "Escolha a Fábrica", "ESCOLHA",
                        JOptionPane.PLAIN_MESSAGE, null, op, op[0]);
                
                FabricaAbstrata empresa = FabricaAbstrata.getInstance((Legendas) tipoFabrica);
                
                boolean controle = true;
                Object servi;
                Object[] listaServico = empresa.getListaDeServicos();
                
                do {                    
                    servi = JOptionPane.showInputDialog(null, "Escolha o Serviço", "ESCOLHA",
                         JOptionPane.PLAIN_MESSAGE, null, listaServico, listaServico[0]);
                    if(servi == null) controle = false;
                    else {
                        IServico servico = empresa.getServico((Legendas) servi);
                        imprimir(servico, empresa);
                    }
                } while (controle);
            } while (true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}

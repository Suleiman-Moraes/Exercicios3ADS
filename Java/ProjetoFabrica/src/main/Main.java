package main;

import javax.swing.JOptionPane;
import model.Fabrica;
import model.Modelo;

public class Main {
    public static void saida(Modelo m){
        StringBuilder tudo = new StringBuilder("");
        tudo.append("Marca == ").append(m.getMarca());
        tudo.append("\nModelo == ").append(m.getModelo());
        tudo.append("\nGeração == ").append(m.getGeracao());
        tudo.append("\nTipo == ").append(m.getTipo());
        tudo.append("\nPoltrona == ").append(m.getPoltrona());
        JOptionPane.showMessageDialog(null, tudo.toString(), m.getMarca(), JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void main(String[] args) {
        try {
            Object[] op = {"Marcopolo12", "Busscar"};
            Object modelo;

            do {            
                modelo = JOptionPane.showInputDialog(null, "Escolha", "Suleiman Moraes", JOptionPane.PLAIN_MESSAGE,
                    null, op, "Marcopolo");

                Modelo ob = Fabrica.getModelo(modelo.toString());
                saida(ob);
            } while (true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
}

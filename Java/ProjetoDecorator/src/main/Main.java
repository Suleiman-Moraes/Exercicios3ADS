package main;

import model.Policial;
import model.Sim;
import model.SimHomen;

public class Main {
    public static void main(String[] args) {
        Sim sim1 = new SimHomen("Sim homen", 21);
        System.out.println("-------------------------------------------------");
        System.out.println("Nome: " + sim1.getNome());
        System.out.println("Nome com profissão : " + sim1.getNomeComposto());
        System.out.println("Profissao: " + sim1.getProfissao());
        System.out.println("-------------------------------------------------");
        
        sim1 = new Policial(sim1);
        System.out.println("-------------------------------------------------");
        System.out.println("Nome: " + sim1.getNome());
        System.out.println("Nome com profissão : " + sim1.getNomeComposto());
        System.out.println("Profissao: " + sim1.getProfissao());
        System.out.println("-------------------------------------------------");
    }
}

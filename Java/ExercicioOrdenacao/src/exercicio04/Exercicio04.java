package exercicio04;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Exercicio04 {
    public static void main(String[] args) throws Exception {
        try {
            List shellSortMatricula = new ArrayList();
            List shellSortNome = new ArrayList();
            List bolhaNome = new ArrayList();
            List bolhaMatricula = new ArrayList();

            //Receber dados
            shellSortMatricula = Metodos.lerDados();
            shellSortNome = Metodos.lerDados();
            bolhaMatricula = Metodos.lerDados();
            bolhaNome = Metodos.lerDados();
            
            //ordenacao
            shellSortMatricula = Metodos.shellSortMatricula(shellSortMatricula);
            shellSortNome = Metodos.shellSortNome(shellSortNome);
            bolhaMatricula = Metodos.bolhaMatricula(bolhaMatricula);
            bolhaNome = Metodos.bolhaNome(bolhaNome);

            //Impressão
            System.out.println("Ordenado por Nome: ");
            System.out.println("Bolha: ");
            System.out.println(Metodos.imprimir(bolhaNome));
            System.out.println("\n\n\nShellSort");
            System.out.println(Metodos.imprimir(shellSortNome));
            System.out.println("\n\n\nOrdenado por Matricula: ");
            System.out.println("Bolha: ");
            System.out.println(Metodos.imprimirMatricula(bolhaMatricula));
            System.out.println("\n\n\nShellSort");
            System.out.println(Metodos.imprimirMatricula(shellSortMatricula));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
}

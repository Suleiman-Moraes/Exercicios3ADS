package exercicios.exercicio08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import util.ListaSimples;

public class Exercicio08 {
    private static final String nomeDoArquivo = 
            new File("src\\arquivo\\produto.csv").getAbsolutePath();
    
    public static Lista lerDados() throws Exception{
        try {
            Lista lista = new Lista();
            //Le o arquivo
            FileReader lerParanaue = new FileReader(nomeDoArquivo);
            //Caixa dagua de leitura
            BufferedReader caixaDaguaDeLeitura = new BufferedReader(lerParanaue);

            String linha = "";

            while ((linha = caixaDaguaDeLeitura.readLine()) != null) {
                Produto objetoAux = new Produto();
                objetoAux.materializa(linha);
                lista.insereOrdenado(objetoAux);
            }

            caixaDaguaDeLeitura.close();

            return lista;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public static void main(String[] args) {
        try {
            Lista lista = lerDados();
            System.out.println(lista.pegarElemento(5));
            System.out.println(lista.pegarElemento(999999));
            System.out.println(lista.retirarElemento(20));
            System.out.println(lista.retirarElemento(9999));
            Produto aux = (Produto) lista.retirarElemento(18);
            aux.setDescricao("Batata");
            aux.setPreco(0);
            lista.insereOrdenado(aux);
            lista.mostraLista();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

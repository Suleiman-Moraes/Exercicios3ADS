package persistencia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import model.Aluno;

public class LerArquivo {
    private static final String nomeDoArquivo = 
            new File("src\\dados\\ProfessoresDaEscola.csv").getAbsolutePath();
    public static List lerDados() throws Exception{
        try {
            List<Aluno> lista = new ArrayList<Aluno>();
            //Le o arquivo
            FileReader lerParanaue = new FileReader(nomeDoArquivo);
            //Caixa dagua de leitura
            BufferedReader caixaDaguaDeLeitura = new BufferedReader(lerParanaue);

            String linha = "";

            while ((linha = caixaDaguaDeLeitura.readLine()) != null) {
                Aluno objetoAux = new Aluno();
                objetoAux.materializar(linha);
                lista.add(objetoAux);
            }

            caixaDaguaDeLeitura.close();

            return lista;
        } catch (Exception e) {
            throw e;
        }
    }
}

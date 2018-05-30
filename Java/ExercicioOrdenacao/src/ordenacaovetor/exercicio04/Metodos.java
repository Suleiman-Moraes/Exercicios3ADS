package ordenacaovetor.exercicio04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import ordenacaovetor.util.UComparacao;

public class Metodos {
    private static final String nomeDoArquivo = 
            new File("src\\exercicio04\\arquivo\\ListaGeralDeDados.csv").getAbsolutePath();
    
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
    
    public static List bolhaNome(List<Aluno> vetor) {
        int i, j;
        Aluno aux = null;
        boolean troca = false;
        for (i = vetor.size() - 1; i > 0; i--) {
            troca = false;

            for (j = 0; j < i; j++) {
                if(!(UComparacao.comparar(vetor.get(j).getNome(), vetor.get(j + 1).getNome()))){
                    aux = new Aluno(vetor.get(j));
                    vetor.get(j).setAluno(vetor.get(j + 1));
                   vetor.get(j + 1).setAluno(aux);
                    troca = true;
                }
            }
            if (!troca) {
                break;
            }
        }
        return vetor;
    }
    public static List bolhaMatricula(List<Aluno> vetor) {
        int i, j;
        Aluno aux = null;
        boolean troca = false;
        for (i = vetor.size() - 1; i > 0; i--) {
            troca = false;

            for (j = 0; j < i; j++) {
                if(!(UComparacao.compararMatricula(vetor.get(j).getMatricula(), vetor.get(j + 1).getMatricula()))){
                    aux = new Aluno(vetor.get(j));
                    vetor.get(j).setAluno(vetor.get(j + 1));
                   vetor.get(j + 1).setAluno(aux);
                    troca = true;
                }
            }
            if (!troca) {
                break;
            }
        }
        return vetor;
    }
    
    public static List shellSortNome(List<Aluno> vetor) {
        int i, pos, h = 1;
        Aluno valor = null;
        do {
            h = 3 * h + 1;
        } while (h < vetor.size());
        do {
            h = h / 3;
            for (i = h; i < vetor.size(); i++) {
                valor = new Aluno(vetor.get(i));
                pos = i - h;
                while (pos >= 0 && UComparacao.comparar(valor.getNome(), vetor.get(pos).getNome())) {
                    vetor.get(pos + h).setAluno(vetor.get(pos));
                    pos = pos - h;
                }
                vetor.get(pos + h).setAluno(valor);
            }
        } while (h > 1);

        return vetor;
    }
    
    public static List shellSortMatricula(List<Aluno> vetor) {
        int i, pos, h = 1;
        Aluno valor = null;
        do {
            h = 3 * h + 1;
        } while (h < vetor.size());
        do {
            h = h / 3;
            for (i = h; i < vetor.size(); i++) {
                valor = new Aluno(vetor.get(i));
                pos = i - h;
                while (pos >= 0 && UComparacao.compararMatricula(valor.getMatricula(), vetor.get(pos).getMatricula())) {
                    vetor.get(pos + h).setAluno(vetor.get(pos));
                    pos = pos - h;
                }
                vetor.get(pos + h).setAluno(valor);
            }
        } while (h > 1);

        return vetor;
    }
    
    public static String imprimir(List<Aluno> lista){
        StringBuffer tudo = new StringBuffer("");
        lista.forEach(x -> {
            tudo.append("Nome: ").append(x.getNome());
            tudo.append(" || Matricula: ").append(x.getMatricula());
            tudo.append(" || Matriz Curricular: ").append(x.getMatrizCurricular());
            tudo.append(" || Tipo do Ingresso: ").append(x.getTipoDoIngresso());
            tudo.append(" || Turno: ").append(x.getTurno()).append("\n");
        });
        return tudo.toString();
    }
    public static String imprimirMatricula(List<Aluno> lista){
        StringBuffer tudo = new StringBuffer("");
        lista.forEach(x -> {
            tudo.append("Matricula: ").append(x.getMatricula());
            tudo.append(" || Nome: ").append(x.getNome());
            tudo.append(" || Matriz Curricular: ").append(x.getMatrizCurricular());
            tudo.append(" || Tipo do Ingresso: ").append(x.getTipoDoIngresso());
            tudo.append(" || Turno: ").append(x.getTurno()).append("\n");
        });
        return tudo.toString();
    }
}

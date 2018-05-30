package util;

import java.util.List;
import model.Aluno;

public abstract class ClasseOrdenacao{
    
    public List bolha(List<Aluno> vetor) throws Exception{
        int i, j;
        Aluno aux = null;
        boolean troca = false;
        for (i = vetor.size() - 1; i > 0; i--) {
            troca = false;
            
            for (j = 0; j < i; j++) {
                if(!(compara(vetor.get(j), vetor.get(j + 1)))){
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

    public abstract boolean compara(Aluno a, Aluno b);
}

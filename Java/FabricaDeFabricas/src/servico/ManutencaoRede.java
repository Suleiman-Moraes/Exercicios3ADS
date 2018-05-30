package servico;

import enums.Legendas;
import interfaces.IServico;

public class ManutencaoRede implements IServico{
    private String valor = "R$ 200,00";
    private final Legendas legenda = Legendas.MANUTENCAOREDE;
    private String descricao = legenda.getNome();
    
    @Override
    public String getValor() {
        return this.valor;
    }

    @Override
    public String getDescricao() {
        return this.descricao;
    }
    
}

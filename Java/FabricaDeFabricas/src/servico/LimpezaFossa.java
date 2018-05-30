package servico;

import enums.Legendas;
import interfaces.IServico;

public class LimpezaFossa implements IServico{
    private String valor = "R$ 100,00";
    private String descricao = Legendas.LIMPEZAFOSSA.getNome();
    private final Legendas legenda = Legendas.LIMPEZAFOSSA;
    
    @Override
    public String getValor() {
        return this.valor;
    }

    @Override
    public String getDescricao() {
        return this.descricao;
    }
    
}

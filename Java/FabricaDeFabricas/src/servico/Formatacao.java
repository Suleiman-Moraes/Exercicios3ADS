package servico;

import enums.Legendas;
import interfaces.IServico;

public class Formatacao implements IServico{
    private String valor = "R$ 50,00";
    private final Legendas legenda = Legendas.FORMATACAO;
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

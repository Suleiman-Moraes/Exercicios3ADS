package fabrica.concreta;

import enums.Legendas;
import fabrica.FabricaAbstrata;
import interfaces.IServico;

public class FernandoLimpaFossa extends FabricaAbstrata{
    private final Legendas legenda = Legendas.FERNANDOLIMPAFOSSA; 
    
    public FernandoLimpaFossa() {
        this.empresa = Legendas.FERNANDOLIMPAFOSSA.getNome();
        this.cidade = "Goiânia";
    }
    
    @Override
    public Object[] getListaDeServicos() {
        Object[] lista = {Legendas.LIMPEZAFOSSA, Legendas.DESINTUPIMENTO};
        return lista;
    }

    @Override
    public IServico getServico(Legendas legendas) throws Exception{
        return (IServico) Class.forName("servico." + legendas.getClasse()).newInstance();
    }

    public Legendas getLegenda() {
        return legenda;
    }
}

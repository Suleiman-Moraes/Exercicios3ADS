package fabrica.concreta;

import enums.Legendas;
import fabrica.FabricaAbstrata;
import interfaces.IServico;

public class EletroInformatica extends FabricaAbstrata{
    private final Legendas legenda = Legendas.ELETROINFORMATICA; 
    
    public EletroInformatica() {
        this.empresa = Legendas.ELETROINFORMATICA.getNome();
        this.cidade = "Aparecida de Goiânia";
    }

    @Override
    public Object[] getListaDeServicos() {
        Object[] lista = {Legendas.FORMATACAO, Legendas.MANUTENCAOREDE};
        return lista;
    }

    @Override
    public IServico getServico(Legendas legendas) throws Exception {
        return (IServico) Class.forName("servico." + legendas.getClasse()).newInstance();
    }
    
    public Legendas getLegenda() {
        return legenda;
    }
}

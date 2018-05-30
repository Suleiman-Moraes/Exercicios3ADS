package fabrica;

import enums.Legendas;
import interfaces.IServico;

public abstract class FabricaAbstrata {
    protected String empresa;
    protected String cidade;
    
    public static FabricaAbstrata getInstance(Legendas legendas) throws Exception{
        return (FabricaAbstrata) Class.forName("fabrica.concreta." + legendas.getClasse()).newInstance();
    }
    public static  Object[] getListaFabrica(){
        Object[] lista = {Legendas.ELETROINFORMATICA, Legendas.FERNANDOLIMPAFOSSA};
        return lista;
    }
    public abstract Object[] getListaDeServicos();
    public abstract IServico getServico(Legendas legendas) throws Exception;
    public String getEmpresa() {
        return empresa;
    }
    public String getCidade() {
        return cidade;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}

package enums;
public enum Legendas {
    FERNANDOLIMPAFOSSA("FernandoLimpaFossa", "Fernando Limpa Fossa"),
    ELETROINFORMATICA("EletroInformatica", "Eletro Informática"),
    LIMPEZAFOSSA("LimpezaFossa", "Limpeza de Fossas"),
    DESINTUPIMENTO("Desintupimento", "Desentupimento de Caixa de Gordura"),
    FORMATACAO("Formatacao", "Formatação"),
    MANUTENCAOREDE("ManutencaoRede", "Manutenção em Rede");
    
    private String classe;
    private String nome;

    private Legendas(String classe, String nome) {
        this.classe = classe;
        this.nome = nome;
    }
    public String getClasse() {
        return classe;
    }
    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome;
    }
    
}

package model;
public class Policial extends Profissao{
    private Sim sim;
    
    public Policial(Sim sim){
        this.sim = sim;
    }

    @Override
    public String getNomeComposto() {
        return sim.getNomeComposto() + " Policial";
    }

    @Override
    public String getProfissao() {
        return "Policial";
    }

    @Override
    public String getNome() {
        return sim.getNome();
    }
}

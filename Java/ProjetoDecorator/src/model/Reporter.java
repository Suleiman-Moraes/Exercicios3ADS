package model;
public class Reporter extends Profissao{
    private Sim sim;
    
    public Reporter(Sim sim){
        this.sim = sim;
    }

    @Override
    public String getProfissao() {
        return sim.getProfissao() + "Reporter";
    }

    @Override
    public String getNomeComposto() {
        return sim.getNomeComposto() + "Reporter";
    }
}

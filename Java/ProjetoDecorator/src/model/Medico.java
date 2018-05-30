package model;
public class Medico extends Profissao{
    private Sim sim;
    
    public Medico(Sim sim){
        this.sim = sim;
    }

    @Override
    public String getProfissao() {
        return "Médico";
    }

    @Override
    public String getNomeComposto() {
        return sim.getNomeComposto() + "Médico";
    }
}

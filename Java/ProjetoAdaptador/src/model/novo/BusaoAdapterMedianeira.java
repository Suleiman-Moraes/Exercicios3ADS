package model.novo;

import interfaces.IVendas;

public class BusaoAdapterMedianeira implements IVendas{

    String etinerario;
    Medianeira medianeira = null;

    public BusaoAdapterMedianeira(String etinerario) {
        this.etinerario = etinerario;
        this.medianeira = new Medianeira(etinerario);
    }
    
    @Override
    public void alocarPoltronas(boolean ocupacao, int posicao) throws Exception {
        medianeira.alocarPoltronasNoMedianeira(ocupacao, posicao);
    }

    @Override
    public void restart() {
        medianeira.restartNoMedianeira();
    }

    @Override
    public String miniatura() {
        return medianeira.miniaturaNoMedianeira();
    }
    
}

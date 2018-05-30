package interfaces;

import java.util.List;

public interface IVendas {
    void alocarPoltronas(boolean ocupacao, int posicao) throws Exception; 
    void restart();
    String miniatura();
}

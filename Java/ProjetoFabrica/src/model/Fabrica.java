package model;
public class Fabrica {
    public static Modelo getModelo(String marca) throws Exception{
        Modelo m = null;
        m = (Modelo) Class.forName("model." + marca).newInstance();
        
        return m;
    }
}

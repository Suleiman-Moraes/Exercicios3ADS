package ordenacaovetor.util;

import java.util.Random;

public class URandom {

    public static int gerador(int ate) {
        Random gerador = new Random();
        return gerador.nextInt(ate);
    }
    public static int gerador(int de, int ate) {
        Random gerador = new Random();
        return gerador.nextInt(ate) + de;
    }
}

package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UComparacao {
    public static boolean comparar(String a, String b){
        if(a.compareToIgnoreCase(b) <= 0) return true;
        else return false;
    }
    public static boolean comparar(char a, char b){
        if(a <= b) return true;
        return false;
    }
    public static boolean compararMatricula(String a, String b){
        try {
            String vetA[] = a.replace('.','#').split("#");
            String vetB[] = b.replace('.','#').split("#");

            for (int i = 0; i < vetA.length; i++) {
                int aa, bb;
                aa = Integer.parseInt(vetA[i]);
                bb = Integer.parseInt(vetB[i]);
                if(aa > bb) return false;
                else if(aa < bb) return true;

            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public static boolean comparar(long a, long b){
        if(a <= b) return true;
        return false;
    }
    public static boolean comparar(double a, double b){
        if(a <= b) return true;
        return false;
    }
    public static boolean comparar(Date a, Date b){
        String da = new SimpleDateFormat("yyyy/MM/dd").format(a);
        String db = new SimpleDateFormat("yyyy/MM/dd").format(b);
        return comparar(da, db);
    }
}

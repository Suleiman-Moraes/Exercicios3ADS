package exercicios;

public class Exercicios {
    public static void main(String[] args) {
//        System.out.println(exercicio02Iterativo(5));
//        System.out.println(exercicio02Recurso(5));
//        
//        System.out.println(exercicio01Iterativo(5));
//        System.out.println(exercicio01Recurso(5));
//        
//        System.out.println(exercicio03Iterativo(3));
//        System.out.println(exercicio03Recurso(3));
//        
//        System.out.println(exercicio04Iterativo(4, 4));
//        System.out.println(exercicio04Recurso(4, 4));
//        
//        exercicio05Iterativo(7);
//        System.out.println("");
//        System.out.println(exercicio05Recurso(7));
//
//        System.out.println(exercicio06Iterativo(4, 4));
//        System.out.println(exercicio06Recurso(4, 4));
//
//        exercicio07Iterativo(10);
//        exercicio07Recurso(10);
//        System.out.println("");
//        
//        exercicio08Iterativo(10);
//        exercicio08Recurso(10);
//        System.out.println("");
//
//        exercicio09Iterativo(10);
//        exercicio09Recurso(10);
//        System.out.println("");
//        
//        exercicio10Iterativo(10);
//        exercicio10Recurso(10);
//        System.out.println("");
//        
//        System.out.println(exercicio11Iterativo());
//        System.out.println(exercicio11Recursivo(50));
//        
//        System.out.printf("%.2f\n", exercicio12Iterativo());
//        System.out.printf("%.2f\n", exercicio12Recursivo(50));
//        
//        System.out.println(exercicio13Iterativo());
//        System.out.println(exercicio13Recursivo(37));
//        
//        System.out.println(exercicio14Iterativo());
//        System.out.println(exercicio14Recursivo(10));
//        
//        System.out.println(exercicio15Iterativo());
//        System.out.println(exercicio15Recursivo(10));
//        
//        System.out.println(exercicio17Iterativo());
//        System.out.println(exercicio17Recursivo(10));
        
        System.out.println(exercicio18Iterativo(10, 25));
        System.out.println(exercicio18Recursivo(10, 25));

//        System.out.println(exercicio19Iterativo(32345));
//        System.out.println(exercicio19Recursivo(32345));
//        
//        System.out.println(exercicio20Iterativo(100));
//        System.out.println(exercicio20Recursivo(100));
    }
    
    public static int exercicio01Iterativo(int n){
        int x = n;
        for (int i = n - 1; i >= 0; i--) {
            x = (x + i);
        }
        return x;
    }
    public static int exercicio01Recurso(int n){
        if (n <= 0) {
            return 0;
        } else {
            return n + exercicio01Recurso(n - 1);
        }
    }
    
    public static int exercicio02Iterativo(int n){
        int x = n;
        for (int i = n - 1; i > 0; i--) {
            x = (x * i);
        }
        if(x == 0) return 1;
        return x;
    }
    public static int exercicio02Recurso(int n){
        if (n <= 1) {
            return 1;
        } else {
            return n * exercicio02Recurso(n - 1);
        }
    }
    
    public static float exercicio03Iterativo(int n){
        float x = 0;
        for (int i = 1; i <= n; i++) {
            x = x + (float) Math.pow(i, 3);
        }
        return x;
    }
    public static int exercicio03Recurso(int n){
        if (n <= 1) {
            return n;
        } else {
            return (int) (exercicio03Recurso(n - 1) + Math.pow(n, 3));
        }
    }
    
    public static float exercicio04Iterativo(int k, int n){
        float x = 1;
        for (int i = 0; i < n; i++) {
            x = x * k;
        }
        return x;
    }
    public static float exercicio04Recurso(int k, int n){
        if (n <= 1) {
            return k;
        } else {
            return exercicio04Recurso(k, (n = n - 1)) * k;
        }
    }
    
    public static void exercicio05Iterativo(int n){
        int a = 1;
        int b = 0;
        System.out.print(b + " ");
        System.out.print(a + " ");
        for (int i = 0; i < n - 1; i++) {
            int aux = a;
            a = a + b;
            b = aux;
            System.out.print(a + " ");
        }
    }
    public static int exercicio05Recurso(int n){
        if(n <= 2){
            return 1;
        }else{
            return exercicio05Recurso(n -1) + exercicio05Recurso(n -2);
        }
    }
    
    public static int exercicio06Iterativo(int k, int n){
        int x = 0;
        for (int i = 0; i < n; i++) {
            x = x + k;
        }
        return x;
    }
    public static int exercicio06Recurso(int k, int n){
        if (n <= 1) {
            return k;
        } else {
            return exercicio06Recurso(k, (n = n - 1)) + k;
        }
    }
    
    public static void exercicio07Iterativo(int n){
        for (int i = 0; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
    public static int exercicio07Recurso(int n){
        if(n <= 0){
            System.out.print("0 ");
            return 0;
        }
        else{
            exercicio07Recurso(n - 1);
            System.out.print(n + " ");
            return n;
        }
    }
    
    public static void exercicio08Iterativo(int n){
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
    public static int exercicio08Recurso(int n){
        if(n <= 0){
            System.out.print("0 ");
            return 0;
        }
        else{
            System.out.print(n + " ");
            return exercicio08Recurso(n - 1);
        }
    }
    
    public static void exercicio09Iterativo(int n){
        for (int i = 0; i <= n; i++) {
            if(i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println("");
    }
    public static int exercicio09Recurso(int n){
        if(n <= 0){
            System.out.print("0 ");
            return 0;
        }
        else{
            exercicio09Recurso(n - 1);
            if(n % 2 == 0) System.out.print(n + " ");
            return n;
        }
    }
    
    public static void exercicio10Iterativo(int n){
        for (int i = n; i >= 0; i--) {
            if(i % 2 == 0) System.out.print(i + " ");
        }
        System.out.println("");
    }
    public static int exercicio10Recurso(int n){
        if(n <= 0){
            System.out.print("0 ");
            return 0;
        }
        else{
            if(n % 2 == 0) System.out.print(n + " ");
            return exercicio10Recurso(n - 1);
        }
    }
    
    public static float exercicio11Iterativo(){
        int u = 0;
        float soma = 0;
        for (int i = 1; i <= 50; i++) {
            soma += (u + i) / i;
            u = i;
        }
        return soma;
    }
    public static float exercicio11Recursivo(int n){
        if(n <= 1){
            return 1;
        }
        else{
            return exercicio11Recursivo(n - 1) + ((n-1 + n)/n);
        }
    }
    
    public static float exercicio12Iterativo(){
        int u = 0;
        float soma = 0;
        for (int i = 1; i <= 50; i++) {
            soma += Math.pow(2, i) / (51 - i);
        }
        return soma;
    }
    public static float exercicio12Recursivo(int n){
        if(n <= 1){
            return (float) Math.pow(2, n);
        }
        else{
            return (float) (exercicio12Recursivo(n - 1) + (Math.pow(2, n)/(51 - n)));
        }
    }
    
    public static int exercicio13Iterativo(){
        int soma = 0;
        for (int i = 1; i <= 37; i++) {
            soma += ((37 - i + 1) * (37 - i + 2)) / i;
//            System.out.print((37 - i + 1) + " * " + (37 - i + 2) + " / " + i + " || ");
        }
        return soma;
    }
    public static int exercicio13Recursivo(int n){
        if(n <= 1){
            return ((37 - n + 1) * (37 - n + 2)) / n;
        }
        else{
            return exercicio13Recursivo(n - 1) + ((37 - n + 1) * (37 - n + 2)) / n;
        }
    }
    
    public static int exercicio14Iterativo(){
        int soma = 0;
        for (int i = 1; i <= 10; i++) {
            if(i % 2 == 0){
                soma -= (i / (i * i));
//                System.out.println("- " + i + "/" + (i * i));
            }else{
                soma += (i / (i * i));
//                System.out.println("+ " + i + "/" + (i * i));
            }
        }
        return soma;
    }
    public static int exercicio14Recursivo(int n){
        if(n <= 1){
//            System.out.println("+ " + n + "/" + (n * n));
            return (n / (n * n));
        }
        else{
            if(n % 2 == 0){
//                System.out.println("- " + n + "/" + (n * n));
                return exercicio14Recursivo(n - 1) - (n / (n * n));
            }else{
//                System.out.println("+ " + n + "/" + (n * n));
                return exercicio14Recursivo(n - 1) + (n / (n * n));
            }
        }
    }
    
    public static int exercicio15Iterativo(){
        int soma = 0;
        for (int i = 1; i <= 10; i++) {
            if(i % 2 == 0){
                soma -= ((1003 - (i * 3)) / i);
//                System.out.println("- " + (1003 - (i * 3)) + "/" + i);
            }else{
                soma += ((1003 - (i * 3)) / i);
//                System.out.println("+ " + (1003 - (i * 3)) + "/" + i);
            }
        }
        return soma;
    }
    public static int exercicio15Recursivo(int n){
        if(n <= 1){
            System.out.println("+ " + (1003 - (n * 3)) + "/" + n);
            return ((1003 - (n * 3)) / n);
        }
        else{
            if(n % 2 == 0){
                System.out.println("- " + (1003 - (n * 3)) + "/" + n);
                return exercicio15Recursivo(n - 1) - ((1003 - (n * 3)) / n);
            }else{
                System.out.println("+ " + (1003 - (n * 3)) + "/" + n);
                return exercicio15Recursivo(n - 1) + ((1003 - (n * 3)) / n);
            }
        }
    }
    
//    public static int exercicio16Iterativo(){
//        int soma = 0;
//        for (int i = 1; i <= 10; i++) {
//            if(i % 2 == 0){
//                soma -= ((1003 - (i * 3)) / i);
////                System.out.println("- " + (1003 - (i * 3)) + "/" + i);
//            }else{
//                soma += ((1003 - (i * 3)) / i);
////                System.out.println("+ " + (1003 - (i * 3)) + "/" + i);
//            }
//        }
//        return soma;
//    }
//    public static int exercicio16Recursivo(int n){
//        if(n <= 1){
//            System.out.println("+ " + (1003 - (n * 3)) + "/" + n);
//            return ((1003 - (n * 3)) / n);
//        }
//        else{
//            if(n % 2 == 0){
//                System.out.println("- " + (1003 - (n * 3)) + "/" + n);
//                return exercicio16Recursivo(n - 1) - ((1003 - (n * 3)) / n);
//            }else{
//                System.out.println("+ " + (1003 - (n * 3)) + "/" + n);
//                return exercicio16Recursivo(n - 1) + ((1003 - (n * 3)) / n);
//            }
//        }
//    }
    
    public static int exercicio17Iterativo(){
        int soma = 4;
        for (int i = 0; i < 10; i++) {
            if((((3 + (2 * i)) - 3) )/ 2 % 2 == 0){
                soma -= (4 / (3 + (2 * i)));
//                System.out.println("- " + 4 + "/" + (3 + (2 * i)));
            }else{
                soma += (4 / (3 + (2 * i)));
//                System.out.println("+ " + 4 + "/" + (3 + (2 * i)));
            }
        }
        return soma;
    }
    public static int exercicio17Recursivo(int n){
        if(n <= -1){
//            System.out.println("+ " + 4);
            return 4;
        }
        else{
            if((((3 + (2 * n)) - 3) / 2) % 2 == 0){
//                System.out.println("- " + 4 + "/" + (3 + (2 * n)));
                return exercicio17Recursivo(n - 1) - (4 / (3 + (2 * n)));
            }else{
//                System.out.println("+ " + 4 + "/" + (3 + (2 * n)));
                return exercicio17Recursivo(n - 1) + (4 / (3 + (2 * n)));
            }
        }
    }
    
    public static int exercicio18Iterativo(int x, int y){
        int cont = 1;
        int div = 0;
        while(cont <= x || cont <= y){
            if(x % cont == 0 && y % cont == 0){
                div = cont;
            }
            cont ++;
        }
        return div;
    }
    public static int exercicio18Recursivo(int x, int y){
        if (y <= x && x % y == 0) {  
            return y;  
        } else if (y > x) {  
            return exercicio18Recursivo(y, x);  
        } else {  
            return exercicio18Recursivo(y, x % y);  
        }  
    }
    
    
    public static int exercicio19Iterativo(int n){
        int soma = 0;
        while (n > 0) {
//            System.out.println(n);
            soma += (n % 10);
            n = n / 10;
        }
        return soma;
    }
    public static int exercicio19Recursivo(int n){
        if(n <= 9){
//            System.out.println(n);
            return n;
        }
        else{
//            System.out.println(n);
            return exercicio19Recursivo(n / 10) + n % 10;
        }
    }
    
    public static int exercicio20Iterativo(int n){
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            if(Math.sqrt(i) % 1 == 0){
//                System.out.println(i);
                soma += i;
            }
        }
        return soma;
    }
    public static int exercicio20Recursivo(int n){
        if(n <= 1){
//            System.out.println(n);
            return n;
        }
        else{
            if(Math.sqrt(n) % 1 == 0){
                return exercicio20Recursivo(n - 1) + n;
            }else{
                return exercicio20Recursivo(n - 1) + 0;
            }
        }
    }
}

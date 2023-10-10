public class P2p4_1s21 {
    public static void main(String[] args) {
        int contador = 0;
        int numero = 2;
        
        while (contador < 25) {
            if (esPrimo(numero)) {
                System.out.print(numero + " ");
                contador++;
            }
            numero++;
        }
    }
    
    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

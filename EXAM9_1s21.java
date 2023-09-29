import java.util.Scanner;

public class EXAM9_1s21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int resistencia;
        int corriente;
        double potencia;

        System.out.println("9.- Crear un programa que calcule la caída de potencial producida por una resistencia según la ley de Ohm");
        System.out.print("Ingresa el valor de la resistencia en ohmios de entre el 0 al 1000: ");
        resistencia = teclado.nextInt();
        if (resistencia < 0) {
            System.out.println("El valor de la resistencia es negativo no se puede seguir el procedimiento.");
        } else if (resistencia > 1000) {
            System.out.println("El valor de la resistencia es mayor que 1000 ohmios no se puede seguir el procedimiento.");
        } else {
            System.out.println("Ingresa el valor de la corriente: ");
            corriente = teclado.nextInt();
            potencia = corriente * corriente * resistencia;
            System.out.println("La caída de potencia es: " + potencia);
        }

        teclado.close();
    }
}
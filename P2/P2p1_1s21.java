public class P2p1_1s21{
	public static void main (String[] args) {
      int a=12;
      if (a<10) {
      	System.out.println("Si ingreso porque es verdadero");
      }
      if (a>10) {
      	System.out.println("este segmento si se ejecuta porque se cumple la cumple");
      }
      if (true){
      	System.out.println("aqui se ejecuta porque es verdadero");
      }
      if (false){
      	System.out.println("esto no se ejecuta porque es falso");
      }
      if ((a>10) ==true){
      	System.out.println("se ejecutara?");
      }
      System.out.println("continuamos con el codigo");
      System.out.println("");

      a= 18;

      if (a>17){
          System.out.println("eres mayor de edad");
      } else {
      	System.out.println("eres menor de edad");
      }

      a=3;

      if (a == 1) {
      	System.out.println("Se evaluo a 1");
      }else if (a ==2){
      	System.out.println("se evaluo a 2");
      }else if (a ==3){
      	System.out.println("se evaluo a 3");
      }else{
      	System.out.println("se evaluaron los demas digitos");
      }
      int divisor=0;
      int dividendo=0;

      if (divisor == 0){
      	System.out.println("No es posible hacer la division");
      }else{
      	System.out.println("Si puedo realizar la division");
      }
    }
}
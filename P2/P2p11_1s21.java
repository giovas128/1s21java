public class practica_7{
	public static void main(String[] args) {
			for (String cadena : args ) {
			char operacion = cadena.charAt(1);
		    if (operacion == '?') {
		    	System.out.println("parametros");
			    System.out.println("a");
			    System.out.println("b");
			    System.out.println("h");
			    System.out.println("e");
			    System.out.println("escriba el parametro");
			    Scanner teclado = new Scanner(System.in);
			    String a="a";
			    a = teclado.nextLine();
			    switch(a){
			    case "a":
			    	System.out.println("analisis de datos");
			    	break;
			    case "b":
			    	System.out.println("instalaciones avanzadas");
			    	break;
			    case "h":
			    	System.out.println("parametro         mensaje");
			    	System.out.println("a                 mensaje de analisis de datos");
			    	System.out.println("b                 mensaje para instalacion avanzada");
			        System.out.println("h                 mostrara toda esta lista de parametros");
			        System.out.println("e                 ejecutara el programa sin ningun elemento");
			        break;
			    case "e":
			    	System.out.println("se ejecuto sin ningun elemento");
			    	break;
			        }
			    }else{
			System.out.println("Estamos eejecuntando el programa de forma correcta");	    
	        }
	    }
	}
}

import java.util.Scanner;

public class conversionesTipos {
    public static void main(String args[]){
        //Convertir tipo string a un tipo int
        var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad + 1));
        
        var edad1 = "20";
        System.out.println("edad1 = " + (edad1 + 1));
        
        var valorPi = Double.parseDouble("3.1416");
        System.out.println("valorPi = " + valorPi);
        
        //Pedir valor
        /*
        
        System.out.println("Proporciona tu edad: ");
        edad = Integer.parseInt(consola.nextLine());
        System.out.println("Edad = " + edad ); */
        
        var consola = new Scanner(System.in);
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        var caracter = "hola".charAt(3);
        System.out.println("caracter = " + caracter);
        
        System.out.println("Proporciona un caracter");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
        
        
    }
    
}

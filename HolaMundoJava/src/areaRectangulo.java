import java.util.Scanner;

public class areaRectangulo {
    public static void main (String args[]){
        
        //Definicion de variables
        var consola = new Scanner(System.in);
        int ancho, largo, perimetro, area;
        
        //Pedir datos al usuario
        System.out.println("Proporcione el largo: " );
        largo = Integer.parseInt(consola.nextLine());
        System.out.println("Proporcione el ancho: ");
        ancho = Integer.parseInt(consola.nextLine());
        
        //Calculos de perimetro y area
        area = largo*ancho;
        perimetro = (largo+ancho)*2;
        
        //Impresion de resultados
        System.out.println("area = " + area);
        System.out.println("perimetro = " + perimetro);
    }
    
}

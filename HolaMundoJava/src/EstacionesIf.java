import java.util.Scanner;

public class EstacionesIf {
    public static void main(String args[]){
        System.out.println("Ingrese el numero de un mes: ");
        var consola = new Scanner(System.in);
        var mes = Integer.parseInt(consola.nextLine());
        if(mes == 12 || mes == 1|| mes == 2 ){
                     System.out.println("INVIERNO");
        }
        else if(mes == 3 || mes == 4|| mes == 5 ){
                     System.out.println("PRIMAVERA");
        }
        else if(mes == 6 || mes == 7|| mes == 8 ){
                     System.out.println("VERANO");
        }
        else if(mes == 9 || mes == 10|| mes == 11 ){
                     System.out.println("OTONO");
        }
        
        
    }
    
}

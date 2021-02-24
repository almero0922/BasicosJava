import java.util.Scanner;
public class numeroMayor {
    public static void main(String args[]){
        var consola = new Scanner(System.in);
        System.out.println("Ingrese el primer valor");
        var primerValor = Integer.parseInt(consola.nextLine());
        System.out.println("Ingrese el segundo valor");
        var segundoValor = Integer.parseInt(consola.nextLine());
        if(primerValor > segundoValor){
            System.out.println("El primer valor es mayor");
        }else {
            System.out.println("El segundo valor es mayor");
        }
    }
    
}

import java.util.Scanner;
public class Switch {
    public static void main(String args[]){
        var consola = new Scanner(System.in);
        var estacion = "Estacion desconocida";
        var mes = 0;
        System.out.println("Ingrese un numero de mes: ");
        mes = Integer.parseInt(consola.nextLine());
        switch(mes){
            case 1: case 2: case 12:
                estacion = "invierno";
                break;
            case 3: case 4: case 5:
                estacion = "primavera";
                break;
            case 6: case 7: case 8:
                estacion = "verano";
                break;
            case 9: case 10: case 11:
                estacion = "otono";
                break;
        }
        System.out.println("mes = " + mes);
        System.out.println("estacion = " + estacion);
    }
    
}

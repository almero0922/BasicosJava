import java.util.Scanner;
public class SistemaDeCalificaciones {
    public static void main (String args[]){
        var calificacion = 0.0;
        var consola = new Scanner(System.in);
        System.out.println("Ingresa un numero del 0 al 10");
        calificacion = Float.parseFloat(consola.nextLine());
        if(calificacion <=10 && calificacion>=9){
            System.out.println("Calificaion: A");
        }
        else if(calificacion>=8 && calificacion<9){
            System.out.println("Calificacion: B" );
        }
        else if(calificacion>=7 && calificacion<8){
            System.out.println("Calificacion: C");
        }
        else if(calificacion>=6 && calificacion<7){
            System.out.println("Calificacion: D");
        }
        else if(calificacion>=0 && calificacion<6){
            System.out.println("Calificacion: F");
        }
        else if(calificacion>10 || calificacion<0){
            System.out.println("Valor desconocido");
        }
    }
}

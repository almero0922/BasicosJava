import java.util.Scanner;
public class operadoresRelacionales {
    public static void main (String args[]){
        var a = 2;
        var b = 4; 
        
        var c = (a == b);
        System.out.println("c = " + c);
        
        var d = a!=b;
        System.out.println("d = " + d);
        
        var cadena = "hola";
        var cadena2 = "adios";
        var cadena3 = cadena == cadena2; //Compara referencia de ob
        System.out.println("cadena = " + cadena3);
        
        var f = cadena.equals(cadena2);
        System.out.println("f = " + f);
        
        var g = a >= b;
        System.out.println("g = " + g);
        
        var h = a <= b;
        System.out.println("h = " + h);
        
        //Ejemplo si un numero es par
        
        var consola = new Scanner(System.in);
        System.out.println("Porfavor ingrese un numero: ");
        var dato = Integer.parseInt(consola.nextLine());
        if(dato % 2 == 0){
            System.out.println("Felicidades la variable a es par");
        }
        else{
            System.out.println("Te la pelas la variable a es impar");
        }
        
        if(dato >= 18){
            System.out.println("El dato es mayor de edad");
            
        }else{
            System.out.println("El dato es menor de edad");
        }
        
        
    }}
    


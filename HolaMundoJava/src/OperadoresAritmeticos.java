
public class OperadoresAritmeticos {
    public static void main (String args[]){
        int a=3, b=2;
        float resultado = a + b;
        System.out.println("Suma = " + resultado);
        
        resultado = a - b;
        System.out.println("Resta = " + resultado);
        
        resultado = a * b;
        System.out.println("Multiplicacion = " + resultado);
        
        resultado = a / b;
        System.out.println("Division = " + resultado);
        
        resultado = a % b;
        System.out.println("Modulo = " + resultado);
        
        if(a % 2 == 0){
            System.out.println("Es numero par");
        }
        else{
            System.out.println("Es numero impar");
        }
    }
    
}

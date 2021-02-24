
public class operadorTernario {
    public static void main(String args[]){
        var resultado = (3>2) ? "verdadero" : "falso";
        System.out.println("resultado = " + resultado);
        
        var numero = 8;
        resultado = (numero % 2 == 0) ? "Tu numero es par" : "Tu numero es impar";
        System.out.println("resultado = " + resultado);
    }
    
}

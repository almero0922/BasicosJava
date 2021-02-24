
public class operadoresCondicionales {
    public static void main (String args[]){
        var a = 10;
        var valorMinimo = 0;
        var valorMaximo = 10;
        
        var resultado = a >= 0 && a <= 10;
        System.out.println("resultado = " + resultado);
        
        resultado = a > valorMinimo && a < valorMaximo;
        System.out.println("resultado = " + resultado);
        
        if(resultado){
            System.out.println("Dentro del rango");
        }else{
            System.out.println("Fuera del rango");
        }
        
        var vacaciones = true;
        var diaDescanso = false;
        
        if(vacaciones || diaDescanso){
            System.out.println("El padre puede asistir al partido de su hijo");
        }else{
            System.out.println("El padre no puede asistir al partido de su hijo");
        }
    }
    
}

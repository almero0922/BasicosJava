
package clases;


public class pruebaPersona {
    public static void main(String args[]){
      Persona persona1 = new Persona();
      persona1.nombre = "Juan";
      persona1.apellido = "Peres";
      persona1.desplegarInformacion();
      
      Persona persona2 = new Persona();
      System.out.println("persona1 = " + persona1);
      System.out.println("persona2 = " + persona2);
      
      persona2.nombre = "Juana";
      persona2.apellido = "Pereza";
      persona2.desplegarInformacion();
    }
    
}

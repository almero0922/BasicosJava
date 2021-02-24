import java.util.Scanner;

public class solicitudTiendaLibros {
    public static void main (String args[]){
        var consola = new Scanner(System.in);
        String titulo;
        int id;
        double precio;
        boolean envioGratuito;
        System.out.println("Bienvenido a la tienda BB's");
        System.out.println("Proporcione el titulo del libro:");
        titulo = consola.nextLine();
        System.out.println("Proporcione el ID: ");
        id = Integer.parseInt( consola.nextLine());
        System.out.println("Proporcione el precio: ");
        precio = Double.parseDouble(consola.nextLine());
        System.out.println("El envio sera gratuito?");
        envioGratuito = Boolean.parseBoolean(consola.nextLine());
        System.out.println("Titulo: = " + titulo + " #ID: " + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio Gratuito: " + envioGratuito); 
    }
    
}

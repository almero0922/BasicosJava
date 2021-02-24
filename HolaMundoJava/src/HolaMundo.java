
import java.util.Scanner;

//Mi clase en Java

public class HolaMundo {

    public static void main(String args[]) {
        System.out.println("Escribe el titulo:");
        Scanner consola = new Scanner(System.in);
        var titulo = consola.nextLine();
        System.out.println("Escribe el autor: ");
        var autor = consola.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);

    }
}

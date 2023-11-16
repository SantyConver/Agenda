import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Mainte {
    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa una palabra.");
        String palabra;
        palabra = entrada.nextLine();
        System.out.println("la palabra ingresada es : ");
        System.out.println(palabra);

        //crear un objeto de la clase FileWriter
        //en el costructor poner el nombre del archivo
        //abro el archivo para escribirlo
        //,true es para agregar en ves de sobre escrivir
        FileWriter escribir = new FileWriter("./Marcos.txt",true);

        //lo que tengo en la variable palabra lo escribo en el archivo.
        escribir.write(palabra);
        escribir.write("\n");
        // se cierra el archivo
        escribir.close();

    }
}
//recibir una palabra y escribirla en un archivo.
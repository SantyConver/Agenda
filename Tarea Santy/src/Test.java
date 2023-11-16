import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        int flag = 0;
        Scanner sc = new Scanner(System.in);


        while (flag != 4) {

            System.out.println("-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|- MENU -|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-");
            System.out.println("Ingrese una de ls siguientes opciones");
            System.out.println("Opcion 1: Agregar Computadora ");
            System.out.println("Opcion 2: Quitar Computadora");
            System.out.println("Opcion 3: Ver Lista de Computadoras");
            System.out.println("Opcion 4: Terminar Orden");

            flag = sc.nextInt();


            switch (flag){

                case 1:{
                    agregarComputadora(crearComputadora)
                }
            }


        }

    }


}

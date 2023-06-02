import javax.sound.midi.Soundbank;
import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        cajero user_one = new cajero();
        int opcion=0;
        do {
            System.out.println("Seleccione una Opcion");
            System.out.println("1. Consulta de Saldo ");
            System.out.println("2. Retiro en Efectivo");
            System.out.println("3. Deposito en Efectivo");
            System.out.println("4. SALIR");
            System.out.println("Opcion:");
            opcion = input.nextInt();
            switch (opcion){

                case 1:
                    user_one.conSultaSaldo();
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad a retirar:");
                    double cantidad_retiro = input.nextDouble();
                    user_one.retirarDinero(cantidad_retiro);
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad a depositar:");
                    double cantidad_deposito = input.nextDouble();
                    user_one.depositarDinero(cantidad_deposito);
                    break;
                case 4:
                    System.out.println("Programa Finalizado...");
                    break;
                default:

                    break;
            }
        }while (opcion != 4);
    }

}

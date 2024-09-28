import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        int option = 0;
        String nombreCliente = "Tony Stark";
        String tipoCuenta = "Cuenta Corriente";
        double saldo = 1599.99;

        System.out.println("*");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo disponible: $" + saldo);
        System.out.println("*");


        while (option != 9) {
            System.out.println("******************************");
            System.out.println("*     BIENVENIDO AL BANCO    *");
            System.out.println("******************************");
            System.out.println("* 1. Consultar saldo         *");
            System.out.println("* 2. Retirar dinero          *");
            System.out.println("* 3. Depositar dinero        *");
            System.out.println("* 9. Salir                   *");
            System.out.println("******************************");
            System.out.print("Seleccione una opción: ");
            option = menu.nextInt();

           switch (option){
               case 1:
                   System.out.println("El saldo actualizado es: " + saldo + "$");
                   break;

               case 2:
                   System.out.println("Cual es el valor que desea retirar?");
                   double valorRetirado = menu.nextDouble();

                   if (saldo < valorRetirado) {
                       System.out.println("Saldo insuficiente");
                   } else {
                       saldo -= valorRetirado;
                       System.out.println("El saldo actualizado es: " + saldo + "$");
                   }
                   break;
               case 3:
                   System.out.println("Cual es el valor a depositar");
                   double valorDeposito = menu.nextDouble();
                   saldo += valorDeposito;
                   System.out.println("El saldo final es: " + saldo + "$");
                   break;
               case 9:
                   System.out.println("gracias por preferirnos");
                   break;

                   default:
                       System.out.println("Opcion Errada");

           }

        }
    }
}

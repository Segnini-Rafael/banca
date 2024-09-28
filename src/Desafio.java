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

        String lista = """
                *** Escriba el numero de la opcion deseada ***
                1 - Consulta saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;

        while (option != 9) {
           System.out.println(lista);
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

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite su nombre: ");
        String nome = scanner.nextLine();
        System.out.println("Digite su edad: ");
        int idade = scanner.nextInt();
        System.out.println("Digite el valor que pretende invertir este mes: ");
        double valor = scanner.nextDouble();

        System.out.println(nome + "que tiene " + idade + " años, ira invertir R$ " + valor + " este mes.");

        scanner.close();
    }
}



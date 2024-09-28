import java.util.Scanner;

public class Desafio2 {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        // Hilo para mostrar los asteriscos "titilando"
        Thread animacion = new Thread(() -> {
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    System.out.print("\r******************************");
                    Thread.sleep(500); // Pausa de 500 ms
                    System.out.print("\r                          ");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                // Se interrumpe el ciclo de animación
            }
        });

        // Iniciar la animación
        animacion.start();

        while (opcion != 9) {
            // Aquí se detiene para esperar la opción del usuario
            System.out.print("\nSeleccione una opción: ");
            opcion = sc.nextInt();

            // Aquí iría la lógica de las opciones
            if (opcion == 9) {
                System.out.println("Gracias por usar nuestros servicios. ¡Hasta luego!");
            } else {
                System.out.println("Opción " + opcion + " seleccionada.");
            }
        }

        // Detiene la animación al salir
        animacion.interrupt();
        sc.close();
    }
}

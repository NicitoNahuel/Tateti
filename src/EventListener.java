/* public interface EventListener implement ActionListener{
    public void cerrar(){
        import java.util.Scanner;

public class ScannerListener {
    public static void main(String[] args) {
        // Crear un hilo separado para escuchar
        Thread scannerThread = new Thread(() -> {
            Scanner sc = new Scanner(System.in);
            System.out.println("Esperando entrada (escribe algo y pulsa Enter)...");
            
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                // AQUÍ OCURRE EL EVENTO
                onInputReceived(linea); 
            }
        });

        scannerThread.start(); // Iniciar "listener"
        
        // El hilo principal puede seguir haciendo otras cosas
        System.out.println("Hilo principal libre...");
    }

    // Método que se ejecuta cuando hay un evento
    public static void onInputReceived(String input) {
        System.out.println(">>> Evento detectado: " + input);
    }
}
    }
}
*/

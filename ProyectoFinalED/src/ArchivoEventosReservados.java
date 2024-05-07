
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class ArchivoEventosReservados {
    private static final String ARCHIVO_EVENTOS = "eventos.txt";
    
    public static void guardarEventosReservados(Set<String> eventosReservados){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_EVENTOS))){
            for (String evento : eventosReservados){
                writer.write(evento);
                writer.newLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    
    public static Set<String> cargarEventosReservados(){
        Set<String> eventosReservados = new HashSet<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_EVENTOS))){
            String linea;
            while ((linea = reader.readLine()) != null){
                eventosReservados.add(linea);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return eventosReservados;
    }
}

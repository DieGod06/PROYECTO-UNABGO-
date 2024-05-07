
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class EventosCalendario {

    private static final String ARCHIVO_CALENDARIO = "eventoscalendario.txt";
    private static Map<Date, String> eventosCalendario = new HashMap<>();

    public static String getEventoParaFecha (Date fecha){
        return eventosCalendario.get(fecha);
    }
    
    static {
        cargarEventosCalendario();
    }

    public static void guardarEventosCalendario(Date fecha, String evento) {
        eventosCalendario.put(fecha, evento);
        guardarEventosCalendario();
    }
    
    public static Map<Date, String> getEventosCalendario(){
        return eventosCalendario;
    }
    
    private static void guardarEventosCalendario(){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_CALENDARIO))){
            for (Map.Entry<Date, String> entry: eventosCalendario.entrySet()){
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String fechaString = sdf.format(entry.getKey());
                writer.write(fechaString + ";" + entry.getValue());
                writer.newLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    
    private static void cargarEventosCalendario(){
        try(BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_CALENDARIO))){
            String linea;
            while ((linea = reader.readLine()) != null){
                String[] partes = linea.split(";");
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date fecha = sdf.parse(partes[0]);
                String evento = partes[1];
                eventosCalendario.put(fecha, evento);
            }
        } catch (IOException | java.text.ParseException e){
            e.printStackTrace();
        }
    }
}

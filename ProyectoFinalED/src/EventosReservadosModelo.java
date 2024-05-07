
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EventosReservadosModelo {

    private static Set<String> eventosReservados = new HashSet<>();
    
    static{
        eventosReservados = ArchivoEventosReservados.cargarEventosReservados();
    }

    public static boolean agregarEventoReservado(String evento) {
        boolean agregado = eventosReservados.add(evento);
        if (agregado){
            ArchivoEventosReservados.guardarEventosReservados(eventosReservados);
        }
        return agregado;
    }

    public static Set<String> getEventosReservados() {
        return eventosReservados;
    }
    
    public static boolean eliminarEventoReservado(String evento){
        boolean eliminado = eventosReservados.remove(evento);
        if (eliminado){
            ArchivoEventosReservados.guardarEventosReservados(eventosReservados);
        }
        return eliminado;
    }
}

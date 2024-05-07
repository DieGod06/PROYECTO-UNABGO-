
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UsuariosDAO {

        private static final String ARCHIVO_USUARIOS = "users.txt";

        public static void guardarUsuario(String nombre, String apellido, String usuario, String contraseña) throws IOException {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_USUARIOS, true))) {
                String lineas = nombre + "," + apellido + "," + usuario + "," + contraseña;
                writer.write(lineas);
                writer.newLine();
            }
        }

        public static List<Usuario> leerUsuarios() throws IOException {
            List<Usuario> usuarios = new ArrayList<>();
            try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_USUARIOS))) {
                String lineas;
                while ((lineas = reader.readLine()) != null) {
                    String[] datos = lineas.split(",");
                    if (datos.length == 4) {
                        String nombre = datos[0];
                        String apellido = datos[1];
                        String usuario = datos[2];
                        String contraseña = datos[3];
                        Usuario nuevoUsuario = new Usuario(nombre, apellido, usuario, contraseña);
                        usuarios.add(nuevoUsuario);
                    }
                }

            }
            return usuarios;
        }
    }

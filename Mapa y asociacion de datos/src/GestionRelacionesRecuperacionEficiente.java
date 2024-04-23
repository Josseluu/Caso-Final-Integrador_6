import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class GestionRelacionesRecuperacionEficiente {
    public static void main(String[] args) {

        JTabbedPane tabbedPane = new JTabbedPane();


        JPanel gestionDatosPanel = new JPanel();
        gestionDatosPanel.add(new JLabel("Contenido de Gestión de Datos"));
        tabbedPane.addTab("Gestión de Datos", gestionDatosPanel);

        JPanel controlUsuariosPanel = new JPanel();
        controlUsuariosPanel.add(new JLabel("Contenido de Control de Usuarios"));
        tabbedPane.addTab("Control de Usuarios", controlUsuariosPanel);

        JPanel panelControlPanel = new JPanel();
        panelControlPanel.add(new JLabel("Contenido de Panel de Control"));
        tabbedPane.addTab("Panel de Control", panelControlPanel);

        // Agregar un escuchador de eventos a cada pestaña
        tabbedPane.addChangeListener(e -> {
            // Obtener el índice de la pestaña seleccionada
            int selectedIndex = tabbedPane.getSelectedIndex();

            // Realizar acciones basadas en la pestaña seleccionada
            switch (selectedIndex) {
                case 0:
                    // Realizar operaciones de gestión de datos
                    gestionDeDatos();
                    break;
                case 1:
                    // Realizar operaciones de control de usuarios
                    controlDeUsuarios();
                    break;
                case 2:
                    // Realizar operaciones de panel de control
                    panelDeControl();
                    break;
                default:
                    break;
            }
        });

        // Crear la ventana principal
        JFrame mainWindow = new JFrame("Ventana Principal");
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.add(tabbedPane);

        // Configurar tamaño y visibilidad de la ventana principal
        mainWindow.setSize(400, 300);
        mainWindow.setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        mainWindow.setVisible(true);
    }

    // Método para operaciones de gestión de datos
    private static void gestionDeDatos() {
        // Mensaje para mostrar en la ventana emergente
        String mensaje = "Gestión de Relaciones:\n\n" +
                "Crear mapas para asociar y gestionar relaciones entre diferentes conjuntos de datos, como:\n" +
                "- Números y letras\n" +
                "- Números y sus representaciones textuales\n\n" +
                "Recuperación Eficiente:\n\n" +
                "Desarrollar métodos para recuperar información asociada de manera eficiente, " +
                "basándose en claves o criterios definidos por el usuario.";

        // Mostrar el mensaje en una ventana emergente
        JOptionPane.showMessageDialog(null, mensaje);

        // Ejemplo de gestión de relaciones
        Map<Integer, String> numerosLetras = new HashMap<>();
        numerosLetras.put(1, "A");
        numerosLetras.put(2, "B");
        numerosLetras.put(3, "C");
        numerosLetras.put(4, "D");
        numerosLetras.put(5, "E");

        // Ejemplo de recuperación eficiente
        String numeroBuscado = JOptionPane.showInputDialog("Ingrese un número para obtener su letra asociada:");
        try {
            int numero = Integer.parseInt(numeroBuscado);
            if (numerosLetras.containsKey(numero)) {
                String letraAsociada = numerosLetras.get(numero);
                JOptionPane.showMessageDialog(null, "La letra asociada al número " + numero + " es: " + letraAsociada);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ninguna letra asociada al número " + numero);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
        }
    }

    // Método para operaciones de control de usuarios
    private static void controlDeUsuarios() {
        // Mensaje para mostrar en la ventana emergente
        String mensaje = "Control de Usuarios:\n\n" +
                "Desarrollar métodos para gestionar usuarios, incluyendo:\n" +
                "- Creación de usuarios\n" +
                "- Modificación de permisos\n" +
                "- Eliminación de usuarios\n\n" +
                "Interactividad de Usuario:\n\n" +
                "Implementar interfaces de usuario intuitivas y amigables para facilitar la interacción del usuario con la aplicación.";

        // Mostrar el mensaje en una ventana emergente
        JOptionPane.showMessageDialog(null, mensaje);

        // Ejemplo de control de usuarios
        String nuevoUsuario = JOptionPane.showInputDialog("Ingrese el nombre del nuevo usuario:");
        JOptionPane.showMessageDialog(null, "Usuario '" + nuevoUsuario + "' creado con éxito.");
    }

    // Método para operaciones de panel de control
    private static void panelDeControl() {
        // Mensaje para mostrar en la ventana emergente
        String mensaje = "Panel de Control:\n\n" +
                "Desarrollar un panel de control para configurar y gestionar la aplicación, " +
                "incluyendo:\n" +
                "- Ajustes de configuración\n" +
                "- Monitorización de procesos\n" +
                "- Administración de recursos\n\n" +
                "Seguridad y Privacidad:\n\n" +
                "Implementar medidas de seguridad y privacidad para proteger los datos y " +
                "garantizar el acceso autorizado a la información.";

        // Mostrar el mensaje en una ventana emergente
        JOptionPane.showMessageDialog(null, mensaje);

        // Ejemplo de panel de control
        JOptionPane.showMessageDialog(null, "Panel de Control: Configuración guardada.");
    }
}
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


        tabbedPane.addChangeListener(e -> {

            int selectedIndex = tabbedPane.getSelectedIndex();


            switch (selectedIndex) {
                case 0:

                    gestionDeDatos();
                    break;
                case 1:

                    controlDeUsuarios();
                    break;
                case 2:

                    panelDeControl();
                    break;
                default:
                    break;
            }
        });


        JFrame mainWindow = new JFrame("Ventana Principal");
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.add(tabbedPane);


        mainWindow.setSize(400, 300);
        mainWindow.setLocationRelativeTo(null);
        mainWindow.setVisible(true);
    }


    private static void gestionDeDatos() {

        String mensaje = "Gestión de Relaciones:\n\n" +
                "Crear mapas para asociar y gestionar relaciones entre diferentes conjuntos de datos, como:\n" +
                "- Números y letras\n" +
                "- Números y sus representaciones textuales\n\n" +
                "Recuperación Eficiente:\n\n" +
                "Desarrollar métodos para recuperar información asociada de manera eficiente, " +
                "basándose en claves o criterios definidos por el usuario.";


        JOptionPane.showMessageDialog(null, mensaje);

        Map<Integer, String> numerosLetras = new HashMap<>();
        numerosLetras.put(1, "A");
        numerosLetras.put(2, "B");
        numerosLetras.put(3, "C");
        numerosLetras.put(4, "D");
        numerosLetras.put(5, "E");


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


    private static void controlDeUsuarios() {
        // Mensaje para mostrar en la ventana emergente
        String mensaje = "Control de Usuarios:\n\n" +
                "Desarrollar métodos para gestionar usuarios, incluyendo:\n" +
                "- Creación de usuarios\n" +
                "- Modificación de permisos\n" +
                "- Eliminación de usuarios\n\n" +
                "Interactividad de Usuario:\n\n" +
                "Implementar interfaces de usuario intuitivas y amigables para facilitar la interacción del usuario con la aplicación.";


        JOptionPane.showMessageDialog(null, mensaje);


        String nuevoUsuario = JOptionPane.showInputDialog("Ingrese el nombre del nuevo usuario:");
        JOptionPane.showMessageDialog(null, "Usuario '" + nuevoUsuario + "' creado con éxito.");
    }

    // Método para operaciones de panel de control
    private static void panelDeControl() {

        String mensaje = "Panel de Control:\n\n" +
                "Desarrollar un panel de control para configurar y gestionar la aplicación, " +
                "incluyendo:\n" +
                "- Ajustes de configuración\n" +
                "- Monitorización de procesos\n" +
                "- Administración de recursos\n\n" +
                "Seguridad y Privacidad:\n\n" +
                "Implementar medidas de seguridad y privacidad para proteger los datos y " +
                "garantizar el acceso autorizado a la información.";


        JOptionPane.showMessageDialog(null, mensaje);


        JOptionPane.showMessageDialog(null, "Panel de Control: Configuración guardada.");
    }
}
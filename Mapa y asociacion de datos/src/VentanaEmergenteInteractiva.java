import javax.swing.*;
import java.util.*;

public class VentanaEmergenteInteractiva {
    public static void main(String[] args) {

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
}

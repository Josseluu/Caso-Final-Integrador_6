import javax.swing.*;
import java.util.*;

class Venta {
    private String fecha;
    private double monto;
    private String cliente;

    public Venta(String fecha, double monto, String cliente) {
        this.fecha = fecha;
        this.monto = monto;
        this.cliente = cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public double getMonto() {
        return monto;
    }

    public String getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "fecha='" + fecha + '\'' +
                ", monto=" + monto +
                ", cliente='" + cliente + '\'' +
                '}';
    }
}

public class AnalisisVentas {
    public static void main(String[] args) {

        Set<String> nombres = new TreeSet<>();
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Pedro");


        StringBuilder nombresOrdenados = new StringBuilder("Nombres ordenados:\n");
        for (String nombre : nombres) {
            nombresOrdenados.append(nombre).append("\n");
        }
        JOptionPane.showMessageDialog(null, nombresOrdenados.toString());


        List<Venta> ventas = new ArrayList<>();
        ventas.add(new Venta("2024-04-22", 100.50, "Cliente A"));
        ventas.add(new Venta("2024-04-23", 200.75, "Cliente B"));
        ventas.add(new Venta("2024-04-24", 150.25, "Cliente C"));
        ventas.add(new Venta("2024-04-25", 300.20, "Cliente D"));
        ventas.add(new Venta("2024-04-26", 250.30, "Cliente E"));


        Collections.sort(ventas, Comparator.comparingDouble(Venta::getMonto));


        StringBuilder ventasOrdenadas = new StringBuilder("Ventas ordenadas por monto:\n");
        for (Venta venta : ventas) {
            ventasOrdenadas.append(venta).append("\n");
        }
        JOptionPane.showMessageDialog(null, ventasOrdenadas.toString());


        String fechaBusqueda = "2024-04-24";
        List<Venta> ventasFiltradas = filtrarVentasPorFecha(ventas, fechaBusqueda);


        StringBuilder ventasFiltradasString = new StringBuilder("Ventas filtradas por fecha " + fechaBusqueda + ":\n");
        for (Venta venta : ventasFiltradas) {
            ventasFiltradasString.append(venta).append("\n");
        }
        JOptionPane.showMessageDialog(null, ventasFiltradasString.toString());
    }


    public static List<Venta> filtrarVentasPorFecha(List<Venta> ventas, String fecha) {
        List<Venta> ventasFiltradas = new ArrayList<>();
        for (Venta venta : ventas) {
            if (venta.getFecha().equals(fecha)) {
                ventasFiltradas.add(venta);
            }
        }
        return ventasFiltradas;
    }
}

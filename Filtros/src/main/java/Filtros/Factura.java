package Filtros;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

// clase factura
class Factura{
    int codigoDeFactura;
    int cantidad;
    LocalDate fecha;
    String descripcion;
    int importe;

    public Factura(int codigoDeFactura, int cantidad, LocalDate fecha, String descripcion, int importe) {
        this.codigoDeFactura = codigoDeFactura;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.importe = importe;
    }

    public int getCodigoDeFactura() {
        return codigoDeFactura;
    }

    public int getCantidad() {
        return cantidad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getImporte() {
        return importe;
    }

    @Override
    public String toString() {
        return "\nFactura{" +
                "codigoDeFactura=" + codigoDeFactura +
                ", cantidad=" + cantidad +
                ", fecha=" + fecha +
                ", descripcion='" + descripcion + '\'' +
                ", importe=" + importe +
                "}\n";
    }
}


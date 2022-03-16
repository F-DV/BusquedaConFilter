package Filtros;

import java.time.LocalDate;
import java.util.function.Predicate;

public class Busqueda {
    public Busqueda() {
    }

    Predicate<Factura> porImporteMayorA = new Predicate<Factura>() {
        @Override
        public boolean test(Factura t) {
            return t.getImporte() > 300;
        }
    };
    Predicate<Factura> porCantidadMayorA = new Predicate<Factura>() {
        @Override
        public boolean test(Factura t) {
            return t.getCantidad() > 3;
        }
    };
    Predicate<Factura> porCantidadMenorA = new Predicate<Factura>() {
        @Override
        public boolean test(Factura t) {
            return t.getCantidad() < 2;
        }
    };
    Predicate<Factura> porCodigoEspecifico = new Predicate<Factura>() {
        @Override
        public boolean test(Factura t) {
            return t.getCodigoDeFactura() == 3;
        }
    };
    Predicate<Factura> porFechaMayorA = new Predicate<Factura>() {
        @Override
        public boolean test(Factura t) {
            LocalDate fechaBuscada = LocalDate.of(2021,01,5);
            return t.getFecha().compareTo(fechaBuscada) > 0;
        }
    };
    Predicate<Factura> porFechaMenorA = new Predicate<Factura>() {
        @Override
        public boolean test(Factura t) {
            LocalDate fechaBuscada = LocalDate.of(2021,02,5);
            return t.getFecha().compareTo(fechaBuscada) < 0;
        }
    };
}

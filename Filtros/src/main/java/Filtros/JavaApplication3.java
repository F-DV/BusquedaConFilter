package Filtros;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class JavaApplication3 {

    public static void main(String[] args) {
        // registros de la data
        Factura f = new Factura(1, 2, LocalDate.of(2021,01,5), "ordenador", 1000);
        Factura f2 = new Factura(2, 5, LocalDate.now(), "movil", 300);
        Factura f3 = new Factura(3, 3, LocalDate.now(), "imporesora", 200);
        Factura f4 = new Factura(4, 6, LocalDate.now(), "imac", 1500);

        // generar una lista
        List<Factura> lista = new ArrayList<Factura>();

        // agregar los productos de la factura
        lista.add(f);
        lista.add(f2);
        lista.add(f3);
        lista.add(f4);

        //Instanciamos el objeto que contiene los predicados para las busquedas
        Busqueda busquedaPor = new Busqueda();

        List<Factura> facturaFiltro = lista.stream()
                .filter(busquedaPor.porFechaMenorA)
                .collect(Collectors.toList());

        System.out.println(facturaFiltro);

    }

}
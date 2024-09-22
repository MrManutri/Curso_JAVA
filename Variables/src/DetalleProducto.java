public class DetalleProducto {
    public static void main(String[] args) {
        String nombreProducto = "celular";
        double precioProducto = 300.00;
        int cantidadProducto = 9;
        boolean hasDisponible = true;

        System.out.println(nombreProducto);
        System.out.println(precioProducto);
        System.out.println(cantidadProducto);
        System.out.println(hasDisponible);

        cantidadProducto = 0;
        hasDisponible = false;

        System.out.println(nombreProducto);
        System.out.println(precioProducto);
        System.out.println(cantidadProducto);
        System.out.println(hasDisponible);


    }
}

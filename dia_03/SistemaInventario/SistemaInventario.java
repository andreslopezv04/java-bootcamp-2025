package dia_03.SistemaInventario;

import java.util.Scanner;

public class SistemaInventario {
    public static void main(String[] args) {
        int tamañoArrays = 2;
        String [] productos = new String[tamañoArrays];
        double [] precios = new double[tamañoArrays];
        int[] cantidadEnStock = new int[tamañoArrays];
        boolean [] disponiblidad = new boolean[tamañoArrays];

        double [] totalInventarioProducto = new double[tamañoArrays];

        Scanner in = new Scanner(System.in);
        

        //Agregar información de los productos (nombre, precio, cantidad y disponibilidad)
        for (int i = 0; i < tamañoArrays; i++) {
            System.out.println("\n--- INGRESAR INFORMACIÓN PARA EL PRODUCTO #" + (i + 1) + " ---");
            System.out.print("Nombre del producto: ");
            productos[i] = in.nextLine();
            System.out.print("Precio del " + (productos[i]) + ": ");
            precios[i] = in.nextDouble();
            System.out.print("Stock del " + (productos[i]) + ": ");
            cantidadEnStock[i] = in.nextInt();
            totalInventarioProducto[i] = precios[i] * cantidadEnStock[i];
            in.nextLine();
        }

        //Mostrar información del inventario completo
        for (int i = 0; i < tamañoArrays; i++) {
            System.out.println("\nPRODUCTO " + (i + 1) +
                               "\nProducto: " + productos[i] + 
                               "\nPrecio: " + precios[i] + 
                               "\nStock: " + cantidadEnStock[i] +
                               "\nTotal inventario del " + productos[i] + " : " + totalInventarioProducto[i]);
        }

        //Calcular el valor total del inventario
        double totalInventario = 0;
        for (int i = 0; i < tamañoArrays; i++) {
            totalInventario += precios[i] * cantidadEnStock[i];
        }
        System.out.println("Total del inventario: " + totalInventario);

        //Encontrar el producto más caro y más barato
        double productoMasCaro = precios[0];
        double productoMasBarato = precios[0];
        int indiceProductoMasCaro = 0;
        int indiceProductoMasBarato = 0;

        for (int i = 1; i < tamañoArrays; i++) {

            //Producto más caro
            if (precios[i] > productoMasCaro) {
                productoMasCaro = precios[i];
                indiceProductoMasCaro = i;
            }

            //Producto más barato
            if (precios[i] < productoMasBarato) {
                productoMasBarato = precios[i];
                indiceProductoMasBarato = i;
            }
        }

        System.out.println("\n---- PRODUCTO MÁS CARO Y MÁS BARATO DEL INVENTARIO ---- ");
        System.out.println("El producto más caro: " + productos[indiceProductoMasCaro] );
        System.out.println("El producto más barato: " + productos[indiceProductoMasBarato]);

        //Contar cuántos productor tienen stock bajo (menos de 5 unidades)

        System.out.println("\n---- PRODUCTOS CON STOCK BAJO ----");
        int productosStockBajo = 0;
        for (int i = 0; i < tamañoArrays; i++) {
            if (cantidadEnStock[i] < 5) {
                System.out.println("El " + productos[i] + " tiene un stock bajo (" + cantidadEnStock[i] + ")");
                productosStockBajo++;
            }
        }
        String mensaje = (productosStockBajo == 1) ? " producto " : " productos ";
        System.out.println("\nTenemos un " + productosStockBajo + mensaje + "con stock bajo");

        //Buscar un producto por nombre
        System.out.println("\n---- BUSCAR PRODUCTO POR NOMBRE ----");
        System.out.print("Nombre del producto: ");
        String nombreProductoABuscar = in.nextLine();
        boolean encontrado = false;
        int posicionProducto = -1;

        for (int i = 0; i < tamañoArrays; i++) {
            if (productos[i].equals(nombreProductoABuscar)){
                encontrado = true;
                posicionProducto = i;
                break;
            }
        }

        if (encontrado) {
            System.out.println(
                               "\nProducto: " + productos[posicionProducto] + 
                               "\nPrecio: " + precios[posicionProducto] + 
                               "\nStock: " + cantidadEnStock[posicionProducto] +
                               "\nTotal inventario del " + productos[posicionProducto]);
        }else{
            System.out.println("Producto no encontrado");
        }

        //Calcular el precio promedio de productos
        System.out.println("\n---- PRECIO PROMEDIO ----");
        double sumaPromedio = 0;
        
        for (int i = 0; i < tamañoArrays; i++) {
            sumaPromedio += precios[i];  
        }
        double precioPromedio = sumaPromedio / tamañoArrays;

        System.out.println("Suma de precios: " + sumaPromedio);
        System.out.println("Precio promedio: " + precioPromedio);

        in.close();

    }
}

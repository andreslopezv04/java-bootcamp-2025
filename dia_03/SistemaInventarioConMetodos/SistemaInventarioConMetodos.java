package dia_03.SistemaInventarioConMetodos;

import java.util.Scanner;

public class SistemaInventarioConMetodos {

    public static void ingresarProductos(String[] productos, double[] precios, int[] cantidadEnStock, double[] totalInventarioProducto, Scanner in){
        //Agregar información de los productos (nombre, precio, cantidad y disponibilidad)
        for (int i = 0; i < productos.length; i++) {
            System.out.println("\n--- INGRESAR INFORMACIÓN PARA EL PRODUCTO #" + (i + 1) + " ---");

            System.out.print("Nombre del producto: ");
            productos[i] = in.nextLine();

            System.out.print("Precio del " + (productos[i]) + ": ");
            while(!in.hasNextDouble()){
                System.out.println("Ingrese un precio válido");
                in.next();
                System.out.print("Precio: $");
            }
            precios[i] = in.nextDouble();

            System.out.print("Stock del " + (productos[i]) + ": ");
            while(!in.hasNextInt()){
                System.out.println("Ingrese una cantidad de stock valida");
                in.next();
                System.out.print("Stock: ");
            }
            cantidadEnStock[i] = in.nextInt();

            totalInventarioProducto[i] = precios[i] * cantidadEnStock[i];
            in.nextLine();
        }
    }

    public static void mostrarInventario ( String[] productos, double[] precios, int[] cantidadEnStock, double[] totalInventarioProducto){
         for (int i = 0; i < productos.length; i++) {
            System.out.println("\nPRODUCTO " + (i + 1) +
                               "\nProducto: " + productos[i] + 
                               "\nPrecio: " + precios[i] + 
                               "\nStock: " + cantidadEnStock[i] +
                               "\nTotal inventario del " + productos[i] + " : " + totalInventarioProducto[i]);
        }

    }

    public static double calcularValorTotal(double[] precios, int[] cantidadEnStock){
        double totalInventario = 0;
        for (int i = 0; i < precios.length; i++) {
            totalInventario += precios[i] * cantidadEnStock[i];
        }
        return totalInventario;
    }

    public static String encontrarMasCaro(double[] precios, String[] productos){
        double productoMasCaro = precios[0];
        int indiceProductoMasCaro = 0;
        String nombre;

        for (int i = 1; i < precios.length; i++) {
            //Producto más caro
            if (precios[i] > productoMasCaro) {
                productoMasCaro = precios[i];
                indiceProductoMasCaro = i;
            }
        }
    
        nombre = productos[indiceProductoMasCaro];
        return nombre;
    }

    public static String encontrarMasBarato(double[] precios, String[] productos){
        double productoMasBarato = precios[0];
        int indiceProductoMasBarato = 0;
        String nombre;

        for (int i = 1; i < precios.length; i++) {
            //Producto más caro
            if (precios[i] < productoMasBarato) {
                productoMasBarato = precios[i];
                indiceProductoMasBarato = i;
            }
        }
    
        nombre = productos[indiceProductoMasBarato];
        return nombre;
    }

    public static int contarStockBajo(int[]cantidadEnStock, int limite){
        int productosStockBajo = 0;

        for (int i = 0; i < cantidadEnStock.length; i++) {
            if (cantidadEnStock[i] < limite) {
                productosStockBajo++;
            }
        }
        return productosStockBajo;
    }

    public static int buscarProducto(String[] productos, String buscar){

        boolean encontrado = false;
        int posicionProducto = -1;

        for (int i = 0; i < productos.length; i++) {
            if (productos[i].equalsIgnoreCase(buscar)) {
                encontrado = true;
                posicionProducto = i;
                break;
            }
        }

        if (encontrado) {
            return posicionProducto;
        }else {
            return -1;
        }
       
    }

    public static double calcularPrecioPromedio(double[] precios){
        double promedio;
        double sumaPromedio = 0;
        for (int i = 0; i < precios.length; i++) {
            sumaPromedio += precios[i];
        }

        promedio = sumaPromedio / precios.length;
        return promedio;
    }

    public static void mostrarEstadisticas (String [] productos, double[] precios, int[] cantidadEnStock){
        System.out.println("---- RESUMEN DE INVENTARIO ----");
        System.out.println("Valor total del inventario: $" + calcularValorTotal(precios, cantidadEnStock));
        System.out.println("Precio promedio de productos: $" + calcularPrecioPromedio(precios));
        System.out.println("Producto más caro: " + encontrarMasCaro(precios, productos));
        System.out.println("Producto más barato: " + encontrarMasBarato(precios, productos));

        int stockBajo = contarStockBajo(cantidadEnStock, 5);
        String mensaje = (stockBajo == 1) ? " producto " : " productos ";
        System.out.println("Hay " + stockBajo + mensaje + "con un stock bajo" );
    }
    

    public static void mostrarMenu(Scanner in){
        
        int opcion;
        int cantidadMaximaProductosARegistrar = 2;
        String [] productos = new String[cantidadMaximaProductosARegistrar];
        double [] precios = new double[cantidadMaximaProductosARegistrar];
        int[] cantidadEnStock = new int[cantidadMaximaProductosARegistrar];
        double [] totalInventarioProducto = new double[cantidadMaximaProductosARegistrar];
            

        do {
            System.out.println("\n---- MENÚ DE INVENTARIO ----");
            System.out.println("1. Registrar productos");
            System.out.println("2. Mostrar inventario");
            System.out.println("3. Valor total del inventario");
            System.out.println("4. Encontrar el producto más caro");
            System.out.println("5. Encontrar el producto más barato");
            System.out.println("6. Cantidad de producto(s) con stock bajo");
            System.out.println("7. Buscar producto por nombre");
            System.out.println("8. Promedio de productos");
            System.out.println("9. Resumen del inventario");
            System.out.println("0. Salir");

            System.out.print("Seleccione la opción que desea: ");
            opcion= in.nextInt();

            in.nextLine();
                    

            
            switch (opcion) {
                case 1:
                
                    //boolean [] disponiblidad = new boolean[tamañoArrays];
                    System.out.println("\n---- REGISTRAR PRODUCTOS ----");
                    ingresarProductos(productos, precios, cantidadEnStock, totalInventarioProducto, in);

                    break;
            
                case 2:
                    System.out.println("\n---- INVENTARIO ----");
                    mostrarInventario(productos, precios, cantidadEnStock, totalInventarioProducto);
                    break;
                case 3:
                    System.out.println("\n---- VALOR TOTAL DE INVENTARIO ----");
                    System.out.println("Total de inventario: " + calcularValorTotal(precios, cantidadEnStock));
                    break;
                case 4:
                    System.out.println("\n---- ENCONTRAR EL PRODUCTO MÁS CARO ----");
                    System.out.println("Producto más caro: " + encontrarMasCaro(precios, productos));
                    break;
                case 5:
                    System.out.println("\n---- ENCONTRAR EL PRODUCTO MÁS BARATO ----");
                    System.out.println("Producto más barato: " + encontrarMasBarato(precios, productos));
                    break;   
                case 6:
                    System.out.println("\n---- CANTIDAD DE PRODUCTO(S) CON STOCK BAJO ----");
                    int limite = 5;
                    int cantidad = contarStockBajo(cantidadEnStock, limite);
                    String mensaje = (cantidad == 1) ? " producto tiene" : " productos tienen";
                    System.out.println(cantidad + mensaje + " stock bajo");
                    break;
                case 7:
                    System.out.println("\n---- BUSCAR PRODUCTO POR NOMBRE ----");
                    System.out.print("Nombre del producto: ");
                    String nombre = in.nextLine();
                    int posicionProducto = buscarProducto(productos, nombre);
                    if (posicionProducto != -1) {
                        System.out.println("Producto encontrado:");
                        System.out.println("Nombre: " + productos[posicionProducto]);
                        System.out.println("Precio: $" + precios[posicionProducto]);
                        System.out.println("Stock: " + cantidadEnStock[posicionProducto]);
                    }else{
                        System.out.println("Producto no encontrado");
                    }
                    break;
                case 8:
                    System.out.println("\n---- PROMEDIO DE PRODUCTOS ----");
                    System.out.println("Precio promedio de productos: " + calcularPrecioPromedio(precios));

                    break;
                case 9:
                    System.out.println("\n---- RESUMEN DE INVENTARIO ----");
                    mostrarEstadisticas(productos, precios, cantidadEnStock);
                    break;
                case 0:
                    System.out.println("Gracias por usar nuestro sistema");
                    break;
                default:
                    System.out.println("Opción invalida...");
                    break;
            }

            
        } while (opcion != 0);

    }

    public static void main(String[] args){
        

        Scanner in = new Scanner(System.in);

        mostrarMenu(in);
    
            
    }
}

## ✏️ EJERCICIO 2: Refactorizar Sistema de Inventario

**Objetivo:** Tomar tu código del Ejercicio 1 y convertirlo en métodos reutilizables

**Requerimientos:**

Crea estos métodos (mínimo):

1. **`mostrarMenu()`** - void, muestra el menú de opciones
2. **`ingresarProductos(arrays...)`** - void, pide datos al usuario
3. **`mostrarInventario(arrays...)`** - void, muestra todos los productos
4. **`calcularValorTotal(precios, cantidades)`** - double, retorna valor total
5. **`encontrarMasCaro(precios, nombres)`** - String, retorna nombre del más caro
6. **`encontrarMasBarato(precios, nombres)`** - String, retorna nombre del más barato
7. **`contarStockBajo(cantidades, limite)`** - int, retorna cantidad con stock bajo
8. **`buscarProducto(nombres, buscar)`** - int, retorna posición (-1 si no encuentra)
9. **`calcularPrecioPromedio(precios)`** - double, retorna promedio
10. **`mostrarEstadisticas(arrays...)`** - void, muestra resumen completo

**Estructura esperada:**
```java
public class SistemaInventarioConMetodos {
    
    // Todos tus métodos aquí
    
    public static void main(String[] args) {
        // Solo llamadas a métodos, poca lógica aquí
        mostrarMenu();
        // ... más llamadas
    }
}


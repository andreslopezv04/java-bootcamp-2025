public class SistemaEstudiante {
    public static void main(String[] args) {

        //Declaración de variables para un estudiante
        String nombreEstudiante = "Andres";
        int edadEstudiante = 20;
        double promedioNotas = 4.5;
        boolean estaActivo = true;
        char primeraLetraApellido = 'L';

        // Mostrar la información del estudiante
        System.out.println("---- Información del Estudiante ----");
        System.out.println("Nombre: " + nombreEstudiante);
        System.out.println("Edad: " + edadEstudiante);
        System.out.println("Promedio de notas: " + promedioNotas);
        System.out.println("¿Está activo?: " + estaActivo);
        System.out.println("Primera letra del apellido: " + primeraLetraApellido);

        //Operación para saber cuantos años faltan para que cumpla 25 años
        int anosFaltanCumplir25 = 25 - edadEstudiante;
        System.out.println("\n---- Cuántos años le faltan para cumplir 25 ----");
        System.out.println("Faltan " + anosFaltanCumplir25 + " años");

        //Verificar el estudiante si aprobó
        boolean aprobo = promedioNotas >= 3.0;

        System.out.println("\n---- Aprobación del estudiante ----");
        System.out.println("¿Aprobó?: " + aprobo);
   
    }
}
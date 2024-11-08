package ejemplo.empleado;

// Defino la clase de empleado
public class Empleado {
    String nombre;
    int edad;
    String puesto;

    // Constructor para inicializar los atributos del empleado
    public Empleado(String nombre, int edad, String puesto) {
        this.nombre = nombre;
        this.edad = edad;
        this.puesto = puesto;
    }

    // Método para imprimir los detalles del empleado
    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Puesto: " + puesto);
    }
}
// Clase principal para ejecutar el programa
public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Yoely", 24, "Desarrolladora");
        empleado1.imprimirDetalles(); // Salida: Nombre: Yoely, Edad: 24, Puesto: Desarrolladora
    }
}


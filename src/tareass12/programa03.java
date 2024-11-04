
package tareass12;
import java.util.Scanner;
public class programa03 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        double sueldo1, sueldo2, sueldo3, sueldo4;

        // Entrada de datos
        System.out.print("Ingrese Sueldo 1: ");
        sueldo1 = lectura.nextDouble();

        System.out.print("Ingrese Sueldo 2: ");
        sueldo2 = lectura.nextDouble();

        System.out.print("Ingrese Sueldo 3: ");
        sueldo3 = lectura.nextDouble();

        System.out.print("Ingrese Sueldo 4: ");
        sueldo4 = lectura.nextDouble();

        // Crear un objeto de la clase EmpleadoSueldos
        EmpleadoSueldos objEmpleado = new EmpleadoSueldos(sueldo1, sueldo2, sueldo3, sueldo4);

        // Mostrar resultados
        System.out.println("");
        System.out.println("Resultados");
        System.out.println("Total de Sueldos: " + objEmpleado.calcularTotal());
        System.out.println("Promedio de Sueldos: " + objEmpleado.calcularPromedio());
        System.out.println("Sueldo Mayor: " + objEmpleado.calcularSueldoMayor());
        System.out.println("Sueldo Menor: " + objEmpleado.calcularSueldoMenor());

    }
}



      


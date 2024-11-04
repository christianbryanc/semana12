
package tareass12;
import java.util.Scanner;
public class programa02 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        double ingresoMensual, otrosIngresos, gastosMensuales;

        // Entrada de datos
        System.out.print("Ingresar Ingreso Mensual: ");
        ingresoMensual = lectura.nextDouble();
        
        System.out.print("Ingresar Otros Ingresos: ");
        otrosIngresos = lectura.nextDouble();
        
        System.out.print("Ingresar Gastos Mensuales: ");
        gastosMensuales = lectura.nextDouble();

        // Crear un objeto de la clase Empleado
        Empleado empleado = new Empleado(ingresoMensual, otrosIngresos, gastosMensuales);

        // Mostrar resultados
        System.out.println("\nResultados de Ahorro");
        System.out.println("Ahorro Mensual: " + empleado.calcularAhorroMensual());
        System.out.println("Ahorro Semestral: " + empleado.calcularAhorroSemestral());
        System.out.println("Ahorro Anual: " + empleado.calcularAhorroAnual());

    }
}

    


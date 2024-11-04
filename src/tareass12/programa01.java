
package tareass12;
import java.util.Scanner;
public class programa01 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        double cp1, cp2, cp3, cp4;

        // Entrada de datos
        System.out.print("Ingresar Compra 1: ");
        cp1 = lectura.nextDouble();
        System.out.print("Ingresar Compra 2: ");
        cp2 = lectura.nextDouble();
        System.out.print("Ingresar Compra 3: ");
        cp3 = lectura.nextDouble();
        System.out.print("Ingresar Compra 4: ");
        cp4 = lectura.nextDouble();

        // Crear un objeto de la clase RegistroCompra
        RegistroCompra objRegCompra = new RegistroCompra(cp1, cp2, cp3, cp4);

        // Mostrar resultados
        System.out.println("");
        System.out.println("Resultados");
        System.out.println("Total de compras: " + objRegCompra.calcularTotal());
        System.out.println("Promedio de compras: " + objRegCompra.calcularPromedio());
        System.out.println("Mayor de compras: " + objRegCompra.encontrarMayor());
        System.out.println("Menor de compras: " + objRegCompra.encontrarMenor());

    }
}



    


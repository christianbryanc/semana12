
package tareass12;
public class EmpleadoSueldos {
    private double sueldo1;
    private double sueldo2;
    private double sueldo3;
    private double sueldo4;

    // metodo Constructor
    public EmpleadoSueldos(double sueldo1, double sueldo2, double sueldo3, double sueldo4) {
        this.sueldo1 = sueldo1;
        this.sueldo2 = sueldo2;
        this.sueldo3 = sueldo3;
        this.sueldo4 = sueldo4;
    }

    public double calcularTotal() {
        return sueldo1 + sueldo2 + sueldo3 + sueldo4;
    }

    public double calcularPromedio() {
        return calcularTotal() / 4;
    }

    public double calcularSueldoMayor() {
        double mayor = sueldo1;
        if (sueldo2 > mayor) {
            mayor = sueldo2;
        }
        if (sueldo3 > mayor) {
            mayor = sueldo3;
        }
        if (sueldo4 > mayor) {
            mayor = sueldo4;
        }
        return mayor;
    }

    public double calcularSueldoMenor() {
        double menor = sueldo1;
        if (sueldo2 < menor) {
            menor = sueldo2;
        }
        if (sueldo3 < menor) {
            menor = sueldo3;
        }
        if (sueldo4 < menor) {
            menor = sueldo4;
        }
        return menor;
    }
}

    


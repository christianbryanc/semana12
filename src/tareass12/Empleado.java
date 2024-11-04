
package tareass12;

public class Empleado {

    private double ingresoMensual;
    private double otrosIngresos;
    private double gastosMensuales;

    // metodo Constructor
    public Empleado(double ingresoMensual, double otrosIngresos, double gastosMensuales) {
        this.ingresoMensual = ingresoMensual;
        this.otrosIngresos = otrosIngresos;
        this.gastosMensuales = gastosMensuales;
    }

    public double calcularAhorroMensual() {
        return (ingresoMensual + otrosIngresos) - gastosMensuales;
    }

    public double calcularAhorroSemestral() {
        return calcularAhorroMensual() * 6;
    }

    public double calcularAhorroAnual() {
        return calcularAhorroMensual() * 12;
    }
}

    

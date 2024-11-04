
package tareass12;
public class RegistroCompra {
    private double compra1;
    private double compra2;
    private double compra3;
    private double compra4;

    // metodo Constructor
    public RegistroCompra(double compra1, double compra2, double compra3, double compra4) {
        this.compra1 = compra1;
        this.compra2 = compra2;
        this.compra3 = compra3;
        this.compra4 = compra4;
    }

    public double calcularTotal() {
        return this.compra1 + this.compra2 + this.compra3 + this.compra4;
    }

    public double calcularPromedio() {
        return calcularTotal() / 4;
    }

    public double encontrarMayor() {
        double xMayor = this.compra1;
        if (this.compra2 > xMayor) {
            xMayor = this.compra2;
        }
        if (this.compra3 > xMayor) {
            xMayor = this.compra3;
        }
        if (this.compra4 > xMayor) {
            xMayor = this.compra4;
        }
        return xMayor;
    }

    public double encontrarMenor() {
        double xMenor = this.compra1;
        if (this.compra2 < xMenor) {
            xMenor = this.compra2;
        }
        if (this.compra3 < xMenor) {
            xMenor = this.compra3;
        }
        if (this.compra4 < xMenor) {
            xMenor = this.compra4;
        }
        return xMenor;
    }
}

        
        
       
    
    


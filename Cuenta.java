public class Cuenta {
    private int numeroSocio;
    private double valorCuota = 80000; // Valor fijo para la cuota
    private double cantidadAportada;

    public Cuenta(int numeroSocio) {
        this.numeroSocio = numeroSocio;
        this.cantidadAportada = 0; // Inicializa en 0 pesos
    }

    public void pagarCuota(double monto) {
        if (monto <= 0) {
            System.out.println("¡Error! El monto debe ser mayor a cero.");
            return;
        }
        cantidadAportada += monto;
        System.out.println("¡Pago realizado de manera exitosa!");
    }

    public double consultarCuotaPagada() {
        return cantidadAportada; // Retorna el total pagado
    }

    public double getValorCuota() {
        return valorCuota; // Retorna el valor de la cuota
    }
}
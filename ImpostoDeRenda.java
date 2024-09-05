public class ImpostoDeRenda {
    private double salario;

    public ImpostoDeRenda(double salario) {
        this.salario = salario;
    }

    public double calcularImposto() {
        if (salario <= 2500) {
            return 0;
        } else if (salario <= 5000) {
            return salario * 0.1;
        } else {
            return salario * 0.2;
        }
    }

    public static void main(String[] args) {
        ImpostoDeRenda ir = new ImpostoDeRenda(6000);
        System.out.println("Imposto devido: " + ir.calcularImposto());
    }
}

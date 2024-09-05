
public class Calculadora {
    // Soma de dois inteiros
    public int soma(int a, int b) {
        return a + b;
    }

    // Soma de dois números decimais
    public double soma(double a, double b) {
        return a + b;
    }

    // Soma de múltiplos números
    public double soma(double... numeros) {
        double soma = 0;
        for (double num : numeros) {
            soma += num;
        }
        return soma;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Soma de inteiros: " + calc.soma(1, 2));
        System.out.println("Soma de decimais: " + calc.soma(1.5, 2.5));
        System.out.println("Soma de múltiplos números: " + calc.soma(1, 2, 3, 4));
    }
}
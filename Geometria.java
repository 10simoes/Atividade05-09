public class Geometria {
    // Área do quadrado
    public double area(double lado) {
        return lado * lado;
    }

    // Área do retângulo
    public double area(double largura, double altura) {
        return largura * altura;
    }

    // Área do círculo
    public double area(double raio) {
        return Math.PI * raio * raio;
    }

    public static void main(String[] args) {
        Geometria geo = new Geometria();
        System.out.println("Área do quadrado: " + geo.area(5));
        System.out.println("Área do retângulo: " + geo.area(4, 6));
        System.out.println("Área do círculo: " + geo.area(3));
    }
}

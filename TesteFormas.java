// Classe base abstrata Forma
abstract class Forma {
    // Método abstrato para calcular a área
    abstract double calcularArea();
}

// Classe Circulo que herda de Forma e implementa calcularArea
class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

// Classe Retangulo que herda de Forma e implementa calcularArea
class Retangulo extends Forma {
    private double largura, altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }
}

// Classe Triangulo que herda de Forma e implementa calcularArea
class Triangulo extends Forma {
    private double base, altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}

// Classe de teste para polimorfismo por herança
public class TesteFormas {
    public static void main(String[] args) {
        Forma[] formas = { new Circulo(5), new Retangulo(4, 6), new Triangulo(4, 3) };

        for (Forma forma : formas) {
            System.out.println("Área: " + forma.calcularArea());
        }
    }
}

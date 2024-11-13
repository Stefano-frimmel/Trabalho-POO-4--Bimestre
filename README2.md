Projeto: Polimorfismo por Herança em Java
Descrição do Projeto
Este projeto demonstra o uso de polimorfismo por herança em Java para calcular a área de diferentes formas geométricas (círculo, retângulo e triângulo). Utilizando uma classe base abstrata chamada Forma, este projeto exemplifica como métodos abstratos podem ser implementados de maneira específica em subclasses para realizar cálculos de área de diferentes tipos de forma.

Estrutura do Código
Classe Base Abstrata Forma: Define um método abstrato calcularArea(), que deve ser implementado por qualquer subclasse concreta. Essa estrutura permite que classes derivadas possam fornecer a lógica para calcular suas respectivas áreas, mantendo a uniformidade do código que realiza a chamada.

java
Copiar código
abstract class Forma {
    abstract double calcularArea();
}
Classe Circulo: Subclasse de Forma, que implementa o cálculo da área de um círculo com base no valor do raio. O cálculo utiliza a fórmula:

a
ˊ
rea
=
𝜋
×
raio
2
a
ˊ
 rea=π×raio 
2
 
java
Copiar código
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
Classe Retangulo: Subclasse de Forma, que implementa o cálculo da área de um retângulo. O cálculo usa a fórmula:

a
ˊ
rea
=
largura
×
altura
a
ˊ
 rea=largura×altura
java
Copiar código
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
Classe Triangulo: Subclasse de Forma, que implementa o cálculo da área de um triângulo com base nos valores da base e da altura, usando a fórmula:

a
ˊ
rea
=
base
×
altura
2
a
ˊ
 rea= 
2
base×altura
​
 
java
Copiar código
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
Classe de Teste TesteFormas: A classe de teste cria um array de objetos Forma, preenchido com instâncias de Circulo, Retangulo e Triangulo. O método calcularArea() é chamado para cada elemento do array, e o polimorfismo garante que o método específico de cada subclasse seja executado, exibindo a área correspondente.

java
Copiar código
public class TesteFormas {
    public static void main(String[] args) {
        Forma[] formas = { new Circulo(5), new Retangulo(4, 6), new Triangulo(4, 3) };

        for (Forma forma : formas) {
            System.out.println("Área: " + forma.calcularArea());
        }
    }
}
Vantagens do Polimorfismo por Herança
Este projeto exemplifica as vantagens práticas do polimorfismo por herança:

Flexibilidade e Extensibilidade: O código é flexível para adicionar novos tipos de Forma (por exemplo, Hexagono ou Trapezio). Basta que a nova classe estenda Forma e implemente calcularArea(). Assim, novas formas podem ser integradas sem mudanças no código existente que manipula objetos Forma.

Desacoplamento: O polimorfismo permite que o método calcularArea() seja chamado sem que TesteFormas precise conhecer detalhes sobre as subclasses específicas. Cada subclasse lida com seu próprio cálculo, mantendo o código principal mais simples e desacoplado.

Reusabilidade e Manutenção Simplificada: Ao centralizar a lógica de cálculo da área em cada classe, o projeto facilita a reutilização de métodos e torna o código mais fácil de manter. Alterações na lógica de cálculo de uma forma específica não afetam as outras classes.

Conclusão
Este projeto mostra como o polimorfismo por herança em Java pode ser aplicado para manipular diferentes formas geométricas de maneira uniforme, promovendo a modularidade e a flexibilidade do código. A estrutura é fácil de expandir e manter, sendo uma abordagem ideal para sistemas que precisam lidar com uma variedade de comportamentos específicos em objetos de diferentes tipos.

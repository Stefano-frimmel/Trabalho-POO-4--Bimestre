// Interface FazSom define o contrato para qualquer classe que possa emitir som
interface FazSom {
    void emitirSom();
}

// Classe Cachorro implementa FazSom
class Cachorro implements FazSom {
    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }
}

// Classe Gato implementa FazSom
class Gato implements FazSom {
    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }
}

// Classe Papagaio implementa FazSom
class Papagaio implements FazSom {
    @Override
    public void emitirSom() {
        System.out.println("Loro!!!");
    }
}

// Classe Alarme implementa FazSom, mas não é um Animal
class Alarme implements FazSom {
    @Override
    public void emitirSom() {
        System.out.println("Bip bip!");
    }
}

// Classe de teste para demonstrar o polimorfismo por interface
public class TesteSons {
    public static void main(String[] args) {
        // Criação de uma lista de emissores de som, com objetos de diferentes classes
        FazSom[] emissoresDeSom = { new Cachorro(), new Gato(), new Papagaio(), new Alarme() };
        
        // Cada emissor emite seu som específico, mostrando polimorfismo
        for (FazSom emissor : emissoresDeSom) {
            emissor.emitirSom(); // Método específico de cada classe é chamado
        }
    }
}

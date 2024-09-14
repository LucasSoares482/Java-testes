public class Main {
    public static void main(String[] args) {
        // Criando instâncias dos animais
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Passaro passaro = new Passaro();

        // Definindo nomes e idades
        cachorro.nome = "Rex";
        cachorro.idade = 5;
        gato.nome = "Mimi";
        gato.idade = 3;
        passaro.nome = "Piu";
        passaro.idade = 1;

        // Chamando os métodos
        cachorro.emitirSom(); // Deve imprimir "Au au!"
        gato.emitirSom();     // Deve imprimir "Miau!"
        passaro.emitirSom();  // Deve imprimir "Piu piu!"

        // Chamando métodos específicos
        cachorro.latir();     // Deve imprimir "Au au!"
        gato.miar();          // Deve imprimir "Miau!"
        passaro.voar();       // Deve imprimir "Voando!"
    }
}

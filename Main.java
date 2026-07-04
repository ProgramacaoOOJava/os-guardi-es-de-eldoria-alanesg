public class Main { //criando classe MAIN//
    public static void main(String[] args) { //criando método para classe main//
        Personagem heroi1 = new Personagem("Arthus", "Guerreiro", 1, 100, 10.5); //criando objeto - heroi 1//

        heroi1.exibirStatus(); //chamando o método e exibindo saída para heroi 1//

        Personagem heroi2 = new Personagem("Ártemis", "Arqueira", 5, 80, 12.5); // criando objeto - heroi 2 //

        heroi2.exibirStatus(); //chamando o método e exibindo a saída para heroi 2//

    }
}

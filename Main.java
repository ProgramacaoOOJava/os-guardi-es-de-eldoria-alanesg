public class Main { //criando classe MAIN//
    public static void main(String[] args) { //criando método para classe main//

        //Criando array  com um vetor chamado personagens com espaço para 4 posições.
        Personagem[] personagens = new Personagem[4]; 

        personagens[0] = new Guerreiro("Arthus", 1, 100, 10.5); //criando objeto - heroi 1//

        personagens[1] = new Guerreiro("Ártemis", 5, 80, 12.5); // criando objeto - heroi 2 //

        personagens [2] = new Mago("Merlin", 4, 80, 2);

        personagens[3] = new Mago("Celeste", 70, 250, 15);

        for(Personagem p : personagens) {
            p.exibirStatus(); //mostrará os dados do personagem atual (Guerreiro ou mago)
            p.usarHabilidadeEspecial(); // mostrará a habilidade do personagem (Guerreiro ou mago)
            System.out.println(); //espaço para ficar visivelmente organizado//
        }
    }
}

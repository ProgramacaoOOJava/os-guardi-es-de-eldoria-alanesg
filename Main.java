public class Main { //criando classe MAIN//
    public static void main(String[] args) { //criando método para classe main//

        //Criando array  com um vetor chamado personagens com espaço para 4 posições.
        Personagem[] personagens = new Personagem[4]; 
        Grupo grupo = new Grupo();

        personagens[0] = new Guerreiro("Arthus", 1, 100, 10.5); //criando objeto - heroi 1//

        personagens[1] = new Guerreiro("Ártemis", 5, 80, 12.5); // criando objeto - heroi 2 //

        personagens [2] = new Mago("Merlin", 4, 80, 2);

        personagens[3] = new Mago("Celeste", 70, 250, 15);

        //dizendo para adicionar personagens ao grupo//
        grupo.adicionarPersonagem(personagens[0]);
        grupo.adicionarPersonagem(personagens[1]);
        grupo.adicionarPersonagem(personagens[2]);
        grupo.adicionarPersonagem(personagens[3]);

        //reutilizando método//
        grupo.exibirGrupo();

        grupo.batalhar(personagens[0], personagens[2]);
    }
}

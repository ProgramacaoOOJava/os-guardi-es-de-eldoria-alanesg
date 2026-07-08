public class Guerreiro extends Personagem { //class Guerreiro, extendida da classe abstrata Personagem
    public Guerreiro(String nome, int nivel, int pontosDeVida, double poderBase) { //objeto e seus atributos
        super(nome, "Guerreiro", nivel, pontosDeVida, poderBase); 
    }
    @Override
    public void usarHabilidadeEspecial() { //reutilizando método "UsarHabilidadeEspecial"
        System.out.println(nome + " Usou Golpe Mortal!"); //Descrição da habilidade especial usada/ saída
    }
}

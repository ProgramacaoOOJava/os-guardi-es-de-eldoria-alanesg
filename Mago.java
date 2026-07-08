public class Mago extends Personagem { //class Mago, extendida da classe abstrata Personagem
    public Mago(String nome, int nivel, int pontosDeVida, double poderBase) { //objeto e seus atributos
        super(nome, "Mago", nivel, pontosDeVida, poderBase);
    }
    @Override
    public void usarHabilidadeEspecial() { //reutilizando método "UsarHabilidadeEspecial"
        System.out.println(nome + " Ficou invisível!"); //Descrição da habilidade especial usada/ saída
    }
}


//criando classe abstrata "Personagem" com modificador de acesso, seu tipo e atributo
//modificador protected  tambémserá acessado pelas subclasses Guerreiro e mago.
public abstract class Personagem { 
    protected String nome; 
    protected String classe;
    protected int nivel;
    protected int pontosDeVida;
    protected double poderBase;

    //construtor "Personagem" que qualquer classe pode utilizar. 
    //o construtor é usado de forma automática quando um objeto for criado.

    public Personagem(String nome, String classe, int nivel,int pontosDeVida, double poderBase){
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }

    public void exibirStatus() { //método "exibirStatus" e saídas.
        System.out.println("--- Status do Personagem ---");
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Nível: " + nivel);
        System.out.println("Pontos de Vida: " + pontosDeVida);
        System.out.println("Poder Base: " + poderBase);
        System.out.println();
    }

// método usarHabilidadeEspecial 
public abstract void usarHabilidadeEspecial();

public String getNome() { //método para ler nome//
    return nome;
}
public int getNivel(){ //método para ler nivel//
    return nivel;
}
public double getPoderBase(){ //método para ler poder base//
    return poderBase;
}
}


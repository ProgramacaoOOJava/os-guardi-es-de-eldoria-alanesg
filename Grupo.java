import java.util.ArrayList; //importando biblioteca

public class Grupo { //classe grupo com um Array e vetor personagens
    private ArrayList<Personagem> personagens;

    public Grupo() { //construtor//
        personagens = new ArrayList<>();
    }
    //Método para adicionar personagem
public void adicionarPersonagem(Personagem p) {
    personagens.add(p);
}

//Método para exibir o grupo em que o personagem está e exibir o status do personagem
public void exibirGrupo(){
    for(Personagem p : personagens){
        p.exibirStatus();
    }
}
//método para batalhar
public void batalhar(Personagem a, Personagem b){
    double poderA = a.getNivel() * a.getPoderBase();
    double poderB = b.getNivel() * b.getPoderBase();

    //dicionei o condicional IF e else para comparação//
    if(poderA > poderB){
        System.out.println(a.getNome() + " venceu com poder" + poderA);
    } else if(poderB > poderA){
        System.out.println(b.getNome() + " venceu com poder " + poderB);
    }else{
        System.out.println("Empate!");
    }
}







}

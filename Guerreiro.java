public class Guerreiro extends Personagem{
    String arma;
    
    public Guerreiro (String nome, int saude, int nivel, String arma){
        this.nome = nome;
        this.saude = saude;
        this.nivel = nivel;
        this.arma = arma;
    }

    public Guerreiro(){}

    public void mostrarInfo(){
        System.out.println("Nome: " + nome + ", Nível: " + nivel + ", Saúde: " + saude + ", Arma: " + arma);
    }
}

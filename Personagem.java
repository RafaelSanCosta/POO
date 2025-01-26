public class Personagem{
    String nome;
    int saude;
    int nivel;

    public Personagem(){}

    public Personagem(String nome, int saude, int nivel){
        this.nome = nome;
        this.saude = saude;
        this.nivel = nivel;
    }

    public void mostrarInfo(){
        System.out.println("Nome: " + nome + ", Nível: " + nivel + ", Saúde: " + saude);
    }
}
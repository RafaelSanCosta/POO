public class Mago extends Personagem{
    String magia;

    public Mago(String nome, int saude, int nivel, String magia){
        this.nome = nome;
        this.saude = saude;
        this.nivel = nivel;
        this.magia = magia;
    }

    public Mago(){}

    public void mostrarInfo(){
        System.out.println("Nome: " + nome + ", Nível: " + nivel + ", Saúde: " + saude + ", Magia: " + magia);
    }
    
}

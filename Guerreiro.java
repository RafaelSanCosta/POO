public class Guerreiro extends Personagem{
    String arma;
    
    public Guerreiro (String nome, int saude, int nivel, String arma){
        super(nome, saude, nivel);
        this.arma = arma;
    }

    public Guerreiro(){
        super();
    }

    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.print("Arma: "+ arma);
    }
}

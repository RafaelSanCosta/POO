public class Mago extends Personagem{
    String magia;

    public Mago(String nome, int saude, int nivel, String magia){
        super(nome, saude, nivel);
        this.magia = magia;
    }

    public Mago(){
        super();
    }

    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.print("Magia: " + magia);
    }
    
}

public class Dickie extends Inimigo {
    public Dickie(String nomeInimigo, int dificuldadeInimigo) {
        super(3, "Dickie", 20, 
        10, 5, 7, 
        0, 0, 5, 
        0, true);
    
    }

    public void atacarEspecial() {
        this.setPontosAtaque(2 * getPontosAtaque());
    }
}
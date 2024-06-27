public class Goblin extends Inimigo {
    public Goblin(String nomeInimigo, int dificuldadeInimigo) {
        super(2, "Goblin", 7, 
        11, 5, 7, 
        0, 0, 5, 
        0, true);
    
    }

    public void atacarEspecial() {
        this.setPontosAtaque(2 * getPontosAtaque());
    }
}
import java.util.Random;

public abstract class Inimigo extends Entidade{
    private int XP;
    private double coeficienteXP;
    private int dificuldadeInimigo;
    private String nomeInimigo;

    

    

    public Inimigo(int dificuldadeInimigo, String nomeEntidade, int pontosVida, int pontosDefesa, int pontosAtaque,int pontosMagia, 
                int coordX, int coodY, int velocidade, int numSprite, boolean isVivo){
                    
        super(nomeEntidade, pontosVida, pontosDefesa, pontosAtaque, pontosMagia, 
        coordX, coodY, velocidade, numSprite, isVivo);

        this.dificuldadeInimigo = dificuldadeInimigo;
    }

    public String obterNomeInimigo(String nomeEntidade){
        this.nomeInimigo = nomeEntidade;
        return nomeInimigo;

    }

    public static Inimigo escolherInimigo(String nomeInimigo, int dificuldadeInimigo) {
        Random random = new Random();
        int personagemIndex = random.nextInt(3) + 1;

        switch (personagemIndex) {
            case 1:
                return new Goomba(nomeInimigo, dificuldadeInimigo);
            case 2:
                return new Goblin(nomeInimigo, dificuldadeInimigo);
            case 3:
                return new Dickie(nomeInimigo, dificuldadeInimigo);
            default:
                System.out.println("Escolha inválida");
                return null;
        }
    }





    public int gerarXP(){
        switch (dificuldadeInimigo) {
            case 1:
                coeficienteXP = 0.50;
                break;
        
            case 2:
                coeficienteXP = 0.70;
                break;
            
            case 3:
                coeficienteXP = 1;
                break;
        }

        XP = (int) ((double)(coeficienteXP*300));
        return XP;

    }


    public void movimentoInimigo(){

        setCoordX(getCoordX()+(int)(+Math.random()));
        setCoodY(getCoordY()+(int)(+Math.random()));
    }






    public int getXP() {
        return XP;}
    public void setXP(int xP) {
        XP = xP;}

    public double getCoeficienteXP() {
        return coeficienteXP;}
    public void setCoeficienteXP(int coeficienteXP) {
        this.coeficienteXP = coeficienteXP;}

    public int getDificuldadeInimigo() {
        return dificuldadeInimigo;}
    public void setDificuldadeInimigo(int dificuldadeInimigo) {
        this.dificuldadeInimigo = dificuldadeInimigo;}

    
}
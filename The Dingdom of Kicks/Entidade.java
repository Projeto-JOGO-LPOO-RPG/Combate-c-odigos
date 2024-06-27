public class Entidade {
    private String nomeEntidade;
    private int pontosVida;
    private int pontosDefesa;
    private int pontosAtaque;
    private int pontosMagia;
    private int coordX;
    private int coordY;
    private int velocidade;
    private int numSprite;
    private boolean isVivo;

    public Entidade (String nomeEntidade, int pontosVida, int pontosDefesa, int pontosAtaque,int pontosMagia, 
                    int coordX, int coodY, int velocidade, int numSprite, boolean isVivo){
        
        this.nomeEntidade = nomeEntidade;
        this.pontosVida = pontosVida;
        this.pontosDefesa = pontosDefesa;
        this.pontosAtaque = pontosAtaque;
        this.pontosMagia = pontosMagia;
        this.coordX = coordX;
        this.coordY = coodY;
        this.velocidade = velocidade;
        this.numSprite = numSprite;
        this.isVivo = isVivo;
    }


    



    public void movimentarXY(){

        if("press W"){
            coordY += velocidade;
            }
        if("press S"){
            coordY -= velocidade;
            }
        if("press A"){
            coordX -= velocidade;
            }
        if("press D"){
            coordX += velocidade;
            }
    }

    public void animarSprites(){
        int contadorSprite = 0;

        if(contadorSprite > 20){
            numSprite = 2; 
        } else {numSprite = 1;
        }
        contadorSprite++;
    }


    public int defender(int danoRecebidoDef){
        int danoRecebidoComDef = (int) (danoRecebidoDef *(((double) pontosDefesa)/25));
        return danoRecebidoComDef;
    }

    public int atacarFisico() {
        int danoDeferido = (int) (pontosAtaque * (0.5 + (Math.random() * 0.5)));
        return danoDeferido;
    }

    public int atacarMagia(){
        int danoDeferido = (int) (pontosMagia * (0.9 + (Math.random() * 0.1)));
        return danoDeferido;
    }

    public int mostrarVidaRestante(){
        int vidaRestante = pontosVida;
        return vidaRestante;
    }


    public boolean isVivoAinda() {
        if (this.pontosVida <= 0) {
            this.pontosVida = 0;
            this.isVivo = false;
        }
        return this.isVivo;
    }







    public String getNomeEntidade() {
        return nomeEntidade;}
    public void setNomeEntidade(String nomeEntidade) {
        this.nomeEntidade = nomeEntidade;}

    public int getPontosVida() {
        return pontosVida;}
    public void setPontosVida(int pontosVida) {
        this.pontosVida = pontosVida;}

    public int getPontosDefesa() {
        return pontosDefesa;}
    public void setPontosDefesa(int pontosDefesa) {
        this.pontosDefesa = pontosDefesa;}

    public int getPontosAtaque() {
        return pontosAtaque;}
    public void setPontosAtaque(int pontosAtaque) {
        this.pontosAtaque = pontosAtaque;}

    public int getPontosMagia() {
        return pontosMagia;}
    public void setPontosMagia(int pontosMagia) {
        this.pontosMagia = pontosMagia;}

    public int getCoordX() {
        return coordX;}
    public void setCoordX(int coordX) {
        this.coordX = coordX;}

    public int getCoordY() {
        return coordY;}
    public void setCoodY(int coodY) {
        this.coordY = coodY;}

    public int getVelocidade() {
        return velocidade;}
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;}

    public int getNumSprite() {
        return numSprite;}
    public void setNumSprite(int numSprite) {
        this.numSprite = numSprite;}

    public boolean isVivo() {
        return isVivo;}
    public void setVivo(boolean isVivo) {
        this.isVivo = isVivo;}

}
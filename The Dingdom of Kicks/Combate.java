import java.util.Random;


public class Combate {
    private Jogador jogador1;
    private Inimigo inimigo01;
    private int danoDeferidoJog;
    private int danoRecebidoJog;
    private int danoDeferidoIn;
    private int danoRecebidoIn;
    private int acao;
    private int xpBarra;



    public Combate() {
        jogador1 = Jogador.escolherPersonagem("Nome do Jogador", 1, 0);

        inimigo01 = Inimigo.escolherInimigo("Nome do Inimigo", 0);
        

        
        jogador1.obterNome(); 
        clearScreen();
    }

    public void interacao(){
        if(jogador1.getCoordX() == inimigo01.getCoordX() &&
            jogador1.getCoordY() == inimigo01.getCoordY()){
            //Combate(),
        }

        if(jogador1.getCoordX() == NPC.getCoordX() &&
            jogador1.getCoordY() == NPC.getCoordY()){
            //Interagir()
        }


    }

    public void Combater() {
        System.out.println("Você encontrou um inimigo, é um " + inimigo01.getNomeEntidade() + ", terá de enfrentá-lo!");

        while (jogador1.isVivoAinda() && inimigo01.isVivoAinda()) {
            

            System.out.println("O que você fará? 1.Atacar 2.Inventario 3. Fugir");
            acao = jogador1.escolherAcao();
            switch (acao) {
                case 1:
                System.out.println("1. Luta    2. Magia");
                acao = jogador1.escolherAcao();
                if(acao == 1) {
                        danoDeferidoJog = jogador1.atacarFisico();
                        danoRecebidoIn = inimigo01.defender(danoDeferidoJog);
                        inimigo01.setPontosVida(inimigo01.getPontosVida()-danoRecebidoIn);
                        
                        Random random = new Random();
                        int inimigoAtaqueIndex = random.nextInt(2) + 1;
                        switch (inimigoAtaqueIndex) {
                            case 1:
                                danoDeferidoIn = inimigo01.atacarFisico();
                                break;
                        
                            case 2:
                                danoDeferidoIn = inimigo01.atacarMagia();
                                break;
                        }


                        danoRecebidoJog = jogador1.defender(danoDeferidoIn);
                        jogador1.setPontosVida(jogador1.getPontosVida()-danoRecebidoJog);
                        break;
                } if(acao == 2){
                        danoDeferidoJog = jogador1.atacarMagia();
                        danoRecebidoIn = inimigo01.defender(danoDeferidoJog);
                        inimigo01.setPontosVida(inimigo01.getPontosVida()-danoRecebidoIn);
                        
                        danoDeferidoIn = inimigo01.atacarMagia();
                        danoRecebidoJog = jogador1.defender(danoDeferidoIn);
                        jogador1.setPontosVida(jogador1.getPontosVida()-danoRecebidoJog);
                        break;
                  }
                  break;
            
                case 2:
                    //inventario
                    break;

                case 3:
                    System.out.println("Você fugiu da batalha!");
                    break;
            } if (acao == 3) break;

            
            

            clearScreen();

            System.out.println(jogador1. getNomeEntidade()+ " " +jogador1.getNomeJogador());
            System.out.println("Você Atacou com " + danoRecebidoIn + " de dano");

            System.out.println(inimigo01.getNomeEntidade() + " Atacou com " + danoRecebidoJog + " de dano");

            jogador1.isVivoAinda();
            inimigo01.isVivoAinda();
            System.out.println("Lhe resta: " + jogador1.getPontosVida() + " de vida");
            System.out.println("Inimigo com : " + inimigo01.getPontosVida() + " de vida");

        }

        if (jogador1.isVivoAinda() && !inimigo01.isVivoAinda()) {
            System.out.println("Inimigo derrotado!");
            xpBarra += inimigo01.gerarXP();
            System.out.println("XP: "+ xpBarra);
            jogador1.subirNivel(xpBarra);
            
        } else if (!jogador1.isVivoAinda() && inimigo01.isVivoAinda()){
            System.out.println("Você foi derrotado!");
            
        }

        
    }






    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();}

    public int getDanoDeferidoJog() {
        return danoDeferidoJog;}
    public void setDanoDeferidoJog(int danoDeferidoJog) {
        this.danoDeferidoJog = danoDeferidoJog;}

    public int getDanoRecebidoJog() {
        return danoRecebidoJog;}
    public void setDanoRecebidoJog(int danoRecebidoJog) {
        this.danoRecebidoJog = danoRecebidoJog;}

    public int getDanoDeferidoIn() {
        return danoDeferidoIn;}
    public void setDanoDeferidoIn(int danoDeferidoIn) {
        this.danoDeferidoIn = danoDeferidoIn;}

    public int getDanoRecebidoIn() {
        return danoRecebidoIn;}
    public void setDanoRecebidoIn(int danoRecebidoIn) {
        this.danoRecebidoIn = danoRecebidoIn;}
    
    public int getXpBarra() {
        return xpBarra;}
    public void setXpBarra(int xpBarra) {
        this.xpBarra = xpBarra;}

    
}
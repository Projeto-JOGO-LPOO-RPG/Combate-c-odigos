import java.util.Scanner;

public abstract class Jogador extends Entidade {
    private String nomeJogador;
    private int nivel;
    private int pontosNivel;
    private int acao;

    Scanner scanner = new Scanner(System.in);

    public Jogador(String nomeJogador, int nivel, int pontosNivel, String nomeEntidade, int pontosVida, int pontosDefesa, int pontosAtaque, int pontosMagia,
                   int coordX, int coordY, int velocidade, int numSprite, boolean isVivo) {
        super(nomeEntidade, pontosVida, pontosDefesa, pontosAtaque, pontosMagia, coordX, coordY, velocidade, numSprite, isVivo);
        this.nomeJogador = nomeJogador;
        this.nivel = nivel;
        this.pontosNivel = pontosNivel;
    }

    public String obterNome() {
        System.out.println("Insira o nome do Jogador: ");
        this.nomeJogador = scanner.nextLine();
        return this.nomeJogador;
    }

    public static Jogador escolherPersonagem(String nomeJogador, int nivel, int pontosNivel) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha seu personagem: 1. Cavaleiro 2. Bárbaro 3. Mago");
        int personagemIndex = scanner.nextInt();
        switch (personagemIndex) {
            case 1:
                return new Cavaleiro(nomeJogador, nivel, pontosNivel);
            case 2:
                return new Barbaro(nomeJogador, nivel, pontosNivel);
            case 3:
                return new Mago(nomeJogador, nivel, pontosNivel);
            default:
                System.out.println("Escolha inválida");
                return null;
        }
    }

    public int escolherAcao() {
        this.acao = scanner.nextInt();
        return this.acao;
    }

    public void acessarInventario() {
        System.out.println("Você acessou o inventário, mas não tem nada!");
    }

    public int modificarVidaJogador(int pontosVida) {
        if (pontosVida < 0) {
            pontosVida = 0;
        }
        setPontosVida(pontosVida);
        return pontosVida;
    }
    

    public void subirNivel(int xpGanho){
        //Somar XP ganho do inimigo em batalha à quantidade de pontos 
        pontosNivel+= xpGanho; //Exemplo
        
        if(pontosNivel < 200){
            nivel = 1;
            setPontosAtaque(getPontosAtaque() + 5);
            setPontosDefesa(getPontosDefesa() + 5);
        }
     
        if(pontosNivel >= 200 && pontosNivel < 400){
            nivel = 2;
            System.out.println("Subiu para o nivel "+ nivel);
            setPontosAtaque(getPontosAtaque() + 5);
            setPontosDefesa(getPontosDefesa() + 5);
            System.out.println("Ataque: "+ getPontosAtaque());
            System.out.println("Defesa: "+ getPontosDefesa());
        }

        if(pontosNivel >= 400 && pontosNivel < 700){
            nivel = 3;
            System.out.println("Subiu para o nivel "+ nivel);
            setPontosAtaque(getPontosAtaque() + 5);
            setPontosDefesa(getPontosDefesa() + 5);
        }

        if(pontosNivel >= 700 && pontosNivel < 1200){
            nivel = 4;
            System.out.println("Subiu para o nivel "+ nivel);
            setPontosAtaque(getPontosAtaque() + 5);
            setPontosDefesa(getPontosDefesa() + 5);
        }

        

    }

    


    

    public String getNomeJogador() {
        return nomeJogador;}
    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;}

    public int getNivel() {
        return nivel;}
    public void setNivel(int nivel) {
        this.nivel = nivel;}

    public int getPontosNivel() {
        return pontosNivel;}
    public void setPontosNivel(int pontosNivel) {
        this.pontosNivel = pontosNivel;}

    




}
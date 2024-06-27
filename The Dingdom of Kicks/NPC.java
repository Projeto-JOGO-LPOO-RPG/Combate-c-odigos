// Classe NPC
public class NPC extends Entidade {
    public NPC(String nome, int vida, int ataque, int defesa) {
        super(nome, vida, ataque, defesa);
    }

    @Override
    public void acao() {
        // Implementação das ações específicas do NPC
        System.out.println(getNome() + " está realizando uma ação específica do NPC.");
    }
}
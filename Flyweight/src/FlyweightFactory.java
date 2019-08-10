import java.util.ArrayList;

public class FlyweightFactory {
	protected ArrayList<ArquivosFlyweight> flyweights;
 
    public FlyweightFactory() {
        flyweights = new ArrayList<ArquivosFlyweight>();
        flyweights.add(new Arquivo("Teste", "pdf", "48MB", "c:/teste"));
        flyweights.add(new Arquivo("Teste", "pdf", "48MB", "c:/teste"));
        flyweights.add(new Arquivo("Teste", "pdf", "48MB", "c:/teste"));
    }
 
    public SpriteFlyweight getFlyweight(Sprites jogador) {
        switch (jogador) {
        case JOGADOR:
            return flyweights.get(0);
        case INIMIGO_1:
            return flyweights.get(1);
        case INIMIGO_2:
            return flyweights.get(2);
        case INIMIGO_3:
            return flyweights.get(3);
        case CENARIO_1:
            return flyweights.get(4);
        default:
            return flyweights.get(5);
        }
    }
}

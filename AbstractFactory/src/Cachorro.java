
public class Cachorro implements Animal {
	public FabricaPaisAnimal pais;
    private Incidencia incidencia;
    public Cor cor;

    public Cachorro( FabricaPaisAnimal pais ){
        this.pais = pais;
    }

    public void prepara(){
    	incidencia = pais.criarIncidencia();
    	cor = pais.criarCor();
    }
    
    public Cor getCor(){
    	return cor;
    }
}

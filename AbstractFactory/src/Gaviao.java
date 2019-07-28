
public class Gaviao implements Animal {
	public FabricaPaisAnimal pais;
    private Incidencia incidencia;
    private Cor cor;

    public Gaviao( FabricaPaisAnimal pais ){
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

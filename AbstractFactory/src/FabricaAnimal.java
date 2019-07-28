
public abstract class FabricaAnimal {
	protected Animal animal;
	
	public void criarAnimal(String tipo, String pais) {
		if( tipo.equals("gaviao") ){
            animal = new Gaviao( getEspecies(pais) );
        }else if( tipo.equals("cachorro") ){
            animal = new Cachorro( getEspecies(pais) );
        }
	}
	
	public FabricaPaisAnimal getEspecies( String pais ) {
        if( pais.equals("Congo") ){
            return new FabricaPaisAnimalCongo();
        }else if( pais.equals("China") ){
            return new FabricaPaisAnimalChina();
        }
        return new FabricaPaisAnimalBrasil();
    }
	
	public Animal entregar() {
		return animal;
	}
}

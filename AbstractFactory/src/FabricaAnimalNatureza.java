
public class FabricaAnimalNatureza extends FabricaAnimal{
	@Override
	public void criarAnimal(String tipo, String pais) {
		switch (tipo) {
			case "gaviao":
				animal = new Gaviao(getEspecies(pais));
				break;
			case "cachorro":
				animal = new Cachorro(getEspecies(pais));
				break;
		}		
	}
}

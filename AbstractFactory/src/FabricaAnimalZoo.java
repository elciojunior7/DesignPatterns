
public class FabricaAnimalZoo extends FabricaAnimal{
	
	@Override
	public void criarAnimal(String estadoAnimal, String tipo) {
		switch (tipo) {
			case "gaviao":
				animal = new Gaviao(getEspecies(estadoAnimal));
				break;
			case "cachorro":
				animal = new Cachorro(getEspecies(estadoAnimal));
				break;
		}		
	}
}

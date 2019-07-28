
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FabricaAnimal animalF = new FabricaAnimalNatureza();
		animalF.criarAnimal("cachorro", "Congo");
        Animal animal = animalF.entregar(); 
        
        animal.prepara();
        Cor c = animal.getCor();
        System.out.println(c.getColoracao());
	}

}

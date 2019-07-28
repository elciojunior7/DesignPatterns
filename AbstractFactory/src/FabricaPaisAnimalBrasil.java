
public class FabricaPaisAnimalBrasil extends FabricaPaisAnimal {
	public Incidencia criarIncidencia() {
		return new IncidenciaRara();
	}
    
	 public Cor criarCor() {
		 return new CorAzul();
	 }
}

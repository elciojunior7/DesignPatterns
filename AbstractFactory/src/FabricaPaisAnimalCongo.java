
public class FabricaPaisAnimalCongo extends FabricaPaisAnimal {
	public Incidencia criarIncidencia() {
		return new IncidenciaRara();
	}
    
	 public Cor criarCor() {
		 return new CorAzulVerde();
	 }
}

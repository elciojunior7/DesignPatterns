
public class FabricaPaisAnimalChina extends FabricaPaisAnimal {
	public Incidencia criarIncidencia() {
		return new IncidenciaComum();
	}
    
	 public Cor criarCor() {
		 return new CorVermelho();
	 }
}

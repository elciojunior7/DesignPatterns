
public class EdiculaBuilder extends CasaBuilder{

	//Opera��es s�o implementadas nestes m�todos
	@Override
    public void buildPreco() {
        casa.preco = 60000.00;
    }
 
    @Override
    public void buildAnoConstrucao() {
    	casa.anoConstrucao = 2017;
    }
}

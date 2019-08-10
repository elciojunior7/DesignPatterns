
public class BurguerDecorado extends BurguerDecorator {

	public BurguerDecorado(Comida burguerDecorado) {
        super(burguerDecorado);
    }
 
	@Override
	public void prepare() {
    	this.bacon();
    	this.catupiry();
    	burguerDecorado.prepare();
    }
 
    
	public void bacon() {
		System.out.println("Adicionando bacon");
	}
	public void catupiry() {
		System.out.println("Adicionando catupiry");
	}
}


public class Main {

	public static void main(String[] args) {
		System.out.println("\n ASC");
		Iterator iterador = new Iterator(Iterator.ASC);
		iterador.geraLista();
		iterador.percorreLista();
		
		System.out.println("\n DESC");
		iterador = new Iterator(Iterator.DESC);
		iterador.geraLista();
		iterador.percorreLista();
	}

}


public class Main {

	public static void main(String[] args) {
		System.out.println("\nToken valido");
		RFB proxy = new ProxyRFB(true, 25.00, 2.60, "222.555.666-77");
		System.out.println(proxy.pagarFisico());
		
		System.out.println("\nToken valido");
		proxy = new ProxyRFB(true, 25.00, 2.60, "01.555.666/0001-88");
		System.out.println(proxy.pagarJuridico());
		
		System.out.println("\nToken inválido");
		proxy = new ProxyRFB(false, 25.00, 2.60, "222.555.666-77");
		System.out.println(proxy.pagarFisico());
	}

}

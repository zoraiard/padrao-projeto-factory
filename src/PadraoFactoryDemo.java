
public class PadraoFactoryDemo {

	public static void main(String[] args) {
		
		FormaFactory formaFactory = new FormaFactory();
		
		Forma forma1 = formaFactory.getForma("CIRCULO");
		forma1.desenhar();
		
		Forma forma2 = formaFactory.getForma("QUADRADO");
		forma2.desenhar();
				
		Forma forma3 = formaFactory.getForma("RETANGULO");
		forma3.desenhar();
	}
}

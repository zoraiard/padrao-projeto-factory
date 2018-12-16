
public class FormaFactory {

	//use o método getForma para obter objeto do tipo forma	
	public Forma getForma(String tipoForma) {
		
		if (tipoForma == null) {
			return null;
		}
		
		if(tipoForma.equalsIgnoreCase("CIRCULO")) {
			return new Circulo();
		}

		if(tipoForma.equalsIgnoreCase("RETANGULO")) {
			return new Retangulo();
		}
		
		if(tipoForma.equalsIgnoreCase("QUADRADO")) {
			return new Quadrado();
		}
		
		return null;
	}
	
}

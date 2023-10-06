package comunicacion;
public class Alfabeto extends Pictograma {
	private String[] letras;
	private String interpretacion;
	
	//constructor
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.interpretacion = interpretacion;
		this.letras = letras;

	}
	
	//Metodos abstractos
	
	public String interpretacion() {
		return this.interpretacion;
	}
	
	public String toString() {
		
		return null; //por el momento
	}
	
	//metodos get y set
	public String[] getLetras() {
		return this.letras;
	}
	public void setLetras(String[] letras) {
		this.letras = letras;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	//metodos de la clase

}

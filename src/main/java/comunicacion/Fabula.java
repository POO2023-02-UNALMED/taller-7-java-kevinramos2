package comunicacion;

public class Fabula extends Escrito {
	private String ensenanza;
	private String interpretacion;
	
	//constructor
	public Fabula(String origen,String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}
	
	//metodos abstractos
	public int palabrasTotales(int palabrasPagina) {
		return 0; //momentaneo
	}
	public String interpretacion() {
		return this.interpretacion;
	}
	public String toString() {
		return null; //momentaneo
	}

	//metodos get y set
	public String getEnsenanza() {
		return this.ensenanza;
	}
	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	//metodos de la clase
}

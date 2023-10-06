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

	//metodos de la clase
}

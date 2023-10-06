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
		return this.getPaginas()*palabrasPagina*1; 
	}
	public String interpretacion() {
		return this.interpretacion;
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
	public String toString() {
		return this.getOrigen()+"\n"+this.getTitulo()+"\n"+
				this.getAutor()+"\n"+this.getPaginas()+"\n"+
				this.getEnsenanza();
	}
}

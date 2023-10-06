package comunicacion;

public class Periodico extends Escrito {
	private String fecha;
	private String primicia;
	private String interpretacion;
	
	//constructor
	public Periodico(String origen,String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.fecha = fecha;
		this.primicia = primicia;
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

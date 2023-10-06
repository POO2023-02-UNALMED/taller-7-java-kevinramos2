package comunicacion;

public class Libro extends Escrito {
	private String co_autor;
	private String editorial;
	private String edicion;
	private String interpretacion;
	
	//constructor
	public Libro(String origen,String titulo, String autor, int paginas, String co_autor, String editorial, String edicion, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.co_autor = co_autor;
		this.editorial = editorial;
		this.edicion = edicion;
		this.interpretacion = interpretacion;	
		}
	
	//Metodos abstractos
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

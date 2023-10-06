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
	
	//metodos get y set
	public String[] getLetras() {
		return this.letras;
	}
	public void setLetras(String[] letras) {
		this.letras = letras;
	}
	
	//metodos de la clase
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	public int cantidadLetras() {
		return letras.length;
	}
	public String toString() {
		return "A, B, C, D, E, F, G, H, I, J, K, L, M, N, Ñ, O, P, Q, R, S, T, U, V, W, X, Y, Z";
	}
}

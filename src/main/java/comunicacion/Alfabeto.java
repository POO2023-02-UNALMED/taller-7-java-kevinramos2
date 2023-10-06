package comunicacion;
import java.util.ArrayList;
public class Alfabeto extends Pictograma {
	private static ArrayList<String> letras;
	private String interpretacion;
	
	//constructor
	public Alfabeto(String origen, ArrayList<String> letras, String interpretacion) {
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
	
	//metodos de la clase

}

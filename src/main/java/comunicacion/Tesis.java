package comunicacion;
import java.util.ArrayList;
public class Tesis extends Escrito{
	private String idea;
	private static ArrayList<String> argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	//constructor
	public Tesis(String origen,String titulo, String autor, int paginas,String idea, ArrayList argumentos, String conclusion, String referencias, String interpretacion) {
		super(origen,titulo,autor,paginas);
		this.idea = idea;
		this.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencias = referencias;
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

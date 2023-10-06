package comunicacion;
public class Tesis extends Escrito{
	private String idea;
	private String[] argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	//constructor
	public Tesis(String origen,String titulo, String autor, int paginas,String idea, String[] argumentos, String conclusion, String referencias, String interpretacion) {
		super(origen,titulo,autor,paginas);
		this.idea = idea;
		this.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
	}
	
	//metodos abstractos
		public String interpretacion() {
			return this.interpretacion;
		}
		
	//metodos get y set
		public String getIdea() {
			return this.idea;
		}
		public void setIdea(String idea) {
			this.idea = idea;
		}
		public String[] getArgumentos() {
			return this.argumentos;
		}
		public void setArgumentos(String[] argumentos) {
			this.argumentos = argumentos;
		}
		public String getConclusion() {
			return this.conclusion;
		}
		public void setConclusion(String conclusion) {
			this.conclusion = conclusion;
		}
		public String getReferencias() {
			return this.referencias;
		}
		public void setReferencias(String referencias) {
			this.referencias = referencias;
		}
		public void setInterpretacion(String interpretacion) {
			this.interpretacion = interpretacion;
		}
		
	//metodos de la clase
		public int palabrasTotales(int palabrasPagina) {
			return this.getPaginas()*5; 
		}
		public String toString() {
			return this.getOrigen()+"\n"+this.getTitulo()+"\n"+
					this.getAutor()+"\n"+this.getPaginas()+"\n"+
					this.getIdea()+"\n"+this.getArgumentos()+"\n"+
					this.getConclusion()+"\n"+this.getReferencias();
		}
}

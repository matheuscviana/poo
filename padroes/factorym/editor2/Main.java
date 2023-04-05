package padroes.factorym.editor2;

public class Main {
	
	public static void main(String[] args) {
		
		Visualizador visualizador = new VisualizadorBMP();
		visualizador.visualizar();
		
		visualizador = new VisualizadorJPG();
		visualizador.visualizar();
		
	}

}

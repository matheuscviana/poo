package padroes.factorym.editor2;

public class VisualizadorJPG extends Visualizador {

	@Override
	public Imagem getImagem() {
		return new ImagemJPG();
	}
	
}

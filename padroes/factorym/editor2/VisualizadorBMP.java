package padroes.factorym.editor2;

public class VisualizadorBMP extends Visualizador {

	@Override
	public Imagem getImagem() {
		return new ImagemBMP();
	}
	
}

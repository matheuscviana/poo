package padroes.factorym.editor2;

public abstract class Visualizador{
	
	public abstract Imagem getImagem();

    public void visualizar(){
	    Imagem img = getImagem();
	    img.carregar();
	    img.exibir();
	    img.fechar();
    }
    
}


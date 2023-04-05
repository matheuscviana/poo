package padroes.factorym.editor2;

public abstract class Imagem{
	
	public abstract void carregar();
	
	public void exibir() {
       System.out.println("Exibindo imagem por 20 segundos.");
	}
	
	public void fechar() {
       System.out.println("Fechando imagem.");
	}
	
}

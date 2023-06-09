package padroes.observer.revista;

import java.util.Observable;
import java.util.Observer;

public class RevistaInformatica extends Observable {

	private int edicao;

	public void setNovaEdicao(int novaEdicao) {
		this.edicao = novaEdicao;
		
		setChanged();
		notifyObservers();
	}
	
	public int getEdicao() {
		return this.edicao;
	}
	
	public static void main(String[] args) {
		//poderia receber a nova edicao atraves de um recurso externo
		int novaEdicao = 3;
		RevistaInformatica revistaInformatica = new RevistaInformatica();		
		Assinante1 assinante1 = new Assinante1(revistaInformatica);
		
		revistaInformatica.setNovaEdicao(novaEdicao);
	}

}

class Assinante1 implements Observer {
	
	int edicaoNovaRevista;
	
	public Assinante1(Observable revistaInformatica) {
		revistaInformatica.addObserver(this);
	}
	
	@Override
	public void update(Observable revistaInfSubject, Object arg1) {
		if (revistaInfSubject instanceof RevistaInformatica) {
			RevistaInformatica revistaInformatica = (RevistaInformatica) revistaInfSubject;
			edicaoNovaRevista = revistaInformatica.getEdicao();
			System.out.println("Atencao, ja chegou a mais uma edicao da Revista Informatica. " +
					"Esta eh a sua edicao numero: " + edicaoNovaRevista);
		}
	}	
}

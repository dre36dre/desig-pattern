package strategy;

public class Robo {
    Comportamento comportamento;

	public void setComportamento(Comportamento comportamento) {
		this.comportamento = comportamento;
	}
    
    public void mover() {
    	comportamento.mover();
    }
}
package strategy;

public class TesteRobo {
	public static void main(String[] args) {
		Comportamento normal=new ComportamentoNomal();
		Comportamento agressivo=new ComportamentoAgressivo();
		Comportamento defensivo=new ComportamentoDefensivo();
		
		Robo robo=new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();	
		
	}
}

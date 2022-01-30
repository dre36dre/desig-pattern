package singleton;

public class SingletonLazerHolder {
	private static class InstanceHolder{
	
	private static SingletonLazerHolder instancia=new SingletonLazerHolder();
	}	 
	private SingletonLazerHolder(){
		super();
	}

	public static SingletonLazerHolder getInstancia() {
	
		return InstanceHolder.instancia;
	}

	}
	 


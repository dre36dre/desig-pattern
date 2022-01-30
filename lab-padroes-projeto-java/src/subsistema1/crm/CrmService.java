package subsistema1.crm;

class CrmService {
	
	private CrmService() {
		 super();
	}
	
public static void gravarCliente
(String cep,String nome,String estado,String cidade) {
System.out.println("Salvo no sistema de crm");	

System.out.println(nome);
System.out.println(cep);
System.out.println(cidade);
System.out.println(estado);
}
}

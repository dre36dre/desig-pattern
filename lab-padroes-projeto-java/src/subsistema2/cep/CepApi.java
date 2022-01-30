package subsistema2.cep;

public class CepApi {
public static CepApi instancia=new CepApi();

private  CepApi() {
	}

public static CepApi getInstancia() {
	return instancia;
}

public String recuperarCidade(String cep) {
	return "Itu";
}
public String recuperarEstado(String cep) {
	return "SP";
}

}

public class Contador {
	public static void main(String[] args) {
		int parametroUm = 8;
		int parametroDois = 10;
 
		try {
 
			contar(parametroUm, parametroDois);
 
		}catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		}
 
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
    throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
  }
 
		int contagem = parametroDois - parametroUm;
 
		for (int i = 0; i < contagem; ++i) {
		  System.out.printf("Imprimindo o numero %d%n", i);
		}
 
	}
	
	public static class ParametrosInvalidosException extends Exception {

  public ParametrosInvalidosException(String message) {
    super(message);
  }
}
}

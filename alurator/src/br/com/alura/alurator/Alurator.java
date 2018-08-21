package br.com.alura.alurator;

public class Alurator {
	
	private String basePackage;
	
	public Alurator(String basePackage) {
		
		this.basePackage = basePackage;
		
	}
	
	public Object executa(String url)  {
		// TODO - processa a requisicao executando o metodo
		// da classe em questao
		
		// /produto/lista
		
		String[] path = url.replaceFirst("/", "").split("/");
		
		String controllerName = path[0] + "." + "Controller";
		
		try {
			Class<?> controllerClass = Class.forName(basePackage + controllerName);
			
			Object controllerInstance = controllerClass.newInstance();
			
			System.out.println(controllerInstance);
			
			
		} catch (ClassNotFoundException  | InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
		
		
		
		return null;
	}
}

package br.com.alura.alurator.playground.reflexao;

import br.com.alura.alurator.playground.controle.Controle;

public class TesteInstanciaReflexao {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		//Metodo 1
		Class<Controle> controleClasse1 = Controle.class;
		
		//Metodo 2
		Controle controle = new Controle();
		Class<? extends Controle> controleClasse2 =  controle.getClass();
		
		
		//Metodo 3
		Class<?> controleClasse3 = Class.forName("br.com.alura.alurator.playground.controle.Controle");
		
		Object objetoControle = controleClasse1.newInstance();
		
		Object objetoControle2 = controleClasse2.newInstance();
		
		Object objetoControle3 = controleClasse3.newInstance();
		
		System.out.println(objetoControle);
		System.out.println(objetoControle2);
		System.out.println(objetoControle3);
	}
	
}

package br.com.alura.alurator.playground.controle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controle {
	private List<String> lista = new ArrayList(Arrays.asList("item 1", "item 2", "item 3"));
	
	public List<String> getLista() {
		return lista;
	}
}

package ar.edu.unlam.basica2.ClubAntiHomeros;

import java.util.Comparator;

public class ComparadorDeEdades implements Comparator<Cliente> {
	
	@Override
	public int compare( Cliente cliente1, Cliente cliente2 ){
		
		return cliente1.getEdad().compareTo(cliente2.getEdad());
	}

}

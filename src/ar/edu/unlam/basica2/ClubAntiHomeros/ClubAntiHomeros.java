package ar.edu.unlam.basica2.ClubAntiHomeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class ClubAntiHomeros {
	
	
	private Set<Cliente> cliente;
	private Boolean abierto;
	
	public ClubAntiHomeros(){
		this.abierto = true;
		this.cliente = new TreeSet<Cliente>();
	}
	
	public Boolean estaAbierto(){
		return this.abierto;
	}
	
	
	public void abrir(){
		this.abierto = true;
	}
	
	public void cerrar(){
		this.abierto = false;
	}
	
	
	
	public void nuevoCliente(Cliente cliente){
		this.cliente.add(cliente);
	}
		
	
	
	public ArrayList<Cliente> getClientesOrdenPorEdad(){
		
		ArrayList<Cliente> clientes = new ArrayList<Cliente>(this.cliente);
		Collections.sort(clientes, new ComparadorDeEdades());
		return clientes;
	}

	
	
	public Set<Cliente> getClientes(){
		return this.cliente;
	}
	
}

package ar.edu.unlam.basica2.ClubAntiHomeros;

public class Cliente implements Comparable<Cliente>{

	private String nombre;
	private Integer edad;
	
	public Cliente(String nombre, Integer edad){
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public Integer getEdad(){
		return this.edad;
	}
	
	@Override
	public int compareTo(Cliente otroCliente){
		return this.nombre.compareTo(otroCliente.getNombre());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((edad == null) ? 0 : edad.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (edad == null) {
			if (other.edad != null)
				return false;
		} else if (!edad.equals(other.edad))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
	
}

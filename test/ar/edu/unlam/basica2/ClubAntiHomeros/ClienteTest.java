package ar.edu.unlam.basica2.ClubAntiHomeros;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClienteTest {
		
		@Test
		public void testearQueElClubAbraSinClientes(){
			
			ClubAntiHomeros miClub = new ClubAntiHomeros();
			
			assertTrue(miClub.estaAbierto());
			
			miClub.cerrar();
			
			assertTrue(miClub.estaAbierto() == false);			
			assertTrue(miClub.getClientes().size() == 0);
			
		}
		
		
		
		@Test
		public void testearQueNoIngresenClientesDuplicados(){
			
			ClubAntiHomeros miClub = new ClubAntiHomeros();
			
			Cliente c1 = new Cliente("Lucas",15);
			Cliente c2 = new Cliente("Maria",15);
			Cliente c3 = new Cliente("Lucas",15);
			
			miClub.nuevoCliente(c1);
			miClub.nuevoCliente(c2);
			miClub.nuevoCliente(c3);
			
			assertTrue(miClub.getClientes().size() == 2);
		}
		
		
		
		@Test
		public void testearQueLosClientesIngresadosSeOrdenenAlfabeticamente() {

			ClubAntiHomeros miClub = new ClubAntiHomeros();
			Cliente cliente1 = new Cliente("Rubens" , 40);
			Cliente cliente2 = new Cliente("Martins", 35);
			Cliente cliente3 = new Cliente("Marians", 30);
			Cliente cliente4 = new Cliente("Natans" , 25);

			miClub.nuevoCliente(cliente1);
			miClub.nuevoCliente(cliente2);
			miClub.nuevoCliente(cliente3);
			miClub.nuevoCliente(cliente4);

			System.out.println("ORDENADOS ALFABETICAMENTE ");
			miClub.getClientes();
		}	
		
		
		@Test
		public void probarQueEstenOrdenadosPorEdad(){
			ClubAntiHomeros miClub = new ClubAntiHomeros();
			Cliente c1 = new Cliente("Ayelen"	,55);
			Cliente c2 = new Cliente("Brenda"	,45);
			Cliente c3 = new Cliente("Florencia",28);
			Cliente c4 = new Cliente("Melanie"	,30);
		
			miClub.nuevoCliente(c1);
			miClub.nuevoCliente(c2);
			miClub.nuevoCliente(c3);
			miClub.nuevoCliente(c4);
			
			System.out.println("ORDENADOS POR EDAD ");
			System.out.println(miClub.getClientesOrdenPorEdad());
		}
		
}

package ufv.dis.parcialfinal.abb;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestUsuarios {

	@Test
	public void instanciarUsuario() {
		Usuario u = new Usuario("Alejandro", "Berlinches", 20);
		
		assertEquals("Alejandro", u.getName());
		
	}
	
	@Test
	public void addUsuarioLista() {
		Usuario u = new Usuario("Alejandro", "Berlinches", 20);
		
		Lista lista = new Lista();
		lista.addUsuario(u);
		
		assertEquals(1, lista.getListaSize());
	}
	
	@Test
	public void comprobarMayoriaEdad() {
		
		Usuario u = new Usuario ("Alejandro", "berlinches", 18);
		
		assertEquals(true, u.isAdult());
		
		Usuario u2 = new Usuario ("Alejandro", "berlinches", 16);
		
		assertEquals(false, u2.isAdult());
	}
}

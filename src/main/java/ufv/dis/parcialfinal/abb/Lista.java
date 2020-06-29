package ufv.dis.parcialfinal.abb;

import java.util.ArrayList;

public class Lista {

	private ArrayList <Usuario> usuarios;
	
	public Lista() {
		
		usuarios = new ArrayList<Usuario>();
	}
	
	public void addUsuario(Usuario u) {
		usuarios.add(u);
	}
	
	public int getListaSize() {
		return usuarios.size();
	}
}

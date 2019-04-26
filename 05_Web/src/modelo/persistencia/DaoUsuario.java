package modelo.persistencia;

import java.util.ArrayList;

import modelo.entidades.Usuario;

/*
 * Esta capa se encarga del acceso a los objetos de negocio. DAO (Data Access Object)
 */

public class DaoUsuario {
	
	private ArrayList<Usuario> listaUsuario;
	//vamos a simular una BBDD
	
	public DaoUsuario() {
		listaUsuario = new ArrayList<>();
		
		Usuario usuario = new Usuario();
		usuario.setNombre("Pepe");
		usuario.setPwd("1234");
		//otra forma de hacerlo seria
		//listaUsuario.get(0).setNombre("Pepe");
		
		listaUsuario.add(usuario);
		
		usuario = new Usuario();
		usuario.setNombre("Ana");
		usuario.setPwd("5678");
		
		listaUsuario.add(usuario);	
	}
	
	public ArrayList<Usuario> getListaUsuario(){
		//este metodo tendria que hacer la consulta a la BBDD
		return listaUsuario;
	}
	
	public Usuario getUsuario(String nombre) {
		//pdte implementar
		return null;
	}
	
}

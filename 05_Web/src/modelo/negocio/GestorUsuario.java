package modelo.negocio;

import java.util.ArrayList;

import modelo.entidades.Usuario;
import modelo.persistencia.DaoUsuario;

//Esta capa se encarga de llevar la LN de nuestra aplicacion
//, dicho de otra manera, la funcionalidad de nuestra aplicacion, para lo que se programo

public class GestorUsuario {
	/**
	 * Metodo que valida si un usuario esta regristrado en el sistema
	 * @param user el usuario a validar
	 * @return true en caso de que el usuario este registrado, false lo contrario
	 */
	public boolean validarUsuario(Usuario user) {
		//esta capa es la que se comunica con la BBDD
		//podemos validar antes de hacer la consulta a la BBDD, que el usario no sea vacio
		if (user.getNombre().equals("") || user.getPwd().equals("")) {
			return false;
		}
		
		//accedo a los datos para validar si esta el usuairo
		DaoUsuario daoUsuario = new DaoUsuario();
		ArrayList<Usuario> listaUsuarios = daoUsuario.getListaUsuario();
		
		for (Usuario usuarioAux : listaUsuarios) {
			if (usuarioAux.getNombre().equals(user.getNombre())&& 
					usuarioAux.getPwd().equals(user.getPwd())){
				return true;
			}
		}
		
		return false;
		
	}

}

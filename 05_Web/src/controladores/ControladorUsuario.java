package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.entidades.Usuario;
import modelo.negocio.GestorUsuario;

/**
 * Servlet implementation class ControladorUsuario
 */
/* 
 * Para la creacion de servlets se usa un concepto que se llama 
 * inversion de control. Este concepto nos dice que nosotros no vamos a 
 * gestionar directamente el ciclo de vida de este objeto Servlet
 * si no que va a ser Tomcat el que lo gestione
 */
/*
 * La anotacion WebServlet le dice a Tomcat que tiene que gestionar el ciclo de vida de este objeto,
 * (IoC) Inversion Of Control
 * La manera de acceder a este Servlet va a a ser segun el nombre que este dentro de la anotacion
 */
@WebServlet("/ControladorUsuario")
public class ControladorUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("nombreUsuario");
		String pwd = request.getParameter("pwdUsuario");
		
		//nos creamos un usuario para incluirle los parametros
		Usuario usuario = new Usuario();
		usuario.setNombre(nombre);
		usuario.setPwd(pwd);
		
		//llamamos al gestor para validar el usuario
		GestorUsuario gu = new GestorUsuario();
		if (gu.validarUsuario(usuario)) {
			request.setAttribute("usuario", usuario);
			request.getRequestDispatcher("Principal.jsp").forward(request, response);
			
		}else {
			//algo ha ido mal
			request.getRequestDispatcher("error.html").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

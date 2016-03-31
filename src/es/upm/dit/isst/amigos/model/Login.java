package es.upm.dit.isst.amigos.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Login implements Serializable {

	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String usuario;
	private String contrase�a;
	
	public Login(String usuario, String contrase�a){
		this.usuario = usuario;
		this.contrase�a = contrase�a;
	}
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public String getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
}

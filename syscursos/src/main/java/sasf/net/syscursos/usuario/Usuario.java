package sasf.net.syscursos.usuario;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity

@Table(name="usuario")
public class Usuario implements Serializable {
private static final long serialVersionUID =1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_usuario")
	private Integer idUsuario;
	@Column(name="nombres")
	private String nombres;
	@Column(name="email")
	private String email;
	@Column(name="contraseña")
	private String contraseña;
	@Column(name="tipo_usuario")
	private String tipoUsuario;
	
	
	public Usuario() {
	}

	
	public Usuario(Integer idUsuario, String nombres, String email, String contraseña, String tipoUsuario) {
		super();
		this.idUsuario = idUsuario;
		this.nombres = nombres;
		this.email = email;
		this.contraseña = contraseña;
		this.tipoUsuario = tipoUsuario;
	}


	public Integer getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}


	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getContraseña() {
		return contraseña;
	}


	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}


	public String getTipoUsuario() {
		return tipoUsuario;
	}


	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}



	
	
	
	
}

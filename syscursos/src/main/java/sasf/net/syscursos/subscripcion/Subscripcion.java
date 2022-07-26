package sasf.net.syscursos.subscripcion;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity

@Table(name="subscripcion")
public class Subscripcion implements Serializable {
	private static final long serialVersionUID =1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_subscripcion")
	private Integer idSubscripcion;
	@Column(name="id_curso")
	private int idCurso;
	@Column(name="id_usuario")
	private int idUsuario;
	
	public Subscripcion() {
	}

	public Subscripcion(Integer idSubscripcion, int idCurso, int idUsuario) {
		super();
		this.idSubscripcion = idSubscripcion;
		this.idCurso = idCurso;
		this.idUsuario = idUsuario;
	}

	public Integer getIdSubscripcion() {
		return idSubscripcion;
	}

	public void setIdSubscripcion(Integer idSubscripcion) {
		this.idSubscripcion = idSubscripcion;
	}

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	
	
	
	

}

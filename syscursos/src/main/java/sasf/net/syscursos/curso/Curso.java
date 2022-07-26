package sasf.net.syscursos.curso;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity

@Table(name="curso")
public class Curso implements Serializable {
private static final long serialVersionUID =1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_curso")
	private Integer idCurso;
	@Column(name="nombre_curso")
	private String nombreCurso;
	@Column(name="estado")
	private String estado;
	@Column(name="id_usuario")
	private int id_usuario;
	
	public Curso() {
	}

	public Curso(Integer idCurso, String nombreCurso, String estado, int id_usuario) {
		super();
		this.idCurso = idCurso;
		this.nombreCurso = nombreCurso;
		this.estado = estado;
		this.id_usuario = id_usuario;
	}

	public Integer getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	


	

	
	
}
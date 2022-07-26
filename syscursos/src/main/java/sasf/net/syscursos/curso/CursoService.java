package sasf.net.syscursos.curso;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CursoService {

	@Autowired
	private CursoRepository repo;
	
	public List<Curso> listAll(){
		return repo.findAll();
	}
	
	public void save(Curso curso) {
		try {
			repo.save(curso);
		}catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
	
	public Curso get(Integer id) {
		return repo.findById(id).get();
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
}

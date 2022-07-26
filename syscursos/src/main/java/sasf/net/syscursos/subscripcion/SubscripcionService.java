package sasf.net.syscursos.subscripcion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SubscripcionService {
	
	@Autowired
	private SubscripcionRepository repo;
	
	public List<Subscripcion> listAll(){
		return repo.findAll();
	}
	
	public void save(Subscripcion subscripcion) {
		try {
			repo.save(subscripcion);
		}catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
	
	public Subscripcion get(Integer id) {
		return repo.findById(id).get();
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
}

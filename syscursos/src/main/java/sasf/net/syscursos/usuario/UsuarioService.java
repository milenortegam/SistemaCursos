package sasf.net.syscursos.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repo;
	
	public List<Usuario> listAll(){
		return repo.findAll();
	}
	
	public void save(Usuario usuario) {
		try {
			repo.save(usuario);
		}catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
	
	public Usuario get(Integer id) {
		return repo.findById(id).get();
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
}

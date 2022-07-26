package sasf.net.syscursos.usuario;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UsuarioController {
	@Autowired
	private UsuarioService service;
	
	@GetMapping("/usuarios")
	public List<Usuario> list() {
	    return service.listAll();
	}
	
	@GetMapping("/usuarios/{id}")
	public ResponseEntity<Usuario> get(@PathVariable Integer id) {
		try {
			Usuario usuario = service.get(id);
			return new ResponseEntity<Usuario>(usuario, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Usuario>(HttpStatus.NOT_FOUND);
		}		
	}
	@PostMapping("/usuarios")
	public void add(@RequestBody Usuario usuario) {
	    service.save(usuario);
	}
	@PutMapping("/usuarios/{id}")
	public ResponseEntity<?> update(@RequestBody Usuario usuario, @PathVariable Integer id) {
	    try {
	    	Usuario exist = service.get(id);
	        service.save(usuario);
	        return new ResponseEntity<>(HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }      
	}
	@DeleteMapping("/usuarios/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}

}

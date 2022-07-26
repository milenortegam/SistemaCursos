package sasf.net.syscursos.curso;

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

import sasf.net.syscursos.usuario.Usuario;
import sasf.net.syscursos.usuario.UsuarioService;

@RestController
public class CursoController {
	
	@Autowired
	private CursoService service;
	
	@GetMapping("/cursos")
	public List<Curso> list() {
	    return service.listAll();
	}
	
	@GetMapping("/cursos/{id}")
	public ResponseEntity<Curso> get(@PathVariable Integer id) {
		try {
			Curso curso = service.get(id);
			return new ResponseEntity<Curso>(curso, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Curso>(HttpStatus.NOT_FOUND);
		}		
	}
	@PostMapping("/cursos")
	public void add(@RequestBody Curso curso) {
	    service.save(curso);
	}
	@PutMapping("/cursos/{id}")
	public ResponseEntity<?> update(@RequestBody Curso curso, @PathVariable Integer id) {
	    try {
	    	Curso exist = service.get(id);
	        service.save(curso);
	        return new ResponseEntity<>(HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }      
	}
	@DeleteMapping("/cursos/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
	
}	

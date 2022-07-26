package sasf.net.syscursos.subscripcion;

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
public class SubscripcionController {

	@Autowired
	private SubscripcionService service;
	
	@GetMapping("/subs")
	public List<Subscripcion> list() {
	    return service.listAll();
	}
	
	@GetMapping("/subs/{id}")
	public ResponseEntity<Subscripcion> get(@PathVariable Integer id) {
		try {
			Subscripcion subscripcion = service.get(id);
			return new ResponseEntity<Subscripcion>(subscripcion, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Subscripcion>(HttpStatus.NOT_FOUND);
		}		
	}
	@PostMapping("/subs")
	public void add(@RequestBody Subscripcion subscripcion) {
	    service.save(subscripcion);
	}
	@PutMapping("/subs/{id}")
	public ResponseEntity<?> update(@RequestBody Subscripcion subscripcion, @PathVariable Integer id) {
	    try {
	    	Subscripcion exist = service.get(id);
	        service.save(subscripcion);
	        return new ResponseEntity<>(HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }      
	}
	@DeleteMapping("/subs/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
	
}

package sgma.resource.api.controllers;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.security.Principal;

@RestController
public class UserController {

	@GetMapping(value="/details", produces=MediaType.APPLICATION_JSON_VALUE)
	//@PreAuthorize("hasRole('ROLE_USER')")
	public ResponseEntity<Principal> get(final Principal principal) {
		return ResponseEntity.ok(principal);
	}

}

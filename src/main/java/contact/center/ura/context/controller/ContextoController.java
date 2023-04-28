package contact.center.ura.context.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/contexto")
@RestController
public class ContextoController {

    @GetMapping()
    public ResponseEntity<String> getContexto(){
        return ResponseEntity.ok("Cavalaria");
    }
}

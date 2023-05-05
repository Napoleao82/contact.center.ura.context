package contact.center.ura.context.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/opcao")
@RestController
public class OpcaoController {

    @GetMapping()
    public ResponseEntity<String> getOpcao(){
        return ResponseEntity.ok("Cavalaria Opcao!");
    }
}

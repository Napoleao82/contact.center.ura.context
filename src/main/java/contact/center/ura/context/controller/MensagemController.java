package contact.center.ura.context.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/mensagem")
@RestController
public class MensagemController {

    @GetMapping()
    public ResponseEntity<String> getMensagem(){
        return ResponseEntity.ok("Cavalaria Mensagem!");
    }
}
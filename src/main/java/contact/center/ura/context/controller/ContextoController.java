package contact.center.ura.context.controller;

import contact.center.ura.context.entity.Contexto;
import contact.center.ura.context.service.ContextoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/contexto")
@RestController
public class ContextoController {

    @Autowired
    private ContextoService contextoService;
    /*@GetMapping()
    public ResponseEntity<String> getContexto(){
        return ResponseEntity.ok("Cavalaria");
    }*/
    @GetMapping()
    public List<Contexto> listar(){
        return contextoService.findAll();
    }
}

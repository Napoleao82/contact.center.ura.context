package contact.center.ura.context.controller;

import contact.center.ura.context.entity.Contexto;
import contact.center.ura.context.model.ContextoDTO;
import contact.center.ura.context.repository.ContextoRepository;
import contact.center.ura.context.service.ContextoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/contexto")
@RestController
public class ContextoController {
    @Autowired
    private ContextoService contextoService;

    @Autowired
    private ContextoRepository contextoRepository;

    @GetMapping()
    public List<Contexto> readContexto() {
        return contextoService.findAll();
    }
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Contexto createContexto(@RequestBody ContextoDTO contextoDTO){
        return contextoService.salvarContexto(contextoDTO);
    }

    @PutMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Contexto> updateContexto(@RequestParam String nome, @RequestBody ContextoDTO contextoDTO) {
        Contexto contexto = contextoService.alterarContexto(nome, contextoDTO);
        return ResponseEntity.ok(contexto);
    }

    @DeleteMapping()
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteContexto(@RequestParam String nome){
        contextoService.deletarContexto(nome);
    }
}

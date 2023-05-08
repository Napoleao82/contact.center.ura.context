package contact.center.ura.context.controller;

import contact.center.ura.context.entity.Opcao;
import contact.center.ura.context.model.OpcaoDTO;
import contact.center.ura.context.service.OpcaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping("/opcao")
@RestController
public class OpcaoController {
    @Autowired
    private OpcaoService opcaoService;

    @GetMapping()
    public List<Opcao> readOpcao() {
        return opcaoService.findAll();
    }
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Opcao createOpcao(@RequestBody OpcaoDTO opcaoDTO){
        return opcaoService.salvarOpcao(opcaoDTO);
    }

    @PutMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Opcao> updateOpcao(@RequestParam Integer id, @RequestBody OpcaoDTO opcaoDTO) {
        Opcao opcao = opcaoService.alterarOpcao(id, opcaoDTO);
        return ResponseEntity.ok(opcao);
    }
    @DeleteMapping()
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteOpcao(@RequestParam Integer id){
        opcaoService.deletarOpcao(id);
    }
}
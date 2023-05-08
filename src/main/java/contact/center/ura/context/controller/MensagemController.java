package contact.center.ura.context.controller;

import contact.center.ura.context.entity.Mensagem;
import contact.center.ura.context.model.MensagemDTO;
import contact.center.ura.context.service.MensagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping("/mensagem")
@RestController
public class MensagemController {
    @Autowired
    private MensagemService mensagemService;

    @GetMapping()
    public List<Mensagem> readMensagem() {
        return mensagemService.findAll();
    }
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Mensagem createMensagem(@RequestBody MensagemDTO mensagemDTO){
        return mensagemService.salvarMensagem(mensagemDTO);
    }

    @PutMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Mensagem> updateMensagem(@RequestParam Integer id, @RequestBody MensagemDTO mensagemDTO) {
        Mensagem mensagem = mensagemService.alterarMensagem(id, mensagemDTO);
        return ResponseEntity.ok(mensagem);
    }
    @DeleteMapping()
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteMensagem(@RequestParam Integer id){
        mensagemService.deletarMensagem(id);
    }
}
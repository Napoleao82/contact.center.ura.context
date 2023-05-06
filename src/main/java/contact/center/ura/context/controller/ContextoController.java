package contact.center.ura.context.controller;

import contact.center.ura.context.entity.Contexto;
import contact.center.ura.context.model.ContextoDTO;
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

    @GetMapping()
    public List<Contexto> listar() {
        return contextoService.findAll();
    }
    //aqui chamarei todos os métodos da api @GetMapping que já foi, @PostMapping e @DeletMapping
    //na service eu criarei o método
    @PostMapping
    //@RequestBody annotation responsável por receber o body do protocolo http e colocar através de um método, o body dentro do objeto
    @ResponseStatus(HttpStatus.CREATED) //annotation responsável pelo responsta da api
    public ResponseEntity<ContextoDTO> postContexto(@RequestBody ContextoDTO contextoDTO){
        Contexto contexto = contextoService.salvarContexto(contextoDTO);
        return ResponseEntity.ok(new ContextoDTO(contexto));
    }

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED) //annotation responsável pelo responsta da api
    public void alterar(@RequestBody Contexto contexto){
        contextoService.alterar(contexto);
    }

    @DeleteMapping
    @RequestMapping("{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void excluir(@PathVariable Long id){
        contextoService.excluir(id);
    }
}

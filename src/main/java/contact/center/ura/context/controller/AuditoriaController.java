package contact.center.ura.context.controller;

import contact.center.ura.context.entity.Auditoria;
import contact.center.ura.context.model.AuditoriaDTO;
import contact.center.ura.context.repository.AuditoriaRepository;
import contact.center.ura.context.service.AuditoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/auditoria")
@RestController
public class AuditoriaController {
    @Autowired
    private AuditoriaService auditoriaService;

    @Autowired
    private AuditoriaRepository auditoriaRepository;

    @GetMapping()
    public List<Auditoria> readAuditoria() {
        return auditoriaService.findAll();
    }
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Auditoria createAuditoria(@RequestBody AuditoriaDTO auditoriaDTO){
        return auditoriaService.salvarAuditoria(auditoriaDTO);
    }
}
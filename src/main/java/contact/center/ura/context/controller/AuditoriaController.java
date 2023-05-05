package contact.center.ura.context.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/auditoria")
@RestController
public class AuditoriaController {

    @GetMapping()
    public ResponseEntity<String> getAuditoria(){
        return ResponseEntity.ok("Cavalaria Auditoria!");
    }
}
package contact.center.ura.context.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/menu")
@RestController
public class MenuController {

    @GetMapping()
    public ResponseEntity<String> getMenu(){
        return ResponseEntity.ok("Cavalaria Menu!");
    }
}
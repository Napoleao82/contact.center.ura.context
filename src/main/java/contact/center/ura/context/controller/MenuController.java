package contact.center.ura.context.controller;

import contact.center.ura.context.entity.Menu;
import contact.center.ura.context.model.MenuDTO;
import contact.center.ura.context.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping("/menu")
@RestController
public class MenuController {
    @Autowired
    private MenuService menuService;

    @GetMapping()
    public List<Menu> readMenu() {
        return menuService.findAll();
    }
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Menu createMenu(@RequestBody MenuDTO menuDTO){
        return menuService.salvarMenu(menuDTO);
    }

    @PutMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Menu> updateMenu(@RequestParam Integer id, @RequestBody MenuDTO menuDTO) {
        Menu menu = menuService.alterarMenu(id, menuDTO);
        return ResponseEntity.ok(menu);
    }
    @DeleteMapping()
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteMenu(@RequestParam Integer id){
        menuService.deletarMenu(id);
    }
}
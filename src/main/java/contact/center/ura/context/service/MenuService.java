package contact.center.ura.context.service;

import contact.center.ura.context.entity.Menu;
import contact.center.ura.context.model.MenuDTO;
import contact.center.ura.context.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class MenuService {
    @Autowired
    private MenuRepository menuRepository;

    public List<Menu> findAll() {
        List<Menu> menus = menuRepository.findAll();
        if(menus.isEmpty()){
            System.out.println("Não existem dados na tabela");
        }
        return menus;
    }
    public Menu salvarMenu(MenuDTO menuDTO) {
        Menu menu = new Menu();
        menu.setNome(menuDTO.getNome());
        menu.setIdContexto(menuDTO.getIdContexto());

        return menuRepository.save(menu);
    }

    public Menu alterarMenu(Integer id, MenuDTO menuDTO){
        Optional<Menu> menuOpt = menuRepository.findById(id);
        Menu menu = menuOpt.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Mensagem não encontrada"));

        menu.setNome(menuDTO.getNome());
        menu.setIdContexto(menuDTO.getIdContexto());

        menu = menuRepository.save(menu);

        return menuRepository.save(menu);
    }

    public void deletarMenu(Integer id) {
        Optional<Menu> menuOpt = menuRepository.findById(id);
        if (menuOpt == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Menu não encontrado");
        }
        menuRepository.delete(menuOpt.get());
    }
}
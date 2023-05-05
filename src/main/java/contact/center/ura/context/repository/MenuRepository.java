package contact.center.ura.context.repository;

import contact.center.ura.context.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface MenuRepository extends JpaRepository<Menu, Integer> {
    Menu save(Menu menu);

    default Menu criarMenu(Integer id, String nome, Integer idContexto){
        Menu menu = new Menu();
        menu.setId(id);
        menu.setNome(nome);
        menu.setIdContexto(idContexto);

        return save(menu);
    }
}

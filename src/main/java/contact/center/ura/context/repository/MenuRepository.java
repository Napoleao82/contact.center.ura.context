package contact.center.ura.context.repository;

import contact.center.ura.context.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface MenuRepository extends JpaRepository<Menu, Integer> {
    Menu save(Menu menu);

    Optional<Menu> findById(Integer id);

    List<Menu> findAll();
}

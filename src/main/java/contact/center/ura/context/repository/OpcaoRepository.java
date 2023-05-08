package contact.center.ura.context.repository;

import contact.center.ura.context.entity.Opcao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface OpcaoRepository extends JpaRepository<Opcao, Integer> {
    Opcao save(Opcao opcao);

    Optional<Opcao> findById(Integer id);

    List<Opcao> findAll();
}

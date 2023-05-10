package contact.center.ura.context.repository;

import contact.center.ura.context.entity.Mensagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface MensagemRepository extends JpaRepository<Mensagem, Integer>{

    List<Mensagem> findAll();
    
    Mensagem save(Mensagem mensagem);

    Optional<Mensagem> findById(Integer id);
}
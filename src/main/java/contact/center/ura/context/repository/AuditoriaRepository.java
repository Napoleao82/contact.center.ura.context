package contact.center.ura.context.repository;

import contact.center.ura.context.entity.Auditoria;
import contact.center.ura.context.model.AuditoriaDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
@Transactional
public interface AuditoriaRepository  extends JpaRepository<Auditoria, Integer> {

    Auditoria save(Auditoria auditoria);
    List<Auditoria> findAll();
}

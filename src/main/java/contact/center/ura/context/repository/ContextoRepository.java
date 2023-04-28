package contact.center.ura.context.repository;

import contact.center.ura.context.entity.Contexto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ContextoRepository  extends JpaRepository<Contexto, Long> {
}

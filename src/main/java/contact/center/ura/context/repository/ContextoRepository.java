package contact.center.ura.context.repository;

import contact.center.ura.context.entity.Contexto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface ContextoRepository extends JpaRepository<Contexto, Long> {

    Contexto findByNome(String nome);

    Contexto save(Contexto contexto);

    List<Contexto> findAll();

}

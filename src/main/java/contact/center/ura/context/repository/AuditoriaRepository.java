package contact.center.ura.context.repository;

import contact.center.ura.context.entity.Auditoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Repository
@Transactional
public interface AuditoriaRepository  extends JpaRepository<Auditoria, Integer> {
    Auditoria save(Auditoria auditoria);

    default Auditoria criarAuditoria(Integer id, String usuario, String alteracao, String data){
        Auditoria auditoria = new Auditoria();
        auditoria.setId(id);
        auditoria.setUsuario(usuario);
        auditoria.setAlteracao(alteracao);
        auditoria.setData(data);

        return save(auditoria);
    }
}

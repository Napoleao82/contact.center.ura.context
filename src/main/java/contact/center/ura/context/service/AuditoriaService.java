package contact.center.ura.context.service;

import contact.center.ura.context.entity.Auditoria;
import contact.center.ura.context.model.AuditoriaDTO;
import contact.center.ura.context.repository.AuditoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class AuditoriaService {
    @Autowired
    private AuditoriaRepository auditoriaRepository;
    public List<Auditoria> findAll() {
        List<Auditoria> auditorias = auditoriaRepository.findAll();
        if(auditorias.isEmpty()){
            System.out.println("Não existem dados na tabela");
        }
        return auditorias;
    }
    public Auditoria salvarAuditoria(AuditoriaDTO auditoriaDTO) {
        Auditoria auditoria = new Auditoria();
        auditoria.setUsuario(auditoriaDTO.getUsuario());
        auditoria.setAlteracao(auditoriaDTO.getAlteracao());
        auditoria.setDataHoraModificacao(auditoriaDTO.getDataHoraModificacao());

        return auditoriaRepository.save(auditoria);
    }
}
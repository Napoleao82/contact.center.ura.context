package contact.center.ura.context.model;

import contact.center.ura.context.entity.Auditoria;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AuditoriaDTO {
    private Integer id;
    private String usuario;
    private String alteracao;
    private LocalDateTime dataHoraModificacao;

    public AuditoriaDTO(Auditoria auditoria){
        this.id = auditoria.getId();
        this.usuario = auditoria.getUsuario();
        this.alteracao = auditoria.getAlteracao();
        this.dataHoraModificacao = auditoria.getDataHoraModificacao();
    }
}

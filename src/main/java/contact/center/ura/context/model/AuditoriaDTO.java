package contact.center.ura.context.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AuditoriaDTO {
    private Integer id;
    private String usuario;
    private String alteracao;
    private LocalDateTime dataHoraModificacao;
}

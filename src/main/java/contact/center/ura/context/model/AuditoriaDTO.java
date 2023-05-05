package contact.center.ura.context.model;

import lombok.Data;
import java.util.Date;

@Data
public class AuditoriaDTO {
    private Integer id;
    private String usuario;
    private String alteracao;
    private Date dataHoraModificacao;
}

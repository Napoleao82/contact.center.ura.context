package contact.center.ura.context.model;

import lombok.Data;
import java.util.Date;

@Data
public class ContextoDTO {
    private Integer id;
    private String nome;
    private Date dataHoraInicio;
    private Date dataHoraFim;
    private String usuario;
    private String versao;
    private boolean flowAtivo;
    private Date dataHoraModificacao;
}

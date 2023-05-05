package contact.center.ura.context.model;

import lombok.Data;

@Data
public class OpcaoDTO {
    private Integer id;
    private Integer idMensagem;
    private Integer prioridade;
    private String selectedOption;
}

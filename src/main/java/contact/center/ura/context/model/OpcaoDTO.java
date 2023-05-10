package contact.center.ura.context.model;

import contact.center.ura.context.entity.Opcao;
import lombok.Data;

@Data
public class OpcaoDTO {
    private Integer id;
    private Integer idMensagem;
    private Integer prioridade;
    private String selectedOption;

    public OpcaoDTO(){}

    public OpcaoDTO(Opcao opcao){
        this.id = opcao.getId();
        this.idMensagem = opcao.getIdMensagem();
        this.prioridade = opcao.getPrioridade();
        this.selectedOption = opcao.getSelectedOption();
    }
}

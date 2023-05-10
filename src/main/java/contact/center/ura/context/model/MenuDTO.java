package contact.center.ura.context.model;

import contact.center.ura.context.entity.Menu;
import lombok.Data;

@Data
public class MenuDTO {
    private Integer id;
    private String nome;
    private Integer idContexto;

    public MenuDTO(){}
    public MenuDTO(Menu menu) {
        this.id = menu.getId();
        this.nome = menu.getNome();
        this.idContexto = menu.getIdContexto();
    }
}

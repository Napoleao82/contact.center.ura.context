package contact.center.ura.context.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "OPCAO")
@Data
@AllArgsConstructor
public class Opcao implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ID_MENSAGEM")
    private Integer idMensagem;

    @Column(name = "PRIORIDADE")
    private Integer prioridade;

    @Column(name = "SELECTED_OPTION")
    private String selectedOption;

    public Opcao() {

    }
}

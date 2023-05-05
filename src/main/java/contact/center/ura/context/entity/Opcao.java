package contact.center.ura.context.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "opcao")
@Table(name = "OPCAO")
@Data
@AllArgsConstructor
@IdClass(Opcao.class)
public class Opcao implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Id
    @Column(name = "ID_MENSAGEM")
    private Integer idMensagem;

    @Column(name = "PRIORIDADE")
    private Integer prioridade;

    @Column(name = "SELECTED_OPTION")
    private String selectedOption;

    public Opcao() {

    }
}

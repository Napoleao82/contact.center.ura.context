package contact.center.ura.context.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "menu")
@Table(name = "MENU")
@Data
@AllArgsConstructor
@IdClass(Menu.class)
public class Menu implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NOME")
    private String nome;

    @Id
    @Column(name = "ID_CONTEXTO")
    private Integer idContexto;

    public Menu() {

    }
}

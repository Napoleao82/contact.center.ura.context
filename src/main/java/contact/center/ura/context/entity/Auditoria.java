package contact.center.ura.context.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity(name = "auditoria")
@Table(name = "AUDITORIA")
@Data
@AllArgsConstructor
public class Auditoria implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "USUARIO")
    private String usuario;

    @Column(name = "ALTERACAO")
    private String alteracao;

    @Column(name = "DATA")
    private LocalDateTime dataHoraModificacao;

    public Auditoria() {

    }
}

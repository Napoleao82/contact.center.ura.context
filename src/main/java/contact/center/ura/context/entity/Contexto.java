package contact.center.ura.context.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "contexto")
@Data
@AllArgsConstructor
public class Contexto implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "data_hora_inicio")
    private LocalDateTime dataHoraInicio;

    @Column(name = "data_hora_fim")
    private LocalDateTime dataHoraFim;

    @Column(name = "usuario")
    private String usuario;

    @Column(name = "versao")
    private Integer versao;

    @Column(name = "flow_ativo")
    private boolean flowAtivo;

    @Column(name = "data_hora_modificacao")
    private LocalDateTime dataHoraModificacao;

    public Contexto() {

    }
}

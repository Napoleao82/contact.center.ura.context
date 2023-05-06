package contact.center.ura.context.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;


@Entity(name = "contexto")
@Table(name = "CONTEXTO")
@Data
@AllArgsConstructor
@IdClass(Contexto.class)
public class Contexto implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "DATA_HORA_INICIO")
    private LocalDateTime dataHoraInicio;

    @Column(name = "DATA_HORA_FIM")
    private LocalDateTime dataHoraFim;

    @Column(name = "USUARIO")
    private String usuario;

    @Column(name = "VERSAO")
    private Integer versao;

    @Column(name = "FLOW_ATIVO")
    private boolean flowAtivo;

    @Column(name = "DATA_HORA_MODIFICACAO")
    private LocalDateTime dataHoraModificacao;

    public Contexto() {

    }
}

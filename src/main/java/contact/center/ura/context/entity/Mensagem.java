package contact.center.ura.context.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "MENSAGEM")
@Data
@AllArgsConstructor
public class Mensagem implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ID_CONTEXTO")
    private Integer idContexto;

    @Column(name = "TIPO")
    private Integer tipo;

    @Column(name = "FORMATO")
    private Integer formato;

    @Column(name = "TTS")
    private String tts;

    @Column(name = "ARQUIVO_AUDIO")
    private String arquivoAudio;

    @Column(name = "PROXIMO_PASSO")
    private Integer proximoPasso;

    @Column(name = "PRIORIDADE")
    private Integer prioridade;

    @Column(name = "DATA_HORA_INICIO")
    private LocalDateTime dataHoraInicio;

    @Column(name = "DATA_HORA_FIM")
    private LocalDateTime dataHoraFim;

    public Mensagem() {

    }
}

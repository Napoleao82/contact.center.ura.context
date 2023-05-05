package contact.center.ura.context.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "mensagem")
@Table(name = "MENSAGEM")
@Data
@AllArgsConstructor
@IdClass(Mensagem.class)
public class Mensagem implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Id
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
    private String dataHoraInicio;

    @Column(name = "DATA_HORA_FIM")
    private String dataHoraFim;

    public Mensagem() {

    }
}

package contact.center.ura.context.model;

import contact.center.ura.context.entity.Mensagem;
import lombok.Data;
import java.time.LocalDateTime;

@Data
public class MensagemDTO {
    private Integer id;
    private Integer idContexto;
    private Integer tipo;
    private Integer formato;
    private String tts;
    private String arquivoAudio;
    private Integer proximoPasso;
    private Integer prioridade;
    private LocalDateTime dataHoraInicio;
    private LocalDateTime dataHoraFim;
    public MensagemDTO(){}
    public MensagemDTO(Mensagem mensagem) {
        this.id = mensagem.getId();
        this.idContexto = mensagem.getIdContexto();
        this.tipo = mensagem.getTipo();
        this.formato = mensagem.getFormato();
        this.tts = mensagem.getTts();
        this.arquivoAudio = mensagem.getArquivoAudio();
        this.proximoPasso = mensagem.getProximoPasso();
        this.prioridade = mensagem.getPrioridade();
        this.dataHoraInicio = mensagem.getDataHoraInicio();
        this.dataHoraFim = mensagem.getDataHoraFim();
    }
}

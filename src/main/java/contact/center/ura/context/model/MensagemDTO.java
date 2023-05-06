package contact.center.ura.context.model;

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
    private LocalDateTime dataHoraInicio;
    private LocalDateTime dataHoraFim;
}

package contact.center.ura.context.model;

import lombok.Data;
import java.util.Date;

@Data
public class MensagemDTO {
    private Integer id;
    private Integer idContexto;
    private Integer tipo;
    private Integer formato;
    private String tts;
    private String arquivoAudio;
    private Integer proximoPasso;
    private Date dataHoraInicio;
    private Date dataHoraFim;
}

package contact.center.ura.context.model;

import contact.center.ura.context.entity.Contexto;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ContextoDTO {
    private Long id;
    private String nome;
    private LocalDateTime dataHoraInicio;
    private LocalDateTime dataHoraFim;
    private String usuario;
    private Integer versao;
    private boolean flowAtivo;
    private LocalDateTime dataHoraModificacao;

    public ContextoDTO() {}

    public ContextoDTO(Contexto contexto) {
        this.id = contexto.getId();
        this.nome = contexto.getNome();
        this.dataHoraInicio = contexto.getDataHoraInicio();
        this.dataHoraFim = contexto.getDataHoraFim();
        this.usuario = contexto.getUsuario();
        this.versao = contexto.getVersao();
        this.flowAtivo = contexto.isFlowAtivo();
        this.dataHoraModificacao = contexto.getDataHoraModificacao();
    }
}

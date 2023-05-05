package contact.center.ura.context.repository;

import contact.center.ura.context.entity.Mensagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Repository
@Transactional
public interface MensagemRepository extends JpaRepository<Mensagem, Integer> {
    Mensagem save(Mensagem mensagem);

    default Mensagem criarMensagem(Integer id, Integer idContexto, Integer tipo,
                                   Integer formato, String tts, String arquivoAudio,
                                   Integer proximoPasso, Integer prioridade,
                                   String dataHoraInicio, String dataHoraFim){
        Mensagem mensagem = new Mensagem();
        mensagem.setId(id);
        mensagem.setIdContexto(idContexto);
        mensagem.setTipo(tipo);
        mensagem.setFormato(formato);
        mensagem.setTts(tts);
        mensagem.setArquivoAudio(arquivoAudio);
        mensagem.setProximoPasso(proximoPasso);
        mensagem.setPrioridade(prioridade);
        mensagem.setDataHoraInicio(dataHoraInicio);
        mensagem.setDataHoraFim(dataHoraFim);

        return save(mensagem);
    }
}

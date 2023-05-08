package contact.center.ura.context.service;

import contact.center.ura.context.entity.Mensagem;
import contact.center.ura.context.model.MensagemDTO;
import contact.center.ura.context.repository.MensagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class MensagemService {
    @Autowired
    private MensagemRepository mensagemRepository;

    public List<Mensagem> findAll() {
        List<Mensagem> mensagem = mensagemRepository.findAll();
        if(mensagem.isEmpty()){
            System.out.println("Não existem dados na tabela");
        }
        return mensagem;
    }
    public Mensagem salvarMensagem(MensagemDTO mensagemDTO) {
        Mensagem mensagem = new Mensagem();
        mensagem.setIdContexto(mensagemDTO.getIdContexto());
        mensagem.setTipo(mensagemDTO.getTipo());
        mensagem.setFormato(mensagemDTO.getFormato());
        mensagem.setTts(mensagemDTO.getTts());
        mensagem.setArquivoAudio(mensagemDTO.getArquivoAudio());
        mensagem.setProximoPasso(mensagemDTO.getProximoPasso());
        mensagem.setPrioridade(mensagemDTO.getPrioridade());
        mensagem.setDataHoraInicio(mensagemDTO.getDataHoraInicio());
        mensagem.setDataHoraFim(mensagemDTO.getDataHoraFim());

        return mensagemRepository.save(mensagem);
    }
    public Mensagem alterarMensagem(Integer id, MensagemDTO mensagemDTO){
        Optional<Mensagem> mensagemOpt = mensagemRepository.findById(id);
        Mensagem mensagem = mensagemOpt.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Mensagem não encontrada"));

        mensagem.setIdContexto(mensagemDTO.getIdContexto());
        mensagem.setTipo(mensagemDTO.getTipo());
        mensagem.setFormato(mensagemDTO.getFormato());
        mensagem.setTts(mensagemDTO.getTts());
        mensagem.setArquivoAudio(mensagemDTO.getArquivoAudio());
        mensagem.setProximoPasso(mensagemDTO.getProximoPasso());
        mensagem.setPrioridade(mensagemDTO.getPrioridade());
        mensagem.setDataHoraInicio(mensagemDTO.getDataHoraInicio());
        mensagem.setDataHoraFim(mensagemDTO.getDataHoraFim());

        mensagem = mensagemRepository.save(mensagem);

        return mensagemRepository.save(mensagem);
    }

    public void deletarMensagem(Integer id) {
        Optional<Mensagem> mensagemOpt = mensagemRepository.findById(id);
        if (mensagemOpt == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Mensagem não encontrado");
        }
        mensagemRepository.delete(mensagemOpt.get());
    }
}
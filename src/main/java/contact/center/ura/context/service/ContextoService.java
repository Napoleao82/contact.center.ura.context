package contact.center.ura.context.service;

import contact.center.ura.context.entity.Contexto;
import contact.center.ura.context.model.ContextoDTO;
import contact.center.ura.context.repository.ContextoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;
import java.time.LocalDateTime;
import java.util.List;

@Service
@Transactional
public class ContextoService {
    @Autowired
    private ContextoRepository contextoRepository;

    public List<Contexto> findAll() {
        List<Contexto> contextos = contextoRepository.findAll();
        if(contextos.isEmpty()){
            System.out.println("Não existem dados na tabela");
        }
        return contextos;
    }
    public Contexto salvarContexto(ContextoDTO contextoDTO) {
        Contexto contexto = new Contexto();
        contexto.setNome(contextoDTO.getNome());
        contexto.setDataHoraInicio(contextoDTO.getDataHoraInicio());
        contexto.setDataHoraFim(contextoDTO.getDataHoraFim());
        contexto.setUsuario(contextoDTO.getUsuario());
        contexto.setVersao(contextoDTO.getVersao());
        contexto.setFlowAtivo(contextoDTO.isFlowAtivo());
        contexto.setDataHoraModificacao(contextoDTO.getDataHoraModificacao());

        return contextoRepository.save(contexto);
    }

    public Contexto alterarContexto(String nome, ContextoDTO contextoDTO){
        Contexto contexto = contextoRepository.findByNome(nome);
        if(contexto == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Contexto não encontrado");
        }
        contexto.setNome(contextoDTO.getNome());
        contexto.setDataHoraInicio(contextoDTO.getDataHoraInicio());
        contexto.setDataHoraFim(contextoDTO.getDataHoraFim());
        contexto.setUsuario(contextoDTO.getUsuario());
        contexto.setVersao(contextoDTO.getVersao());
        contexto.setFlowAtivo(contextoDTO.isFlowAtivo());
        contexto.setDataHoraModificacao(LocalDateTime.now());

        contexto = contextoRepository.save(contexto);

        return contextoRepository.save(contexto);
    }

    public void deletarContexto(String nome) {
        Contexto contexto = contextoRepository.findByNome(nome);
        if (contexto == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Contexto não encontrado");
        }
        contextoRepository.delete(contexto);
    }
}

package contact.center.ura.context.service;

import contact.center.ura.context.entity.Contexto;
import contact.center.ura.context.model.ContextoDTO;
import contact.center.ura.context.repository.ContextoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContextoService {

    @Autowired
    private ContextoRepository contextoRepository;

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

    public List<Contexto> findAll() {
        List<Contexto> contextos = contextoRepository.findAll();
        if(contextos.isEmpty()){
            System.out.println("Não existem dados na tabela");
        }
        return contextos;
    }

    public void alterar(Contexto contexto){
        System.out.println("Alterado: " + contexto);
    }

    public void excluir(Long id){
        System.out.println("Excluído: " + id);
    }
}

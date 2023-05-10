package contact.center.ura.context.service;

import contact.center.ura.context.entity.Opcao;
import contact.center.ura.context.model.OpcaoDTO;
import contact.center.ura.context.repository.OpcaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class OpcaoService {
    @Autowired
    private OpcaoRepository opcaoRepository;

    public List<Opcao> findAll(){
        List<Opcao> opcoes = opcaoRepository.findAll();
        if(opcoes.isEmpty()){
            System.out.println("Não existem dados na tabela");
        }
        return opcoes;
    }
    public Opcao salvarOpcao(OpcaoDTO opcaoDTO){
        Opcao opcao = new Opcao();
        opcao.setIdMensagem(opcaoDTO.getIdMensagem());
        opcao.setPrioridade(opcaoDTO.getPrioridade());
        opcao.setSelectedOption(opcaoDTO.getSelectedOption());

        return opcaoRepository.save(opcao);
    }
    public Opcao alterarOpcao(Integer id, OpcaoDTO opcaoDTO){
        Optional<Opcao> opcaoOpt = opcaoRepository.findById(id);
        Opcao opcao = opcaoOpt.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Opção não encontrada"));

        opcao.setIdMensagem(opcaoDTO.getIdMensagem());
        opcao.setPrioridade(opcaoDTO.getPrioridade());
        opcao.setSelectedOption(opcaoDTO.getSelectedOption());

        opcao = opcaoRepository.save(opcao);

        return opcaoRepository.save(opcao);
    }
    public void deletarOpcao(Integer id){
        Optional<Opcao> opcaoOpt = opcaoRepository.findById(id);
        if (opcaoOpt == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Opção não encontrada");
        }
        opcaoRepository.delete(opcaoOpt.get());
    }
}
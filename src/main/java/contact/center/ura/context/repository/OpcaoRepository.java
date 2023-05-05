package contact.center.ura.context.repository;

import contact.center.ura.context.entity.Opcao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Repository
@Transactional
public interface OpcaoRepository extends JpaRepository<Opcao, Integer> {
    Opcao save(Opcao opcao);

    default Opcao criarOpcao(Integer id, Integer idMensagem, Integer prioridade, String selectedOption){
        Opcao opcao = new Opcao();
        opcao.setId(id);
        opcao.setIdMensagem(idMensagem);
        opcao.setPrioridade(prioridade);
        opcao.setSelectedOption(selectedOption);

        return save(opcao);
    }
}

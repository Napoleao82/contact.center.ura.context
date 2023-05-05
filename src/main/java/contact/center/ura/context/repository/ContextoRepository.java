package contact.center.ura.context.repository;

import contact.center.ura.context.entity.Contexto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Repository
@Transactional
public interface ContextoRepository  extends JpaRepository<Contexto, Integer> {
    Contexto save(Contexto contexto);

    default Contexto criarContexto(Integer id, String nome, String dataHoraInicio, String dataHoraFim, String usuario, Integer versao, boolean flowAtivo, String dataHoraModificacao){
        Contexto contexto = new Contexto();
        contexto.setId(id);
        contexto.setNome(nome);
        contexto.setDataHoraInicio(dataHoraInicio);
        contexto.setDataHoraFim(dataHoraFim);
        contexto.setUsuario(usuario);
        contexto.setVersao(versao);
        contexto.setFlowAtivo(flowAtivo);
        contexto.setDataHoraModificacao(dataHoraModificacao);

        return save(contexto);
    }
}

package contact.center.ura.context.service;

import contact.center.ura.context.entity.Contexto;
import contact.center.ura.context.repository.ContextoRepository;
import javafx.util.converter.LocalDateStringConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContextoService {
    @Autowired
    private ContextoRepository contextoRepository;

    public List<Contexto> findAll() {
        List<Contexto> listaContexto = new ArrayList<Contexto>();
        Contexto c1 = new Contexto(1, "teste", "2023-05-03", "2023-05-30", "Pedro", 1, true, "2023-05-03");
        listaContexto.add(c1);
        return listaContexto;
    }

    public void inserir(Contexto contexto){
        System.out.println("Inserido: " + contexto);
    }

}

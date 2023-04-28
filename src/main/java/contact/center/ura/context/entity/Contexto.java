package contact.center.ura.context.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "contexto")
@Table(name = "CONTEXTO")
@Data
public class Contexto {

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Long id;

    @Column(name = "NOME")
    private String nome;
}

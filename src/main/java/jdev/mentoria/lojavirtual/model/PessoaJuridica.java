package jdev.mentoria.lojavirtual.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pessoa_juridica")
@PrimaryKeyJoinColumn(name = "id")
public class PessoaJuridica extends Pessoa {

    private static final long serialVersionUID = 1L;

    @Column(nullable = false)
    private String cnpj;

    private String inscEstadual;

    private String inscMunicipal;

    private String nomeFantasia;

    private String razaoSocial;

    private String categoria;

}

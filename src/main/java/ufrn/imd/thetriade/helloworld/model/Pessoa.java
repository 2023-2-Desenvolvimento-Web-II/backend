package ufrn.imd.thetriade.helloworld.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "pessoa")
public class Pessoa extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    private String dataDeNascimento;
    
    @OneToMany(mappedBy = "pessoa")
    @JsonIgnoreProperties({"pessoa"})
    private List<Usuario> perfis = new ArrayList<>();


    public Pessoa() {
        super();
    }

    public Pessoa(Long id, String cpf, String nome, String dataDeNascimento) {
        super(id);
        this.cpf = cpf;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    public Pessoa(Long id, String cpf, String nome, String dataDeNascimento, List<Usuario> perfis) {
        super(id);
        this.cpf = cpf;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.perfis = perfis;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDataDeNascimento() {
        return dataDeNascimento;
    }
    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public List<Usuario> getPerfis() {
        return perfis;
    }
    public void setPerfis(List<Usuario> perfis) {
        this.perfis = perfis;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
}

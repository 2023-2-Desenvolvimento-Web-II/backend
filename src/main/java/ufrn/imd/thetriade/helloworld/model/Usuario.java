package ufrn.imd.thetriade.helloworld.model;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String senha;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "pessoa_id", nullable = false)
    @JsonIgnoreProperties({"perfis"})
    private Pessoa pessoa;

    @JsonIgnoreProperties({"usuarios"})
    @ManyToMany(
        fetch = FetchType.LAZY,
        cascade = { CascadeType.PERSIST, CascadeType.MERGE }
    )
    @JoinTable(
        name = "usuario_tem_papel",
        joinColumns = { @JoinColumn(name = "usuario_id")},
        inverseJoinColumns = { @JoinColumn(name = "papel_id")}
    )
    private Set<Papel> papeis = new HashSet<>();

    public Usuario() {
    }

    public Usuario(Long id, String nome, String senha, Pessoa pessoa, Set<Papel> papeis) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.pessoa = pessoa;
        this.papeis = papeis;
    }    

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public Pessoa getPessoa() {
        return pessoa;
    }
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    public Set<Papel> getPapeis() {
        return papeis;
    }
    public void setPapeis(Set<Papel> papeis) {
        this.papeis = papeis;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Usuario other = (Usuario) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }
}

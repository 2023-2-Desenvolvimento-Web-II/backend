package ufrn.imd.thetriade.helloworld.model;

import java.util.List;

public class Papel {
    private Integer id;
    private String nome;
    private List<String> privilegios;

    public Papel() {
    }

    public Papel(Integer id, String nome, List<String> privilegios) {
        this.id = id;
        this.nome = nome;
        this.privilegios = privilegios;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<String> getPrivilegios() {
        return privilegios;
    }
    public void setPrivilegios(List<String> privilegios) {
        this.privilegios = privilegios;
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
        Papel other = (Papel) obj;
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

package ufrn.imd.thetriade.helloworld.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import ufrn.imd.thetriade.helloworld.model.Pessoa;

@Repository
public class PessoaRepository {
    private ArrayList<Pessoa> pessoas = new ArrayList<>(
        Arrays.asList(        
            new Pessoa(1, "11111111111", "Pessoa 1", "01/11/2000"),
            new Pessoa(2, "22222222222", "Pessoa 2", "02/02/2000"),
            new Pessoa(3, "33333333333", "Pessoa 3", "03/03/2000"),
            new Pessoa(4, "44444444444", "Pessoa 4", "04/04/2000"),
            new Pessoa(5, "55555555555", "Pessoa 5", "05/05/2000")
        )
    );
    

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public List<Pessoa> findAll() {
        return this.pessoas;
    }

    public Pessoa findById(Integer id) {
        return 
        this.pessoas
            .stream()
            .filter(pessoa -> pessoa.getId().equals(id))
            .findAny()
            .orElse(null);
    }

    public Pessoa save(Pessoa pessoa) {
        ArrayList<Pessoa> novaListaPessoas = this.pessoas;
        novaListaPessoas.add(pessoa);
        this.setPessoas(novaListaPessoas);
        return pessoa;
    }

    public void deleteAll() {
        this.setPessoas(new ArrayList<>());
    }

    public void deleteById(Integer id) {
        Pessoa pessoaARemover = this.findById(id);
        if (pessoaARemover != null) {
            this.pessoas.remove(pessoaARemover);
        }
    }

}

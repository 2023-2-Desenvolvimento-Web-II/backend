package ufrn.imd.thetriade.helloworld.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ufrn.imd.thetriade.helloworld.model.Pessoa;
import ufrn.imd.thetriade.helloworld.repository.PessoaRepository;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<Pessoa> obterPessoas() {
        return this.pessoaRepository.findAll();
    }

    public Pessoa buscarPessoaPorId(Long id) {
        return this.pessoaRepository.findById(id).orElse(null);
    }
    
    public Pessoa criarPessoa(Pessoa novaPessoa) {
        return this.pessoaRepository.save(novaPessoa);
    }

    public void removerPessoas() {
        this.pessoaRepository.deleteAll();
    }

    public void removerPessoaPorId(Long id) {
        this.pessoaRepository.deleteById(id);
    }
    
    
}

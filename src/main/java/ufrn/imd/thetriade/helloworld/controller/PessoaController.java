package ufrn.imd.thetriade.helloworld.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ufrn.imd.thetriade.helloworld.model.Pessoa;
import ufrn.imd.thetriade.helloworld.service.PessoaService;

@RestController
@RequestMapping("pessoa")
public class PessoaController {
    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    public List<Pessoa> obterTodasAsPessoas() {
        return this.pessoaService.obterPessoas();
    }

    @GetMapping("{id}")
    public Pessoa buscarPessoaPorId(@PathVariable Integer id) {
        return this.pessoaService.buscarPessoaPorId(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Pessoa criarPessoa(@RequestBody Pessoa novaPessoa) {
        return this.pessoaService.criarPessoa(novaPessoa);
    }

    @DeleteMapping("{id}")
    public void removerPessoaPorId(@PathVariable Integer id) {
        this.pessoaService.removerPessoaPorId(id);
    }

    @DeleteMapping
    public void removerPessoas() {
        this.pessoaService.removerPessoas();
    }
}

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

import ufrn.imd.thetriade.helloworld.model.Papel;
import ufrn.imd.thetriade.helloworld.service.PapelService;

@RestController
@RequestMapping("papel")
public class PapelController {
    @Autowired
    private PapelService papelService;

    @GetMapping
    public List<Papel> obterTodasOsPapeis() {
        return this.papelService.obterPapeis();
    }

    @GetMapping("{id}")
    public Papel buscarPapelPorId(@PathVariable Integer id) {
        return this.papelService.buscarPapelPorId(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Papel criarPapel(@RequestBody Papel novaPapel) {
        return this.papelService.criarPapel(novaPapel);
    }

    @DeleteMapping("{id}")
    public void removerPapelPorId(@PathVariable Integer id) {
        this.papelService.removerPapelPorId(id);
    }

    @DeleteMapping
    public void removerPapeis() {
        this.papelService.removerPapeis();
    }
}

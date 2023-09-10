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

import ufrn.imd.thetriade.helloworld.model.Usuario;
import ufrn.imd.thetriade.helloworld.service.UsuarioService;

@RestController
@RequestMapping("usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> obterTodosOsUsuarios() {
        return this.usuarioService.obterUsuarios();
    }

    @GetMapping("{id}")
    public Usuario buscarUsuarioPorId(@PathVariable Integer id) {
        return this.usuarioService.buscarUsuarioPorId(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario criarUsuario(@RequestBody Usuario novaUsuario) {
        return this.usuarioService.criarUsuario(novaUsuario);
    }

    @DeleteMapping("{id}")
    public void removerUsuarioPorId(@PathVariable Integer id) {
        this.usuarioService.removerUsuarioPorId(id);
    }

    @DeleteMapping
    public void removerUsuarios() {
        this.usuarioService.removerUsuarios();
    }
}

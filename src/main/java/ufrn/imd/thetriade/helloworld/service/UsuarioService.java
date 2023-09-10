package ufrn.imd.thetriade.helloworld.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ufrn.imd.thetriade.helloworld.model.Usuario;
import ufrn.imd.thetriade.helloworld.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> obterUsuarios() {
        return this.usuarioRepository.findAll();
    }

    public Usuario buscarUsuarioPorId(Integer id) {
        return this.usuarioRepository.findById(id);
    }

    public Usuario criarUsuario(Usuario novoUsuario) {
        return this.usuarioRepository.save(novoUsuario);
    }

    public void removerUsuarioPorId(Integer id) {
        this.usuarioRepository.deleteById(id);
    }

    public void removerUsuarios() {
        this.usuarioRepository.deleteAll();
    }

}

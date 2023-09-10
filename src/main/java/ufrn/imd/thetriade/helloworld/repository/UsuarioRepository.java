package ufrn.imd.thetriade.helloworld.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import ufrn.imd.thetriade.helloworld.model.Usuario;

@Repository
public class UsuarioRepository {
    private ArrayList<Usuario> usuarios = new ArrayList<>(
        Arrays.asList(        
            new Usuario(1, "usuario1", "senha1"),
            new Usuario(2, "usuario2", "senha2"),
            new Usuario(3, "usuario3", "senha3")
        )
    );
    

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Usuario> findAll() {
        return this.usuarios;
    }

    public Usuario findById(Integer id) {
        return 
        this.usuarios
            .stream()
            .filter(usuario -> usuario.getId().equals(id))
            .findAny()
            .orElse(null);
    }

    public Usuario save(Usuario usuario) {
        ArrayList<Usuario> novaListaUsuarios = this.usuarios;
        novaListaUsuarios.add(usuario);
        this.setUsuarios(novaListaUsuarios);
        return usuario;
    }

    public void deleteAll() {
        this.setUsuarios(new ArrayList<>());
    }

    public void deleteById(Integer id) {
        Usuario usuarioARemover = this.findById(id);
        if (usuarioARemover != null) {
            this.usuarios.remove(usuarioARemover);
        }
    }
}

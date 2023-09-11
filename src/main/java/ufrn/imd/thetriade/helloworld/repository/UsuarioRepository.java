package ufrn.imd.thetriade.helloworld.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ufrn.imd.thetriade.helloworld.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}

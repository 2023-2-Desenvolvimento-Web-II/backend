package ufrn.imd.thetriade.helloworld.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ufrn.imd.thetriade.helloworld.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}

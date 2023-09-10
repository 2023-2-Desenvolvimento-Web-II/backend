package ufrn.imd.thetriade.helloworld.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import ufrn.imd.thetriade.helloworld.model.Papel;

@Repository
public class PapelRepository {
        private ArrayList<Papel> papeis = new ArrayList<>(
        Arrays.asList(        
            new Papel(1, "Admin", List.of("LER", "ESCREVER", "IMPRIMIR")),
            new Papel(2, "Usuario", List.of("LER")),
            new Papel(3, "Supervisor", List.of("LER", "IMPRIMIR"))
        )
    );
    

    public List<Papel> getPapeis() {
        return papeis;
    }

    public void setPapeis(ArrayList<Papel> papeis) {
        this.papeis = papeis;
    }

    public List<Papel> findAll() {
        return this.papeis;
    }

    public Papel findById(Integer id) {
        return 
        this.papeis
            .stream()
            .filter(papel -> papel.getId().equals(id))
            .findAny()
            .orElse(null);
    }

    public Papel save(Papel papel) {
        ArrayList<Papel> novaListaPapeis = this.papeis;
        novaListaPapeis.add(papel);
        this.setPapeis(novaListaPapeis);
        return papel;
    }

    public void deleteAll() {
        this.setPapeis(new ArrayList<>());
    }

    public void deleteById(Integer id) {
        Papel papelARemover = this.findById(id);
        if (papelARemover != null) {
            this.papeis.remove(papelARemover);
        }
    }
}

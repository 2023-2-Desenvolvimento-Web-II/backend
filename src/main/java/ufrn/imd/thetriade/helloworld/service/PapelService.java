package ufrn.imd.thetriade.helloworld.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ufrn.imd.thetriade.helloworld.model.Papel;
import ufrn.imd.thetriade.helloworld.repository.PapelRepository;

@Service
public class PapelService {
    @Autowired
    private PapelRepository papelRepository;

    public List<Papel> obterPapeis() {
        return this.papelRepository.findAll();
    }

    public Papel buscarPapelPorId(Integer id) {
        return this.papelRepository.findById(id);
    }
    
    public Papel criarPapel(Papel novaPapel) {
        return this.papelRepository.save(novaPapel);
    }

    public void removerPapeis() {
        this.papelRepository.deleteAll();
    }

    public void removerPapelPorId(Integer id) {
        this.papelRepository.deleteById(id);
    }
    
}

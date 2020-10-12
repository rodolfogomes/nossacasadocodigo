package br.com.rodolfogomes.nossacasadocodigo.detalhelivro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import javax.validation.Valid;

@RestController
public class AutorController {

    @Autowired
    private AutorRepository autorRepository;



    @PostMapping(value = "/api/autor")
    @Transactional
    public void create(@Valid @RequestBody NovoAutorDTO novoAutorDTO){
        Autor novoAutor = novoAutorDTO.novoAutor();
        autorRepository.save(novoAutor);
    }

}

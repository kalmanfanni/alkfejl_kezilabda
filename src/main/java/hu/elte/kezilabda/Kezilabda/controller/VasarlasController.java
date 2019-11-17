package hu.elte.kezilabda.Kezilabda.controller;


import hu.elte.kezilabda.Kezilabda.model.Vasarlas;
import hu.elte.kezilabda.Kezilabda.repository.VasarlasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vasarlas")
public class VasarlasController
{
    @Autowired
    private VasarlasRepository vasarlasRepository;

    @GetMapping("")
    public Iterable<Vasarlas> getVasarlas() {
        return vasarlasRepository.findAll();
    }
}

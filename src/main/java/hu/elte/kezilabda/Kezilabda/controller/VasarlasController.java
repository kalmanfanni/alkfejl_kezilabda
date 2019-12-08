package hu.elte.kezilabda.Kezilabda.controller;


import hu.elte.kezilabda.Kezilabda.model.Vasarlas;
import hu.elte.kezilabda.Kezilabda.repository.VasarlasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("")
    public ResponseEntity<Vasarlas> letrehozVasarlas(@RequestBody Vasarlas vasarlas)
    {
        Vasarlas savedVasarlas = vasarlasRepository.save(vasarlas);
        return ResponseEntity.ok(savedVasarlas);
    }
}

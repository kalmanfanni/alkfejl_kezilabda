package hu.elte.kezilabda.Kezilabda.controller;


import hu.elte.kezilabda.Kezilabda.model.Vasarlo;
import hu.elte.kezilabda.Kezilabda.repository.VasarloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vasarlo")
public class VasarloControll
{

    @Autowired
    private VasarloRepository vasarloRepository;

    @GetMapping("")
    public Iterable<Vasarlo> getVasarlo() {
        return vasarloRepository.findAll();
    }

    @PostMapping("")
    public ResponseEntity<Vasarlo> letrehozJatekos(@RequestBody Vasarlo vasarlo)
    {
        Vasarlo savedVasarlo = vasarloRepository.save(vasarlo);
        return ResponseEntity.ok(savedVasarlo);
    }
}
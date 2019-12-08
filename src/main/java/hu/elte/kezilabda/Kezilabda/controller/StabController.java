package hu.elte.kezilabda.Kezilabda.controller;


import hu.elte.kezilabda.Kezilabda.model.Stab;
import hu.elte.kezilabda.Kezilabda.repository.StabRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stab")
@CrossOrigin(origins = "*")
public class StabController {
    @Autowired
    private StabRepository stabRepository;

    @GetMapping("")
    public Iterable<Stab> getStab() {
        return stabRepository.findAll();
    }

    @PostMapping("")
    public ResponseEntity<Stab> letrehozStab(@RequestBody Stab stab)
    {
        Stab savedStab = stabRepository.save(stab);
        return ResponseEntity.ok(savedStab);
    }
}

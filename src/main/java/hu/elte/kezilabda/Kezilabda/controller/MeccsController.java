package hu.elte.kezilabda.Kezilabda.controller;
import hu.elte.kezilabda.Kezilabda.model.Meccs;
import hu.elte.kezilabda.Kezilabda.repository.MeccsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/meccs")

public class MeccsController
{

    @Autowired
    private MeccsRepository meccsRepository;

    @GetMapping("")
    public Iterable<Meccs> getMeccs() {
        return meccsRepository.findAll();
    }

    @PostMapping("")
    public ResponseEntity<Meccs> letrehozMeccs(@RequestBody Meccs meccs)
    {
        Meccs savedMeccs = meccsRepository.save(meccs);
        return ResponseEntity.ok(savedMeccs);
    }
}
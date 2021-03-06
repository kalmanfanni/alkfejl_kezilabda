package hu.elte.kezilabda.Kezilabda.controller;

import hu.elte.kezilabda.Kezilabda.model.Csapat;
import hu.elte.kezilabda.Kezilabda.model.Jatekos;
import hu.elte.kezilabda.Kezilabda.repository.CsapatRepository;
import hu.elte.kezilabda.Kezilabda.repository.JatekosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/jatekos")

public class JatekosController {
    @Autowired
    private JatekosRepository jatekosRepository;

    @GetMapping("")
    public Iterable<Jatekos> getJatekos() {
        return jatekosRepository.findAll();
    }

    @PostMapping("")
    public ResponseEntity<Jatekos> letrehozJatekos(@RequestBody Jatekos jatekos)
    {
        Jatekos savedJatekos = jatekosRepository.save(jatekos);
        return ResponseEntity.ok(savedJatekos);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteIssue(
            @PathVariable Integer id
    ) {
        try {
            jatekosRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}


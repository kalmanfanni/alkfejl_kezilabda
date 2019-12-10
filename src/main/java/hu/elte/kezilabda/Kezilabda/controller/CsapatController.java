package hu.elte.kezilabda.Kezilabda.controller;

import hu.elte.kezilabda.Kezilabda.model.Csapat;
import hu.elte.kezilabda.Kezilabda.repository.CsapatRepository;
import javafx.scene.canvas.GraphicsContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/csapat")
@CrossOrigin(origins = "*")
public class CsapatController
{

    @Autowired
    private CsapatRepository csapatRepository;

    @GetMapping("")
    public Iterable<Csapat> getCsapat() {
        return csapatRepository.findAll();
    }


    @PostMapping("")
    public ResponseEntity<Csapat> letrehozCsapat(@RequestBody Csapat csapat)
    {
        Csapat savedCsapat = csapatRepository.save(csapat);
        return ResponseEntity.ok(savedCsapat);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity deleteCsapat(
            @PathVariable Integer id
    ) {
        try {
            csapatRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}

package hu.elte.kezilabda.Kezilabda.controller;


import hu.elte.kezilabda.Kezilabda.model.Vasarlo;
import hu.elte.kezilabda.Kezilabda.repository.VasarloRepository;
import hu.elte.kezilabda.Kezilabda.security.AuthenticatedVasarlo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

//@CrossOrigin
@RestController
@RequestMapping("/vasarlo")
public class VasarloControll
{

    /*@Autowired
    private AuthenticatedVasarlo authenticatedVasarlo;*/

    @Autowired
    private VasarloRepository vasarloRepository;

    /*@Autowired
    private BCryptPasswordEncoder passwordEncoder;*/

    @GetMapping("")
    public Iterable<Vasarlo> getVasarlo() {
        return vasarloRepository.findAll();
    }

    /*@GetMapping("login")
    public ResponseEntity<Vasarlo> login() {
        return ResponseEntity.ok(authenticatedVasarlo.getVasarlo());
    }*/

    @PostMapping("")
    public ResponseEntity<Vasarlo> letrehozJatekos(@RequestBody Vasarlo vasarlo)
    {
        Vasarlo savedVasarlo = vasarloRepository.save(vasarlo);
        return ResponseEntity.ok(savedVasarlo);
    }

    /*@PostMapping("")
    public ResponseEntity<Vasarlo> register(@RequestBody Vasarlo vasarlo) {
        Optional<Vasarlo> oVasarlo = vasarloRepository.findByUsername(vasarlo.getUsername());
        if (oVasarlo.isPresent()) {
            return ResponseEntity.badRequest().build();
        }
        vasarlo.setPassword(passwordEncoder.encode(vasarlo.getPassword()));
        vasarlo.setRole(Vasarlo.Role.ROLE_USER);
        return ResponseEntity.ok(vasarloRepository.save(vasarlo));
    }*/
}
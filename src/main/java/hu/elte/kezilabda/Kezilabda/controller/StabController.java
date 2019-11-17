package hu.elte.kezilabda.Kezilabda.controller;


import hu.elte.kezilabda.Kezilabda.model.Stab;
import hu.elte.kezilabda.Kezilabda.repository.StabRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stab")
public class StabController {
    @Autowired
    private StabRepository stabRepository;

    @GetMapping("")
    public Iterable<Stab> getStab() {
        return stabRepository.findAll();
    }
}

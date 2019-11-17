package hu.elte.kezilabda.Kezilabda.controller;

import hu.elte.kezilabda.Kezilabda.model.Csapat;
import hu.elte.kezilabda.Kezilabda.model.Jatekos;
import hu.elte.kezilabda.Kezilabda.repository.CsapatRepository;
import hu.elte.kezilabda.Kezilabda.repository.JatekosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jatekos")
public class JatekosController {
    @Autowired
    private JatekosRepository jatekosRepository;

    @GetMapping("")
    public Iterable<Jatekos> getJatekos() {
        return jatekosRepository.findAll();
    }
}

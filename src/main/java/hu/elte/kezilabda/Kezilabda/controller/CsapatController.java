package hu.elte.kezilabda.Kezilabda.controller;

import hu.elte.kezilabda.Kezilabda.model.Csapat;
import hu.elte.kezilabda.Kezilabda.repository.CsapatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/csapat")
public class CsapatController
{

    @Autowired
    private CsapatRepository csapatRepository;

    @GetMapping("")
    public Iterable<Csapat> getCsapat() {
        return csapatRepository.findAll();
    }
}

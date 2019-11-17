package hu.elte.kezilabda.Kezilabda.controller;


import hu.elte.kezilabda.Kezilabda.model.Vasarlo;
import hu.elte.kezilabda.Kezilabda.repository.VasarloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
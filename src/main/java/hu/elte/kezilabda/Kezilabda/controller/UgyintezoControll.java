package hu.elte.kezilabda.Kezilabda.controller;


import hu.elte.kezilabda.Kezilabda.model.Ugyintezo;
import hu.elte.kezilabda.Kezilabda.repository.UgyintezoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ugyintezo")
public class UgyintezoControll
{

    @Autowired
    private UgyintezoRepository ugyintezoRepository;

    @GetMapping("")
    public Iterable<Ugyintezo> getUgyintezo() {
        return ugyintezoRepository.findAll();
    }
}

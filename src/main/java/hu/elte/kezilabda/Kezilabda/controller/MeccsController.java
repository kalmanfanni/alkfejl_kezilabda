package hu.elte.kezilabda.Kezilabda.controller;
import hu.elte.kezilabda.Kezilabda.model.Meccs;
import hu.elte.kezilabda.Kezilabda.repository.MeccsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
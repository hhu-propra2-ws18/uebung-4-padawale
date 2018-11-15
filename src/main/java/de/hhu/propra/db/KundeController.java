package de.hhu.propra.db;

import de.hhu.propra.db.data.KundeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KundeController{
    @Autowired
    KundeRepository kunden;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("kunden" , kunden);
        return "index";
    }
}

package de.hhu.propra.db;
import de.hhu.propra.db.data.KundeRepository;
import de.hhu.propra.db.entities.Kunde;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class KundeController {
	@Autowired
	KundeRepository kunden;
	
	@GetMapping("/")
	public String index(Model model) {
		List<Kunde> alle = kunden.findAll();
		model.addAttribute("kunden", alle);
		return "index";
	}
	
	@RequestMapping("/")
	public String leoSucktBalls(Model model, String farbe) {
		model.addAttribute("farbe", farbe);
		List<Kunde> farbigeKunden = kunden.findKundeByAutosFarbe(farbe);    //Ist das rassistisch?
		model.addAttribute("farbigeKunden", farbigeKunden);
		return index(model);
	}
}

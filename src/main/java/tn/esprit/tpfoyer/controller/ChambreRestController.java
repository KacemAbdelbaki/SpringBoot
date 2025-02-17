package tn.esprit.tpfoyer.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Chambre;
import tn.esprit.tpfoyer.service.ChambreServiceImp;
import tn.esprit.tpfoyer.service.IChambreService;

import java.util.List;

@Tag(name="Gestion Chambre")
@RestController
@RequiredArgsConstructor
@RequestMapping("/chambre")
public class ChambreRestController {
    IChambreService chambreService;
    @Autowired
    public ChambreRestController(IChambreService chambreService){
        this.chambreService = chambreService;
    }

    @Operation(description = "Recuperer toutes les chambres")
    @GetMapping("/retrieve-all-chambres")
    public List<Chambre> getChambres() {
        List<Chambre> listChambres = chambreService.retrieveAllChambres();
        return listChambres;
    }

    @GetMapping("/retrieve-chambre/{chambre-id}")
    public Chambre retrieveChambre(@PathVariable("chambre-id") long chId) {
        return chambreService.retrieveChambre(chId);
    }

    @PostMapping("/add-chambre")
    public Chambre addChambre(@RequestBody Chambre c){
        return chambreService.addChambre(c);
    }

    @DeleteMapping("/remove-chambre/{chambre-id}")
    public void removeChambre(@PathVariable("chambre-id") long chId) {
        chambreService.removeChambre(chId);
    }

    @PutMapping("/modify-chambre")
    public Chambre modifyChambre(@RequestBody Chambre c) {
        Chambre chambre = chambreService.modifyChambre(c);
        return chambre;
    }
}

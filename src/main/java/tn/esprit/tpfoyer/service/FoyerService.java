package tn.esprit.tpfoyer.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Foyer;

import java.util.List;

@Service
@AllArgsConstructor
public class FoyerService implements IFoyerService{
    @Override
    public List<Foyer> retrieveAllFoyer() {
        return null;
    }

    @Override
    public Foyer retrieveFoyer(Long foyerId) {
        return null;
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return null;
    }

    @Override
    public void removeFoyer(Long foyerId) {

    }

    @Override
    public Foyer modifyFoyer(Foyer foyer) {
        return null;
    }
}

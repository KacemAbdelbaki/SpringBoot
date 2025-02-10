package tn.esprit.tpfoyer.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Universite;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteService implements IUniversiteService{
    @Override
    public List<Universite> retrieveAllUniversite() {
        return null;
    }

    @Override
    public Universite retrieveUniversite(Long universiteId) {
        return null;
    }

    @Override
    public Universite addUniversite(Universite u) {
        return null;
    }

    @Override
    public void removeUniversite(Long universiteId) {

    }

    @Override
    public Universite modifyUniversite(Universite universite) {
        return null;
    }
}

package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Etudiant;

import java.util.List;
import java.util.Optional;

public interface IEtudiantService {
    public List<Etudiant> retrieveAllEtudiant();
    public Optional<Etudiant> retrieveEtudiant(Long etudiantId);
    public Etudiant addEtudiant(Etudiant e);
    public void removeEtudiant(Long chambreId);
    public Etudiant modifyEtudiant(Etudiant etudiant);
}

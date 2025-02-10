package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Chambre;

import java.util.List;

public interface IChambreService {
    public List<Chambre> retrieveAllChambres();
    public Chambre retrieveChambre(long chambreId);
    public Chambre addChambre(Chambre c);
    public void removeChambre(long chambreId);
    public Chambre modifyChambre(Chambre chambre);
}

package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Bloc;

import java.util.List;

public interface IBlocService {
    public List<Bloc> retrieveAllBloc();
    public Bloc retrieveBloc(Long BlocId);
    public Bloc addBloc(Bloc b);
    public void removeBloc(Long blocId);
    public Bloc modifyBloc(Bloc bloc);
}

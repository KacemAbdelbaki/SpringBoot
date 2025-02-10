package tn.esprit.tpfoyer.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Reservation;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationService implements IReservationService{
    @Override
    public List<Reservation> retrieveAllReservation() {
        return null;
    }

    @Override
    public Reservation retrieveReservation(Long reservationId) {
        return null;
    }

    @Override
    public Reservation addReservation(Reservation r) {
        return null;
    }

    @Override
    public void removeReservation(Long reservationId) {

    }

    @Override
    public Reservation modifyReservation(Reservation reservation) {
        return null;
    }
}

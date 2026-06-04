package com.example.demo.controller;

import com.example.demo.model.Reservation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ReservationController {

    @GetMapping("/")
    public String afficherFormulaire(Model model) {
        model.addAttribute("reservation", new Reservation());
        return "index";
    }

    @PostMapping("/reserver")
    public String traiterReservation(
            @ModelAttribute Reservation reservation,
            Model model) {

        int duree = reservation.getHeureFin() - reservation.getHeureDebut();
        model.addAttribute("reservation", reservation);
        model.addAttribute("duree", duree);

        if (duree > 0 && duree <= 3) {
            return "success";
        } else {
            return "refus";
        }
    }
}
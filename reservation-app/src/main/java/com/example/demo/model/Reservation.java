package com.example.demo.model;

public class Reservation {

    private String nomDemandeur;
    private String typeReservation;
    private String demiJournee;
    private int heureDebut;
    private int heureFin;

    public String getNomDemandeur() { return nomDemandeur; }
    public void setNomDemandeur(String nomDemandeur) { this.nomDemandeur = nomDemandeur; }

    public String getTypeReservation() { return typeReservation; }
    public void setTypeReservation(String typeReservation) { this.typeReservation = typeReservation; }

    public String getDemiJournee() { return demiJournee; }
    public void setDemiJournee(String demiJournee) { this.demiJournee = demiJournee; }

    public int getHeureDebut() { return heureDebut; }
    public void setHeureDebut(int heureDebut) { this.heureDebut = heureDebut; }

    public int getHeureFin() { return heureFin; }
    public void setHeureFin(int heureFin) { this.heureFin = heureFin; }
}
package fr.epsi.helloworld.service;

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class BavardService {

    private String nom = "John Doe";

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String parler() {
        return "Je m'appelle " + nom + " et ma classe est: " + this.getClass().getSimpleName();
    }

    @PostConstruct
    private void postConstruct() {
        System.out.println("===== BavardService a été créé =====");
    }
}

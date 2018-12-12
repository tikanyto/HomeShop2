package com.cathy.miam;

public class Four {
     int puissance;
     int capacite;

    private Resistance resistance;
    private Soufflerie soufflerie;

    public void cuire(Aliment aliment){
        System.out.println("Je cuis un aliment : " + aliment.nom);
        System.out.println("avec ma capactité de " + capacite +" litres");
        System.out.println("et ma puissance de " + puissance + " degrés.");
        aliment.estCuit = true;
        maintenir();
    }
    private void maintenir() {

    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        System.out.println("la puissance est modifiée");
        this.puissance = puissance;
    }

    public Resistance getResistance() {
        return resistance;
    }

    public Soufflerie getSoufflerie() {
        return soufflerie;
    }
    public int getCapacite() {
        return capacite;
    }
    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
}


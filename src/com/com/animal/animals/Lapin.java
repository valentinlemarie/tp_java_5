package com.com.animal.animals;

import com.animal.Aliment;
import com.animal.Animal;
import com.origin.Herbivore;

public class Lapin extends Animal {
    Aliment nouriture;
    public Lapin(int age, float poids, String noms, float taille){
        super(age, poids, noms, taille);
        this.regime=new Herbivore(age, poids, noms, taille);
    }

    public void setNouriture(Aliment nouriture) {
        this.nouriture = nouriture;
    }

    public Aliment getNouriture() {
        return nouriture;
    }

    /*
    public void manger(Aliment aliment){
        if(Herbivore.mange.contains(aliment)){
            System.out.println("le lapin a mange "+aliment.toString());
        }else{
            System.out.println("le lapin ne mange pas de "+aliment.toString());
        }
    }
    public void deplacer(){
        System.out.println("un Lapin ce déplace");
    }
    */
}

package com.com.animal.animals;

import com.animal.Aliment;
import com.animal.Animal;
import com.origin.Carnivore;

public class Hyene extends Animal {

    public Hyene(int age, float poids, String noms, float taille){
        super(age, poids, noms, taille);
        this.regime = new Carnivore(age, poids, noms, taille);
    }



    /*
    public void manger(Aliment aliment){
        if(Carnivore.mange.contains(aliment)){
            System.out.println("la Hyene a mange "+aliment.toString());
        }else{
            System.out.println("la Hyene ne mange pas de "+aliment.toString());
        }
    }
    public void deplacer(){
        System.out.println("une Hyene ce déplace");
    }
    */
}

package com.company;

public class Etudiant extends Personne implements diplome
{
    public Etudiant(String nom,String prenom,int age) {

        super(nom,prenom,age);

    }

    public void displayAge()
    {
        System.out.println("J'ai" + age + "ans");
    }

    @Override
    public void gotoschool(boolean school) {
        if (school==true){
            System.out.println( "je vais à l'école");
        }else {
            System.out.println( "je ne vais pas à l'école");
        }


    }


    @Override
    public boolean isgraduate(boolean graduate) {
        if (graduate==true){
            System.out.println( "FELICITATIONS !");
        }else {
            System.out.println( "REDOUBLEZ D'EFFORT!");
        }
        return false;
    }
}

package com.company;

public  abstract class Personne  {
    String nom;
    String prenom;
    int age;
    public Personne(String nom,String prenom,int age)
    {
        this.nom=nom;
        this.prenom=prenom;
        this.age=age;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public void sayHello()
    {
        System.out.println("Hello!");
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public abstract void gotoschool(boolean school);
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionparking;

public class Moto extends Véhicule {
	private int VitesseMax;
	//Super constructor
 public Moto(String marque,String modele,String immatriculation,int VitesseMax){
	 super(marque,modele,immatriculation);
         this.VitesseMax=VitesseMax;
 }
 //Getters & Setters
 
 public int getVitesseMax() {
	 return VitesseMax;
 }
 public void setVitesseMax(int VitesseMax){
	this.VitesseMax=VitesseMax; 
 }
 
  @Override
    public String toString() {
        String affichage= "La moto "+getMarque()+" module "+getModele()+" d'imatriculation "
                +getImmatriculation()+" a une vitesse max de "+getVitesseMax()+" Km/h";
return affichage;
        }
}

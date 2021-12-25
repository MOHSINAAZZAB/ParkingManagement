package gestionparking;

public class Voiture extends Véhicule {
	private int nombrePortes;
	//Super constructor
	 public Voiture(String marque,String modele,String immatriculation,int nombrePortes){
		 super(marque,modele,immatriculation);
		 this.nombrePortes=nombrePortes;
	 }
	 //Getters & setters
	 public int getnombrePortes() {
		 return nombrePortes;
	 }
	 public void setnombrePortes(int nombrePortes ) {
		 this.nombrePortes=nombrePortes;
	 }

    @Override
    public String toString() {
        String affichage= "La voiture "+getMarque()+" module "+getModele()+" d'imatriculation "
                +getImmatriculation()+" contient "+getnombrePortes()+" portes";
return affichage;
        } 
	 
	
}

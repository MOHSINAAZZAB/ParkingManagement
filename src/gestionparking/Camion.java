
package gestionparking;

public class Camion extends Véhicule {
	private boolean remorque;
	//Super constructor
	 public Camion(String marque,String modele,String immatriculation,boolean remorque){
		 super(marque,modele,immatriculation);
		 this.remorque=remorque;
	 }
	 //Getters & Setters
	 public boolean getRemourque() {
		 return remorque;
	 }
	 public void setRemourque(boolean remourque) {
		 this.remorque=remourque;
	 }
	  @Override
    public String toString() {
        String affichage;
        if(getRemourque()){
        affichage= "Le camion "+getMarque()+" module "+getModele()+" d'imatriculation "
                +getImmatriculation()+" conteint un remourque"; }
        else{
            affichage= "Le camion "+getMarque()+" "+getModele()+" d'imatriculation"
                +getImmatriculation()+" conteint pas un remourque";
       
        }
        
return affichage;
        }
}

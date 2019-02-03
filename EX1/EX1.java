public class EX1{
  public static void main(String[] args){
	Chrono1 C1 = new Chrono1();
    C1.afficher();
    C1.setHeures(1);
    C1.setMinutes(30);
    C1.afficher();
    while(  C1.rebours()== 0){
      C1.afficher();
    }
    System.out.println("FIN du TD"); 
  
  
	Chrono2 C2 = new Chrono2();
    C2.afficher();
    C2.setHeures(1);
    C2.setMinutes(30);
    C2.afficher();
    while(  C2.rebours()== 0){
      C2.afficher();
    }
    System.out.println("FIN du TD");
    }
}


class Chrono1{
	
	private int heures;
	private int minutes;
	private int secondes;
	

	// constructeur
	public Chrono1(){
		heures =0;
		minutes =0;
		secondes =0;		
	}
	
	public int getHeures(){
		return heures;		
	}

	public int getMinutes(){
		return minutes;
	}
	
	public int getSecondes(){
		return secondes;
	}
	
	public void setHeures(int h){
		heures = h;
	}
	public void setMinutes(int m){
		minutes = m;
	}
	public void setSecondes(int s){
		secondes =s;
	}
	
	public void afficher(){
		System.out.println(heures+":"+minutes+":"+secondes);
		
	}
	
	public int rebours(){
		byte retour = -1;
		if(heures+minutes+secondes >0){
			
			secondes -=1;
			if(0 > secondes){
				secondes =59;
				minutes -=1;
			}
			if(0 > minutes){
				minutes =59;
				heures -=1;
			}
			retour =0;
		}
		return retour;
	}
}


class Chrono2{
	
	private int nbSecondes;
	
	// Constructeur
	public Chrono2(){
		nbSecondes =0;		
	}
	
	public int getHeures(){
		return nbSecondes/3600;
	}
	public int getMinutes(){
		return (nbSecondes%3600)/60;
	}
	public int getSecondes(){
		return nbSecondes%60;
	}
	
	public void setHeures(int h){
		nbSecondes += 3600*h - getHeures();
	}
	public void setMinutes(int m){
		nbSecondes += 60*m - getMinutes();
	}
	public void setSecondes(int s){
		nbSecondes += s -getSecondes();
	}
	
	public void afficher(){
		System.out.println(getHeures()+":"+getMinutes()+":"+getSecondes());
	}
	
	public int rebours(){
		byte retour =-1;
		if(nbSecondes > 0){
			nbSecondes --;
			retour =0;
		}
		return retour;		
	}
	
}
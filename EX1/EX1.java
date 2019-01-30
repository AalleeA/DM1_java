public class EX1{
  public static void main(String[] args){
    Chrono1 C1 = new Chrono1();
    C1.afficher();
    C1.setheure(1);
    C1.setminute(30);
    C1.afficher();
    while(  C1.rebours()== 0){
      C1.afficher();
    }
    System.out.println("FIN du TD");





    Chrono2 C2 = new Chrono2();
    C2.afficher();
    C2.setheure(1);
    C2.setminute(30);
    C2.afficher();
    while(  C2.rebours()== 0){
      C2.afficher();
    }
    System.out.println("FIN du TD");
  }
}









class Chrono1{

  private int heure;
  private int minute;
  private int seconde;

//constructeur
  public Chrono1(){
    heure = 0;
    minute = 0;
    seconde = 0;
  }


//get heure
  public int getheure(){
    return heure;
  }

//get minute
  public int getminute(){
    return minute;
  }

  //get seconde
  public int getseconde(){
    return seconde;
  }

  //set
  public void setheure(int h){
    heure = h;
  }

  public void setminute(int m){
    minute = m;
  }

  public void setseconde(int s){
    seconde = s;
  }

  public void afficher(){
    System.out.print(getheure());
    System.out.print(":");
    System.out.print(getminute());
    System.out.print(":");
    System.out.println(getseconde());

  }

  public int rebours(){
    int sec = getseconde();
    int min = getminute();
    int h = getheure();

    if(sec+min+h > 0){
      setseconde(sec - 1);
      if(getseconde()<0){
        setminute(min -1);
        setseconde(59);
      }
      if(getminute()<0){
        setheure(h -1);
        setminute(59);
      }
      return 0;
    }
    else{return -1;}
  }
}





class Chrono2{
  private int nbseconde;

  public Chrono2(){
    nbseconde = 0;
  }

  public int getheure(){
    return (nbseconde / 3600);
  }

//get minute
  public int getminute(){
    int h = getheure();
    return ( (nbseconde - h*3600)/60 );
  }

  //get seconde
  public int getseconde(){
    int h = getheure();
    int min = getminute();
    return (nbseconde - h*3600 - min*60);
  }

  public void setheure(int h){
    nbseconde = nbseconde - 3600*getheure() + h*3600;
  }

  public void setminute(int m){
    nbseconde = nbseconde - 60*getminute() + m*60;
  }

  public void setseconde(int s){
    nbseconde = nbseconde - getseconde() + s;
  }
  public void afficher(){
    System.out.print(getheure());
    System.out.print(":");
    System.out.print(getminute());
    System.out.print(":");
    System.out.println(getseconde());

  }

  public int rebours(){
    if(nbseconde > 0){
      nbseconde -= 1;
      return 0;
    }
    else{return -1;}
  }







}

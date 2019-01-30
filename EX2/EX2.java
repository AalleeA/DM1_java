public class EX2{
  public static void main(String[] args){
    Fraction f1 = new Fraction(123,456);
    Fraction f2 = new Fraction(789,10);
    f1.addFraction(f2);
    f1.add(11);
    f1.mult(12);
    f1.afficher();
  }
}





class Fraction{
  private int denominateur;
  private int numerateur;

  public Fraction(int d,int n){
    denominateur = d;
    numerateur = n;
    reduc();
  }


  private int pgcd(int x,int y){
    if(x == 0){return y;}
    else if(y == 0){return y;}
    else if(y<=x){return pgcd(x-y,y);}
    else{return(pgcd(x,y-x));}
  }



  public int getden(){
    return denominateur;
  }
  public int getnum(){
    return numerateur;
  }
  public void setden(int d){
    denominateur = d;
  }
  public void setnum(int n){
    numerateur = n;
  }
  public void afficher(){
    System.out.print(denominateur);
    System.out.print("/");
    System.out.println(numerateur);
  }

  private void reduc(){
    int pg = pgcd(denominateur,numerateur);
    denominateur /= pg;
    numerateur /= pg;
  }


  public void add(int x){
    x = x*numerateur;
    denominateur += x;
    reduc();
  }
  public void sub(int x){
    x = x*numerateur;
    denominateur -= x;
    reduc();
  }
  public void mult(int x){
    denominateur *= x;
    reduc();
  }
  public void addFraction(Fraction f2){
    denominateur = denominateur*f2.numerateur + f2.denominateur*numerateur;
    numerateur *= f2.numerateur;
    reduc();
  }
  public void multFraction(Fraction f2){
    denominateur *= f2.denominateur;
    numerateur *= f2.numerateur;
    reduc();
  }

}

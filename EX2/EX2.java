public class EX2{
	public static void main(String[] args){
		Fraction f1 = new Fraction(123,456);
		Fraction f2 = new Fraction(789,10);
		f1.addFraction(f2);
		f1.add(11);
		f1.mult(12);
		System.out.println("Resultat =");
		f1.afficher();




	}
}

class Fraction{
	private int numerateur;
	private int denominateur;

	// Constructeur
	public Fraction(int n, int d){
		numerateur =n;
		denominateur =d;
		reduc();
	}

	private int pgcd(int x,int y){
		if(x == 0)		{return y;}
		else if(y == 0)	{return y;}
		else if(y<=x)	{return pgcd(x-y,y);}
		else			{return(pgcd(x,y-x));}
	}
	private void reduc(){
		int pg = pgcd(numerateur,denominateur);
		numerateur /= pg;
		denominateur /= pg;
	}

	public void afficher(){
		System.out.println(numerateur+"/"+denominateur);
	}

	public int getDen(){
		return denominateur;
	}
	public int getNum(){
		return numerateur;
	}

	public void setDen(int d){
		denominateur = d;
	}
	public void setNum(int n){
		numerateur = n;
	}

	public void add(int n){
		numerateur += n*denominateur;
		reduc();
	}
	public void sub(int n){
		numerateur -= n*denominateur;
		reduc();
	}
	public void mult(int n){
		numerateur *=n;
		reduc();
	}
	public void addFraction(Fraction f2){
		numerateur = numerateur * f2.denominateur + f2.numerateur * denominateur;
		denominateur *= f2.denominateur;
		reduc();
	}
	public void multFraction(Fraction f2){
			numerateur *= f2.numerateur;
			denominateur *= f2.denominateur;
			reduc();
	}





}

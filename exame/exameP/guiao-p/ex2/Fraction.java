public class Fraction {
	private int num,den;
	public Fraction(int num,int den){
		this.num = num;
		this.den = den;
	}
	public Fraction(int num){
		this.num = num;
		this.den = 1;
	}

	public Fraction symetric(){
		return new Fraction(-this.num,this.den);
	}

	public Fraction add(Fraction other){
		return new Fraction(num*other.den + den*other.num,den*other.den);
	}
	public Fraction sub(Fraction other){
		return new Fraction(num*other.den - den*other.num,den*other.den);
	}

	public Fraction mult(Fraction other){
		return new Fraction(num*other.num,den*other.den);
	}

	public Fraction div(Fraction other){
		return new Fraction(num*other.den,den*other.num);
	}

	@Override public String toString(){
		return ""+num+(den == 1 ? "" : "/"+den);
	}



	
}

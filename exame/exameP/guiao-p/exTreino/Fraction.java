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

	public Fraction Symetric(){
		return new Fraction(-this.num,this.den);
	}

	public Fraction sum(Fraction other){
		return new Fraction((this.num*other.den+this.den*other.num),this.den*other.den);
	}

	public Fraction sub(Fraction other){
		return new Fraction((this.num*other.den-this.den*other.num),this.den*other.den);
	}

	public Fraction mult(Fraction other){
		return new Fraction(this.num*other.num,this.den*other.den);
	}

	public Fraction div(Fraction other){
		return new Fraction(this.num*other.den,this.den*other.num);

	}
	public Fraction reduce(){
		int n = mdc(this.num, this.den);
		return new Fraction(this.num/n,this.den/n);
	}

	public int mdc(int num,int den){
		if(den == 0) return num;
		return mdc(den,num%den);
	}

	@Override public String toString() {
		if (this.den != 1) {
		    if (this.num < 0 && this.den < 0)
			if (-this.den != 1)
			    return "" + -this.num + "/" + -this.den;
			else
			    return "" + this.num;
		    else
			return "" + this.num + "/" + this.den;
		}
	
		return "" + this.num;
	    }
	
}

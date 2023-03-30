package Calculator_aprimorater;

public class Caculates {
	
	
	public double sum(int tam, double [] numb) {
		tam = numb.length;
		double sum =0;
		for(int i =0; i<numb.length; i++) {
			sum+=numb[i];
		}
			
		return sum;
	}

	public double sub(int tam, double [] numb) {
		tam = numb.length;
		double sub =0;
			sub = numb[0] -numb[1];
		return sub;
	}
	
	public double multi(double tam, double [] numb) {
		tam = numb.length;
		double mult =1;
		for(int i =0; i<numb.length; i++) {
			mult*=numb[i];
		}
			
		return mult;
	}
	public double div (double n1, double n2) {
		double result =(double) (n1/n2);
		return result;
	}
	
	public double rad(double n1, double ind) {
		double result1 = Math.pow(n1, ind);
		return result1;
	}
	public double pont(double n1,	double exp ) {
		double result = (double) Math.pow(n1, exp);
		return result;
	}
	
	public double log(double n1, double base) {
		double result = Math.log(n1) / Math.log(base);
		return result;
	}
}

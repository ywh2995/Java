package quiz10;

public class Computer extends Calculator {
	double circle(int a) {
		return 	a*a*Math.PI;

	}
	double rect(double a){
	return (a*a);
	}
	double rect(double a,double b) {
		return(a*b);
	}
	double rect(double a,double b,double c) {
		return((a*b)*2)+(b*c)*2+(c*a)*2;
	}
	
}

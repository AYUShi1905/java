public class P02_EquationSolve{
	public static void main(String[] args){
		//3.4 x + 50.2 y = 44.5  &  2.1 x + 0.55 y = 5.9
		double a = 3.4;
		double b = 50.2;
		double c = 2.1;
		double d = 0.55;
		double e = 44.5;
		double f = 5.9;
		
		double det;
		
		det=(a*d-b*c);
		
		System.out.println(det);
		
		if (det==0){
			System.out.println("No unique solution exists.");
		}
		else{
			double x= (e*d-b*f)/det;
			double y= (a*f-e*c)/det;
			System.out.println("Value of X : " + x + " Value of Y : " + y );
		}
	}
}
public class HeronsFormula {
	public static void main(String [] args) {
		double a, g, f;
		String tws = "A triangle with sides ";
		//the version without functions is longer
		a = triangleArea(3, 3, 3);
		System.out.println("A triangle with sides 3, 3, 3 has area " + a);
		
		a = triangleArea(3, 4, 5);
		System.out.println("A triangle with sides 3, 4, 5 has area " + a);
		
		g = triangleArea(7, 8, 9);
		System.out.println(tws + "7, 8, 9 has area " + a);
		
		//added another test for 9,9,9
		f = triangleArea(9, 9, 9);
		System.out.println("A triangle with sides 9, 9, 9 has area " + f);
		
		System.out.println(tws + "5, 12, 13 has area " + triangleArea(5, 12, 13));
		System.out.println(tws + "10, 9, 11 has area " + triangleArea(10, 9, 11));
		System.out.println(tws + "8, 15, 17 has area " + triangleArea(8, 15, 17));	
	}
	//This function computes the area of a triangle w/side lengths a, b, c.
	public static double triangleArea(int a, int b, int c) {
		double s, A;
		
		s = (a+b+c) / 2.0; //fixed throwing away the .5. If fixing the version
			//w/out functions, you would have to change several lines of code
			//instead of simply changing the one line in this version.
		A = Math.sqrt(s*(s-a)*(s-b)*s-c);
		
		//After computing the area, you must "return" the computed value;
		return A;
	}
}
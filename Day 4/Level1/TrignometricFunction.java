
import java.util.Scanner;
public class TrignometricFunction{
	public double[] calculateTrigonometricFunctions(double angle){
		double[] ans = new double[4];
		// converting to radians
		ans[0] = Math.toRadians(angle);
		ans[1] = Math.sin(angle); // finding sin
		ans[2] =Math.cos(angle); // finding cosine
		ans[3] = Math.tan(angle); // finding tangent
		return ans; 
	}
	public static void main(String[] args){
	// getting input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter angle: ");
		double angle = sc.nextDouble();
		
		// creating object
		TrignometricFunction obj = new TrignometricFunction();
		double ans[] = obj.calculateTrigonometricFunctions(angle); // object calling
		
		System.out.println("Radians are "+ ans[0]+", Sin = "+ans[1]+", Cos= "+ ans[2]+", Tan= "+ ans[3]);
		
		sc.close();
	}
}

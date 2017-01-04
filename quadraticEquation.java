/*
A Java program designed to solve the quadratic equation
 */
package quadraticequation;

/**
 * @author patrickbenitez
 */
public class QuadraticEquation {

    public static void main(String[] args) {
        quadratricEquation solve = new quadratricEquation();
        solve.initiate(2, 8, 3);
        solve.calculate();
    }
    
    private static class quadratricEquation {
        //constructor
        private quadratricEquation() {
            a = 0;
            b = 0;
            c = 0;
        }
        //insert values
        private void initiate(double x, double y, double z){
            a = x;
            b = y;
            c = z;
        }
        
        public void calculate() {
            double test = Math.pow(b, 2) - (4*a*c);
            if (test <0) {
                System.out.println("Negative value calculated");
                System.exit(0);
            }
            else {
                answerPos = (-b + Math.sqrt(test)) / (2*a);
                answerNeg = (-b - Math.sqrt(test)) / (2*a);
            
                System.out.println("The two answers are " + answerPos +" and " + answerNeg);
            }
        }
    
    private double a, b, c, answerPos, answerNeg; 
    }
}

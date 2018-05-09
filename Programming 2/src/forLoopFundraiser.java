import javax.swing.JOptionPane;

public class forLoopFundraiser {
	public static void main(String[] args){

		String[] name = { "Leo", "Gwendolyn", "Lola", "Max", "Ruby", "Charlie", "Marv" };

		double[] donation = { 1.10, 1.53, 2.10, 1.75, 6.00, 3.21, 0.95 };
		double sum=0;
		
		JOptionPane.showMessageDialog(null, "Welcome to the fundraiser program!");

		
		
		for(int counter=0;counter<donation.length;counter++){
			sum+=donation[counter];
		}
	
		System.out.println("The sum of all of these donations is " + sum);
		
		System.out.println("The sum of all of these donations is " + sum);
	
	}
}


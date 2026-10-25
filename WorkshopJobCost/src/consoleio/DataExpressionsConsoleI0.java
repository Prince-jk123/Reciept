package consoleio;
import java.util.Scanner;
public class DataExpressionsConsoleI0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input =new Scanner(System.in);
//		
//			System.out.println("CLient's First name");
//			System.out.println("Company name ");
//			System.out.println("Job reference number");
//			System.out.println("Product Category");
//			System.out.println("Number of workers");
//			System.out.println("Number of Hours worked");
//			System.out.println("Quality produced");
//			System.out.println("Labour rate per hour"); 
//			System.out.println("Urgent Job");
//	
//			input.nextInt();

//			 input.nextLine();
			 
						
					System.out.println("WORKSHOP JOB-COST REPORT");
					System.out.println("---------------------------");
					System.out.println(" Enter Client First name:");
					String clientFristName =input.nextLine();

					System.out.println("Enter Company name");
					String companyName =input.nextLine();

					System.out.println("Job reference number");
					Long jobReferenceNumber = input.nextLong();
					
					System.out.println("Product Category");
					char productCategory =input.next().charAt(0);
					
					System.out.println("Number of workers");
					Byte numberOfWorkers =input.nextByte();
					
					System.out.println("Number of Hours worked");
					Short numberOfHoursWorked =input.nextShort();
					
					System.out.println("Quantity produced");
					int quantityProduced =input.nextInt();
					  
					System.out.println("Labour rate per hour");
					Float labourRatePerHour =input.nextFloat();
					
					System.out.println("Material cost per item");
					Double materialCostPerItem =input.nextDouble();
					
					System.out.println("Urgen Jobs (true/False):");
					Boolean urgentJob =input.nextBoolean();
					if (urgentJob) {
						System.out.println("Please relax");
					}else {
						System.out.println("Be paient");
					}
					
					input.nextLine();
					
					System.out.println(clientFristName);
					System.out.println(companyName);
					System.out.println(jobReferenceNumber);
					System.out.println(productCategory);
					System.out.println(numberOfWorkers);
					System.out.println(numberOfHoursWorked);
					System.out.println(quantityProduced);
					System.out.println(labourRatePerHour);
					System.out.println(materialCostPerItem);
					System.out.println(urgentJob);

					double laborCost = numberOfWorkers*numberOfHoursWorked*labourRatePerHour;
					double totalMaterialCost = quantityProduced*materialCostPerItem;
					double totalJobCost = laborCost + totalMaterialCost;
					double averageCostPerItem = totalJobCost/quantityProduced;
					
					System.out.println();
					System.out.println("CALCULATED COSTS");
					System.out.println("------------------");
					System.out.println("Labour Cost: UGX "+laborCost);
					System.out.println("Total Material Cost:UGX "+ totalMaterialCost);
					System.out.println("Total Job Cost: UGX "+ totalJobCost);
					System.out.println("Average Cost Per Item: UGX "+ averageCostPerItem);
			

		input.close();
		
		
		

	}

}

import java.util.Scanner;

public class TelecomCompany{
	public static void main(String[] args){
		
		Scanner scanner=new Scanner(System.in);
		
		for(int i=1;i<=3;i++){
			
			System.out.println("Customer " + i + " details");
			
			System.out.print("Enter customer name: ");
			String name=scanner.nextLine();
			
			System.out.print("Enter number of calls made: ");
			int calls=scanner.nextInt();
			
			System.out.print("Enter number of messages(SMS) sent: ");
			int sms=scanner.nextInt();
			
			System.out.print("Enter data usage(in GB): ");
			int dataUsage=scanner.nextInt();
			scanner.nextLine();
			
			double callCharge=0;
			
			if(calls<=50){
				callCharge=0;
			}
			else if(calls>=51 && calls<=150){
				callCharge=(calls-50)*1;
			}
			else if(calls>150){
				callCharge=(calls-150)*1.5 + 100*1;
			}
			
		double smsCharge=0;
		
		if(sms<=100){
			smsCharge=sms*0.5;
		}
		else if(sms>100){
			smsCharge=(sms-100)*0 + 100*0.5;
		}
		
		double dataCharge=0;
		
		if(dataUsage<=1){
			dataCharge=0;
		}
		else if(dataUsage>1 && dataUsage<=5){
			dataCharge=(dataUsage-1)*50;
		}
		else if(dataUsage>5){
			dataCharge=(dataUsage-5)*30 + 4*50;
		}
		
		double totalBill=callCharge+smsCharge+dataCharge;
		
		double serviceTax=0;
		
		if(totalBill>500){
			System.out.println("Service tax of 18 percent is applied !!!");
            serviceTax=0.18*totalBill;
        }			 
		else{
			System.out.println("No tax is applied !!!");
		}
		
		double finalBill=totalBill+serviceTax;
		
		    System.out.println("\n----- Itemized Bill -----");
            System.out.println("Customer Name: " + name);
            System.out.println("Call Charges: ₹" + callCharge);
            System.out.println("SMS Charges: ₹" + smsCharge);
            System.out.println("Data Charges: ₹" + dataCharge);
            System.out.println("Subtotal: ₹" + totalBill);
            System.out.println("Service Tax (18%): ₹" + serviceTax);
            System.out.println("Final Payable Amount: ₹" + finalBill);
            System.out.println("----------------------------");
        }

        scanner.close();
    }
}
	
import java.util.Scanner;

public class CoachingCenter{
	public static void main(String[] args){
		
		Scanner scanner=new Scanner(System.in);
		
		int Outstanding=0;
		int Excellent=0;
		int Good=0;
		int Satisfactory=0;
		int NeedsImprovement=0;
		double totalMarks=0;
		
		for(int i=1;i<=6;i++){
			System.out.println("\nEnter details for Student " + i);
			System.out.print("Enter name: ");
			String name=scanner.nextLine();
			
			System.out.print("Enter marks: ");
			int marks=scanner.nextInt();
			
			String grade;
			
			totalMarks+=marks;
			
			if(marks==100){
			    grade="Outstanding(Perfect Scorer)";
			   Outstanding++;
			}
		    else if (marks>=90 && marks<100){
				grade="Outstanding";
			   Outstanding++;
			}
			else if (marks>=75 && marks<=89){
				grade="Excellent";
			    Excellent++;
		    }
			else if (marks>=60&& marks<=74){
				grade="Good";
			    Good++;
			}
			else if (marks>=45&& marks<=59){
				grade="Satisfactory";
			    Satisfactory++;
			}
			else{
				grade="NeedsImprovement";
			    NeedsImprovement++;
			}	
			System.out.println(name + " -> grade: " + grade);
		}
		
		double average = totalMarks / 6.0;

        System.out.println("\n----- Class Summary -----");
        System.out.println("Outstanding: " + Outstanding);
        System.out.println("Excellent: " + Excellent);
        System.out.println("Good: " + Good);
        System.out.println("Satisfactory: " + Satisfactory);
        System.out.println("Needs Improvement: " + NeedsImprovement);
        System.out.println("Class Average: " + average);

        scanner.close();
    }
}
		
        		
package basicjava;
import java.util.Scanner;
class school{
	int marksA;
	int marksB;
	int marksC;
	int total;
	int average;
	Scanner sc=new Scanner(System.in);
	//constructor is called whenever student object is created marks get entered ,total and average is calculated according to it
	school(){
		System.out.println("Enter marks of subject A");
		marksA=sc.nextInt();
		System.out.println("Enter marks of subject B");
		marksB=sc.nextInt();
		System.out.println("Enter marks of subject C");
		marksC=sc.nextInt();
		total=marksA+marksB+marksC;
		average=total/3;
	}
}
public class Student {
	public static void main(String[] args) {
		
		System.out.println("Enter student 1 marks");
		school student1=new school();
		System.out.println("Total marks of student1 are "+student1.total+" and average is "+ student1.average);
		System.out.println("Enter student 2 marks");
		school student2=new school();
		System.out.println("Total marks of student2 marks are "+student2.total+" and average is "+ student2.average);
		System.out.println("Enter student 3 marks");
		school student3=new school();
		System.out.println("Total marks of student1 marks are "+student3.total+" and average is "+ student3.average);
		
		int totalMarksSubjectA=student1.marksA+student2.marksA+student3.marksA;
		int avgPerSubjectA=totalMarksSubjectA/3;
		int totalMarksSubjectB=student1.marksB+student2.marksB+student3.marksB;
		int avgPerSubjectB=totalMarksSubjectB/3;
		int totalMarksSubjectC=student1.marksC+student2.marksC+student3.marksC;
		int avgPerSubjectC=totalMarksSubjectC/3;
		
		System.out.println("Total marks of Subject A are "+totalMarksSubjectA+" and average is "+ avgPerSubjectA);
		System.out.println("Total marks of Subject B are "+totalMarksSubjectB+" and average is "+ avgPerSubjectB);
		System.out.println("Total marks of Subject C are "+totalMarksSubjectC+" and average is "+ avgPerSubjectC);
	}

}

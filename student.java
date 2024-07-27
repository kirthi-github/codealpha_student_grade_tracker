import java.util.io.*;
public class student{
  public static void main(String[]args)
  {
Scanner Scan=new Scanner(System.in);
  System.out.println("enter the number of students:");
int numstd=Scan.nextInt();
double[]grades=new double[numstd];
for(int i=0; i<numstd; i++)
  System.out.print("enter the grade for the student"+(i+1)+":+);
grades[i]=Scan.nextDouble();
}
double sum=0;
double highest=grades[0];
double lowest=grades[0];
for(double grade:grades)
  sum+=grade;
if(grade>highest)
{
  highest=grade;
}
if(grade<lowest)
{
  lowest=grade;
}
}
double average=sum/numstd;
System.out.println("average grade:"+average);
System.out.println("highest grade:"+highest);
System.ouyt.prinyln("lowest grade:+lowest);
Scan.close();
}
}
  

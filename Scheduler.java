package OS;
import java.io.*;
import java.util.Scanner;
public class Scheduler {
	static ProcessControlBlock[]Q1,Q2;
	static int q1,q2; // counters for Q1,Q2 respectively

 public static void CreateProcesses() {
	 Scanner input= new Scanner(System.in);
	 
	 System.out.println("Enter the number of process");
	 int NOP=input.nextInt();
	 Q1=new ProcessControlBlock[NOP];
	 Q2=new ProcessControlBlock[NOP];
	 
	 
	 for(int i=0; i<NOP;i++) {
	 System.out.println("Enter the Process ID /n");
	 String PID= input.next();
	 System.out.println("Enter the Priority of the process (1 or 2) /n");
	 int PPriority= input.nextInt();
	 while (PPriority!=1 && PPriority!=2) {
		 System.out.println("Enter valid Priority number (1,2) /n");
		 PPriority=input.nextInt();
	 }
	 System.out.println("Enter the arrival time /n");
	 int arrivalTime=input.nextInt();
	 System.out.println("Enter the CPU burst of the process /n");
	 int cpuBurst=input.nextInt();
	 if (PPriority ==1) {
		Q1[q1]=new ProcessControlBlock(PID,PPriority,arrivalTime,cpuBurst);
		q1++;
	 }
	 else {
		Q2[q2]=new ProcessControlBlock(PID,PPriority,arrivalTime,cpuBurst);
		q2++;
	 }
	
	 } 
 }
 
 
 
 
 
}

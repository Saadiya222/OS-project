package OS;
import java.io.*;
import java.util.Scanner;

class ProcessControlBlock {
		   private String ProcessID; 
		   private int Priority;
		   private int TimeOfArrival; 
		   private int CPUburst;
		   private int StartingTime;
		   private int TerminatingTime;
		   private int TurningAroundTime;
		   private int WaitingTime;
		   private int ResponseTime;

		    public ProcessControlBlock(String ProcessID, int Priority, int TimeOfArrival, int CPUburst) {
		        this.ProcessID = ProcessID;
		        this.Priority = Priority;
		        this.TimeOfArrival = TimeOfArrival;
		        this.CPUburst = CPUburst;
		    }

		    public String getProcessID() {
		        return ProcessID;
		    }

		    public int getPriority() {
		        return Priority;
		    }

		    public int getTimeOfArrival() {
		        return TimeOfArrival;
		    }

		    public int getCPUburst() {
		        return CPUburst;
		    }

		    public int getTerminatingTime() {
		        return TerminatingTime;
		    }

		    public int getTurningAroundTime() {
		        return TurningAroundTime;
		    }

		    public int getWaitingTime() {
		        return WaitingTime;
		    }

		    public int getResponseTime() {
		        return ResponseTime;
		    }

		    public int getStartingTime() {
		        return StartingTime;
		    }

		    public void setStartingTime(int StartingTime) {
		        this.StartingTime = StartingTime;
		    }

		    public void setTerminatingTime(int TerminatingTime) {
		        this.TerminatingTime = TerminatingTime;
		    }

		    public void setTurningAroundTime(int TurningAroundTime) {
		        this.TurningAroundTime = TurningAroundTime;
		    }

		    public void setWaitingTime(int WaitingTime) {
		        this.WaitingTime = WaitingTime;
		    }

		    public void setResponseTime(int ResponseTime) {
		        this.ResponseTime = ResponseTime;
		    }

		   
}

//////////////////////////////////////////////////////////////


public class Scheduler {
	static ProcessControlBlock[]Q1,Q2;
	static int q1,q2; // counters for Q1,Q2 respectively
 public static void main(String[]args) throws IOException {
 }
	
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

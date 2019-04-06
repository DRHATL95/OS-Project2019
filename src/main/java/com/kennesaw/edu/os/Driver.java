package com.kennesaw.edu.os;
import com.kennesaw.edu.os.cpu.CPU;
import com.kennesaw.edu.os.cpu.ICPU;
import com.kennesaw.edu.os.cpu.Register;
import com.kennesaw.edu.os.dispatcher.Dispatcher;
import com.kennesaw.edu.os.memory.Memory;
import com.kennesaw.edu.os.memory.PCB;
import com.kennesaw.edu.os.scheduler.Scheduler;
 

public class Driver {
   
   //instance variables
   // private ICPU[] cpu;
   private Thread[] threads; //simulated threads
   private Scheduler scheduler;
   private Dispatcher dispatcher = new Dispatcher();
   private Memory disk;
   private Register register = new Register();

   
   this.threads = new threads[this.cpu.length]
   
   ICPU cpu = new CPU();
   
   
   scheduler = new Scheduler();
   this.Schedulerprocess = new Schedulerprocess;
   
   public Driver() {
      this.disk = disk;
      this.RAMsize = RAMsize;
      this.registers = registers; 
      this.cache = cache;
      
   }
   
   public void run() {//for thread array.
      for(int e = 0; e < cpu.length(); e++) {
         this.threads[e].start();
      }
   }//end run method for # of threads. 
   
   public static void Main(String []args) {
   
   if(loader() == null) {
      loader( programfile, disk );
      while(loader != null) {
         this.scheduler.run();
         this.dispatcher.run();
         
         
         jobcompleted = true;
         if(PCB.getStatus != PCB.Status.Terminated) {
            jobcompleed = false;
         }
            
         boolean notalive = true;
         for (Thread thread : this.threads) {
            if(thread != null) {
               notalive = false;
            }
         }
         
         for (CPU cpu : this.cpu) {
			cpu.signalShutdown();
			synchronized (cpu) {
			}
		}

		// Wait for the threads
		boolean[] joined = new boolean[this.threads.length];
		for ( int x = 0; x < joined.length; x++ ) {
			joined[x] = false;
		}

		boolean allJoined;

		/*
      do {
			for ( int f = 0; f < this.cpu.length; f++ ) {
				synchronized (this.cpu[f]) {
				}
				this.threads[f].join();
				if ( !this.threads[f].isAlive() ) { 
					joined[f] = true;
				}
			}
			allJoined = true;
			for ( boolean aJoined : joined ) {
				if ( !aJoined ) {
					allJoined = false;
					break;
				}
			}
		} while (!allJoined);   
    */     
   }
   
      }
   
   }// end main method
   
   public void dump() {
      System.out.println("Disk size: " + disksize +  "RAM usage: " + RAMsize );
      
    for (CPU cpu : this.cpu) {
      System.out.println( "CPU " + cpu.getCPUID() );
		cpu.printDump();
		System.out.println();
    }  
      
      
    
      
   }
}//end driver class
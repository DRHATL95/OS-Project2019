package com.kennesaw.edu.os.memory;


import java.util.*;
import java.io.*;

public class Memory
{
   public static String memory[] = new String[1024];
   boolean busy = true;
   int x;
   int lock;
   int next = 0;
   
   public static Page new_memory[];
   
   // FOR CPU only - Used to read addr and return string value (instruct)
   public static String readMemForCPU(int addr) {
	   if (addr > memory.length)
		   	System.out.println("Address is invalid.");
	   return memory[addr];
   }
    
    // Reads from memory
   public static String readMemory(int address, Page new_memory)
   {
      /*if (address > memory.length)
         System.out.println("Address is invalid.");
      return memory[address];
      */
      return new_memory.read(address);
   }//end readmem
   
    // Writes to memory
   public static void writeMemory(int address, String data)
   {
      memory[address] = data;
   }//end write mem
   
    // Determines if memory is full
   public static boolean isFull()
   {
     // return Arrays.asList(memory).indexOf(null) == -1;
      return Arrays.asList(new_memory).indexOf(null) == -1;
   }//end isfull
   
   // Acquire for the semaphore (lock)
   public static void acquire(boolean busy, int lock, int next)
   {
      while(lock == 1) // if key is there
      {
         lock--; // process takes key
         busy = true; // crit section becomes locked
         // do stuff: gotta figure out what "stuff" actually is     
         next++;
      }
   }
   // Release for the semaphore (lock)
   public static void release(boolean busy, int lock)
   {
      lock++; // if previous process is complete, replace the key
      busy = false; // crit section is open
   }
}//end memory class

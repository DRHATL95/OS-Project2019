package com.kennesaw.edu.os.memory;

import java.util.*;

public class Page {
   public static String block[];
   int page_size = 4;
   int jobId;
   boolean isFull;
   
   public Page(){
      for(int x = 0; x < page_size; x++){
         isFull = false;
      }
   }
   
   public Page(int page_length){
      block = new String[page_length];
      page_size = page_length;
   }
      
   public Page(int page_length, int job){
      page_size = page_length;
      jobId = job;
   }
   
   public boolean isFull(){
      return isFull;
   }
      
   public static String read(int i){
      return block[i];
   }      
    

   
   
  
      
}
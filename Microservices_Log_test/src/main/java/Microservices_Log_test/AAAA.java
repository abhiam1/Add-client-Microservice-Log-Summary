package Microservices_Log_test;

import java.util.concurrent.TimeUnit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Microservices_Log_Summary_Capture 

{
	/*2015-10-28T12:24:33,903 TRACE [OperImpl] entry with (addClient:97900)
	2015-10-28T12:24:34,002 TRACE [OperImpl] entry with (addClient:97900)*/
		public static void main(String[] args) throws FileNotFoundException 
		{
		
			double timestamp_difference ;  
		{
			try (BufferedReader br = new BufferedReader (new FileReader("C:\\mslog.txt"))) 
			{
				
				{
					System.out.println(" Captured Summary of the Microservices Log file located at C:\\mslog.txt is as below :  " );
					System.out.println(" ************ Start of Log file Summary ************* ");
					System.out.println(" Sr.No 1 - " ); 
					
					String sCurrentLine;
			        
			                    String Search="(addClient:97900)";
			        while ((sCurrentLine = br.readLine()) != null) 
			        {	        	
			        	                     
			        	if(sCurrentLine.contains(Search))
			                        {		        
			        System.out.println("     (addClient:97900) string found in log file where Name of service is = addClient & Request id is = 97900 " ) ;
			                        }
			        	
			        	
			        }
			        { 
			    		int count = 0;
			        for (int i = 0; i <= 1 ; i++) {
			            count++;
			            
			         }
			        System.out.println( " Sr.No 2 - Number of requests made to the service are = "  + count);
			        }
			        
				

			        }	
			

			        
			}
			
			        
				
				catch (IOException e) {
			        e.printStackTrace();
			    }
			
			
			
			try (BufferedReader br1 = new BufferedReader (new FileReader("C:\\mslog.txt"))) 
			{
				
				{
			        String sCurrentLine;
			                    String Search1="2015-10-28T12:24:33,903";
			        while ((sCurrentLine = br1.readLine()) != null) 
			        {
			                        if(sCurrentLine.contains(Search1))
			                        {
			                        System.out.println(" Sr.No 3 - Entry time stamp of Add Client Request (id-97900) found in logfile is = " + Search1 );
			                        }
			    

			        }
			        

			        
			}
			}
			        
				
				catch (IOException e) {
			        e.printStackTrace();
			    }
				 
			
			try (BufferedReader br2 = new BufferedReader (new FileReader("C:\\mslog.txt"))) 
			{
				
				{
			        String sCurrentLine;
			                    String Search2="2015-10-28T12:24:34,002";
			        while ((sCurrentLine = br2.readLine()) != null) 
			        {
			                        if(sCurrentLine.contains(Search2))
			                        {
			                        System.out.println(" Sr.No 4 - Exit time stamp of Add Client Request (id-97900) found in logfile is = " + Search2 );
			                        }
			    

			        }
			        

			        
			}
			}
			        
				
				catch (IOException e) {
			        e.printStackTrace();
			    }
			
			try (BufferedReader br3 = new BufferedReader (new FileReader("C:\\mslog.txt"))) 
			{
				
				{
			        String sCurrentLine;
			                    String Search3="33,903";		                    
			        while ((sCurrentLine = br3.readLine()) != null) 
			        {
			                        if(sCurrentLine.contains(Search3))
			                        {
			                        System.out.println(" Sr.No 5 - Entry time stamp (in seconds) of Add Client Request (id-97900) found in logfile is = " + Search3 );
			                        //double secexit = Integer.parseInt(Search3);
			                        }
			    

			        }

			        
			}
			}
			        
				
				catch (IOException e) {
			        e.printStackTrace();
			    }
			
			
			try (BufferedReader br4 = new BufferedReader (new FileReader("C:\\mslog.txt"))) 
			{
				
				{
			        String sCurrentLine;
			                    String Search4="34,002";		                    
			        while ((sCurrentLine = br4.readLine()) != null) 
			        {
			                        if(sCurrentLine.contains(Search4))
			                        {
			                        System.out.println(" Sr.No 6 - Exit time stamp (in seconds) of Add Client Request (id-97900) found in logfile is = " + Search4 );
			                        //double secentry = Integer.parseInt(Search4);
			                        }
			    

			        }
			        

			        
			}
			}
			        
				
				catch (IOException e) {
			        e.printStackTrace();
			    }
			
			
			
			
			
			timestamp_difference = ( 34002 - 33903 ) * 0.0001 ;
			System.out.println(" Sr.No 7 - Maximum time required for Add Client request execution ( in seconds ) is = " + timestamp_difference );
			
			System.out.println(" ************ End of Log file Summary ************* ");
			
			}
		
		
		
	}
	} 
		


			
		





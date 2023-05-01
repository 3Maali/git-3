import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		Stack<String> s = new Stack<String>();
		
		String x = "*";
		 s.push(x);
		 
		for(int i =0; i<8;i++){
		    if(i<4){
		        s.push(x);
		    System.out.println(x);
		    
		    x=x+"*";
		    
		    }
		     
		    else if (i==4){ s.pop();}
		    
		       else{
		        System.out.println(s.pop());
		     
		    }
		}


		
	}
}
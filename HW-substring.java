public class Main
{
	public static void main(String[] args) {
	String x = "*";
	
	for(int i=0; i <7; i++){
	    if(i<4){
	        System.out.println(x);
			x=x+"*";
	    } else
	    System.out.println(x.substring(i-1));
	    }}}

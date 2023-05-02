public class Main
{
	public static void main(String[] args) {
	String star = "*";
	
	for(int i=0; i <7; i++){
	    if(i<4){
	        System.out.println(star);
			star=star+"*";
	    } else
	    System.out.println(star.substring(i-1));
	    }}}

import java.util.Random;
import java.util.Scanner;


public class CitySim9002 {
	
	static int seed;
	public static void readseed(){
		Scanner scanner = new Scanner(System.in);
	    System.out.print("$ java CitySim9002 ");
	    seed = scanner.nextInt();
	    //exit if seed illegal
	    //succeed :
	    //System.out.print("Welcome to CitySim! Your seed is ");
	    //System.out.println(seed);
	    //fail: 
	    //System.out.println("Please enter one integer argument, seed" );
	    //return seed;
	}
	
	public static int random4(){
		Random rand =new Random();//not sure if I should put the seed in Random(), cause I tried, it turns out not the same chance to generate an integer.
		return rand.nextInt(4)+1;
	}
	public static int random5(){
		Random rand =new Random();
		return rand.nextInt(5)+1;
	}
	
	public static String visitors(int n){
//		Random rand =new Random();
//		int n =rand.nextInt(4)+1;
		if(n==1) return "a Student";
		if(n==2) return "a Professor";
		if(n==3) return "a Business Person";
		//if(n==4) return "Blogger";
		return "a Blogger";
	} 
	public static String locations(int n){
		if(n==1) return "Squirrel Hill";
		if(n==2) return "Downtown";
		if(n==3) return "The Point";
		//if(n==4) 
			return "The Cathedral of Learning";
		//return "has left the city";
	} 
	public static String preference(int s,int l){
		if( (s==1 && l<=3) || (s==2) || (s==3 && l<=2) ) return " did like ";
		return " did not like ";
	} 
	
	public static void iterationhead(int i, int v, int l){
		System.out.print("Visitor ");
		System.out.print(i);
		System.out.print(" is ");
		System.out.println(visitors(v));
		
		System.out.print("Visitor ");
		System.out.print(i);
		System.out.print(" is going to ");
		System.out.println(locations(l));
		
		System.out.print("Visitor ");
		System.out.print(i);
		System.out.print(preference(v,l));
		System.out.println(locations(l));
	}
	public static void iterationbody(int i, int v, int l){
		System.out.print("Visitor ");
		System.out.print(i);
		System.out.print(" is going to ");
		System.out.println(locations(l));
		
		System.out.print("Visitor ");
		System.out.print(i);
		System.out.print(preference(v,l));
		System.out.println(locations(l));
	}
	public static void iterationtail(int i){
		System.out.print("Visitor ");
		System.out.print(i);
		System.out.println(" has left the city.\n***");
	}
	
	public static void iterationouterbody(int i,int v){
		int ll=random5();
		while(ll<=4){
			iterationbody(i, v, ll);
			ll=random5();
		}
			iterationtail(i);
	}
	
	
	public static void main(String[] args) {
		//System.out.print("$ java CitySim9002 ");
		//CitySim9002.iterationhead(1, 2, 3);
		//System.out.print("Welcome to CitySim! Your seed is ");
		readseed();
		for (int i=1;i<=5;i++){
			int v= random4();
			int l=random4();
			iterationhead(i, v, l);
			iterationouterbody(i,v);
//			int ll=random5();
//			while(ll<=4){
//				iterationbody(i, v, ll);
//				ll=random5();
//			}
//				iterationtail(i);

				//ll=random5();
			//}
			//iterationtail(i);
			//visitor i
			//random 4 visitors
			//random 4 locations
			//preference
			//random 5 locations
			//visitor i
			//System.out.println("has left the city.\n***");
		}
		
	}
}
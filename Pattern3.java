import java.util.*;
public class Pattern3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number");
	    int n = sc.nextInt();
	   int  row = (2*n)-1;
	    int i,j,k;
	    for(i=1; i<=n; i++)
	    {
	       k=i;
	        for(j=1; j<=row; j++)
	        {
	          if(j>=n+1- i && j<= n-1+i)
	          {
	              System.out.print(k);
	             if(j<n)
	              k++;
	              else
	              k--;
	          }
	          else 
	          {
	              System.out.print(" ");
	              
	          }
	          
	        }
	        System.out.println(" ");
	    }
	}
}

/*Enter the number
5
    1     
   232    
  34543   
 4567654  
567898765 
*/
public class Solution {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sumd1=0;
      int sumd2=0;
      int[][] a =new int[n+1][n+1];
      for(int i=0;i<n;i++)
      {
          for(int j=0;j<n;j++)
          {
              a[i][j]=sc.nextInt();
              if(i==j)
                sumd1=sumd1+a[i][j];            
          }     
      }
      for(int i=0,j=n-1;i<n;i++,j--)
      {
            
          sumd2=sumd2+a[i][j];
                 
          
      }
      int sum=Math.abs(sumd1-sumd2);  
      System.out.println(sum);
    }      
}
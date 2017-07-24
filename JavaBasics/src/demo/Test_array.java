package demo;

public class Test_array {
	
	public static void main(String args[])
    {
    String xyz[][]=new String[2][3];    //creating the array
                int j,k=0;
                for(int i=0;i<2;i++)                  //initializing the array
                {
                            for(j=0;j<3;j++)
                            xyz[i][j]="xyz"+"["+i+"]"+"["+j+"]";
                }
                System.out.println("array elements of xyz[2][3]:\n");
                for(int i=0;i<2;i++)                 
                {
                            for(j=0;j<3;j++)
                            System.out.print (xyz[i][j]+"  ");        
                            System.out.println();
                }
    }

}

package one;

public class Assignment12 {

	public static void main(String[] args) {
		 for (int i = 100 ; i <= 1000 ; i++)
         {
                    int m = i;
                    int n = 0;
                    int s = 0;

                    while (m > 0)
                     {
                                 n = m % 10;
                                 s = s + (n * n * n);
                                 m = m / 10;
                     }
                     if (m == s)
                      {
                             System.out.println(i+ "is an ArmStrongNumber");
                       }
         }

	}

}

import java.util.Scanner;

public class Anagrama 
{
    public static void main(String[] args) 
    {
        //Recieves the values of the strings
        Scanner sc = new Scanner(System.in);
        String anadrama1, anagrama2;
        boolean resultado=false;
        System.out.println("Write your first word");
        anadrama1 = sc.nextLine();
        System.out.println("Write your second word");
        anagrama2 = sc.nextLine();

        if(comparador(anagrama2, anagrama2)==true)
        {
            resultado=true;
        }

        if (resultado==true)
        {
            System.out.println("It's an anagrama");
        }
    }

    //Function that compares the values and returns the boolean value
    public static boolean comparador(String x, String y)
    {
        int contador=0;
        for(int i=0;i<x.length();i++)
        {
            for(int j=0;j<y.length();j++)
            {
               if(y.charAt(j)==x.charAt(i))
               {
                    contador++;
                    break;
               }
            }
        }
        /*ToCharArray, char[] = new char[], Arrays.sort(), equalsTo()*/
        if(contador==x.length())
        {
            return true;
        }
        
        else
        {
            return false;
        }
    }

}

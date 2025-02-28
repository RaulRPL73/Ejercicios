import java.util.*;
public class Fibonacci 
{
    public static void main(String[] args) 
    {
        int [] numero = new int[50];
        int anteriro1 = 1, anteriro2 = 0, suma=0, temp;
        for(int i=0;i<50;i++)
        {
            numero[i] = anteriro1;
            suma = anteriro1 + anteriro2;
            temp = anteriro1;
            anteriro1 = suma;
            anteriro2 = temp;
            System.out.print(numero[i]+",");
        }
    }
    
    public static void listaF()
    {
        List<Integer> fibonacci = new ArrayList<>();
        int anteriro1 = 0, anteriro2 = 1, suma;

        for(int i=0;i<50;i++)
        {
            fibonacci.add(anteriro1);
            suma = anteriro1 + anteriro2;
            anteriro1 = anteriro2;
            anteriro2 = suma;
        }
        System.out.print(fibonacci);
    }
}

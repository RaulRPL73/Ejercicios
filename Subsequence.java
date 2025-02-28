public class Subsequencia 
{
    public static void main(String[] args) 
    {
        int [] numerosSub = {10,22,9,33,21,50,41,60,80};
        int [] cadenaNum = new int [numerosSub.length];
        int agregar = 0;
        int contador = 0;
        for (int i=0;i<numerosSub.length;i++)
        {
            if(numerosSub[i]>=agregar)
            {
                agregar = numerosSub[i];
                cadenaNum[contador] = agregar;
                contador++;
            }
        }
        for(int i=0; i<cadenaNum.length;i++)
        {
            if (cadenaNum[i]>0)
            {
                System.out.println(cadenaNum[i]);
            }
        }
    }    
}

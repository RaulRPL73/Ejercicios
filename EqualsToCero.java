public class EqualsToCero
{
public static void main(String[] args)
    {
        int[] numeros = {5,4,3,-9,-6,-3}; 
        int indice = 0;
        int resultado;
        int[] numerosCero = new int[numeros.length];//same size as the array because it can be full of numbers that their sum is equal to 0
        int numAnterior;
        int numSiguiente;
        //If there's no number on the array
        if(numeros.length==0)
        {
            System.out.println("No existe datos para revisar");
        }
        else
        {
            for(int i = 0; i<numeros.length;i++)
            {
                numAnterior=numeros[i];
                for(int j=i+1;j<numeros.length;j++)
                {
                    numSiguiente=numeros[j];
                    resultado=numAnterior+numSiguiente;
                    if(resultado==0)
                    {
                        numerosCero[indice] = numAnterior;
                        indice++;
                        numerosCero[indice] = numSiguiente;
                        indice++;
                        break;
                    }
                }
            }
        }
        
        for(int k=0;k<indice;k++)
        {
            System.out.println(numerosCero[k]);
        }
    } 
}

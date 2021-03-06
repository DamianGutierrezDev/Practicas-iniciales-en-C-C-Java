package paquete;

public class Ordenador {
	
	public void ordenBurbuja(int [] array)
	{
		int aux;
		boolean cambios = false;
		
		
		while(true)
		{
			cambios = false;
			for(int i=1; i<array.length;i++)
			{
				if(array[i]<array[i-1])
				{
					aux = array[i];
					array[i] = array[i-1];
					array[i-1] = aux;
					cambios = true;
				}
			}
				
			if(cambios == false)
				break;
		}

	}
	public void ordenInsercion(int []Array)
	{
		int aux;//Cambio de posiciones, no se pierda el dato 
		int cont1, cont2;
		for(cont1 = 1; cont1 < Array.length ;cont1++)
		{
			aux = Array[cont1];
			for(cont2 = cont1-1 ; cont2 >= 0 && Array[cont2] > aux; cont2--)
			{
				Array[cont2+1] = Array[cont2];
				Array[cont2] = aux;
				
				
			}
				
			
		}
		
		
	}
	
	//Aqui se aplica recursividad, analizarlo mejor con lote de prueba
	public void ordenQuicksort( int []array)
	{
		array = quicksort1(array);
		
	}
	
	public int[] quicksort1(int numeros[])
	{
		return quicksort2(numeros,0,numeros.length-1);
		
	}
	
	public int[] quicksort2(int numeros[], int izq, int der)
	{
		if(izq >= der)
			return numeros;
		int i=izq, d=der;
		if(izq != der)
		{
			int pivote;
			int aux;
			pivote= izq;
			while(izq != der)
			{
				while(numeros[der] >= numeros[pivote] && izq < der)
					der--;
				while(numeros[izq] < numeros[pivote] && izq < der)
					izq++;
				if(izq != der)
				{
					///Intercambio de valores, se usa el auxiliar para no peder un dato en memoria
					aux = numeros[der];
					numeros[der] = numeros[izq];
					numeros[izq] = aux;
				}
				if(izq == der)
				{
					quicksort2(numeros,i,izq-1);
					quicksort2(numeros,der+1,d);
				}
					
				}
		}
		else
			return numeros;
		return numeros;
		
		
		
	}
	
}

package paquete;
import java.io.*;
public class Textos {

	public void leer(String nombreArchivo)
	{
		try {
			FileReader r = new FileReader(nombreArchivo);//Leo nombre de archivo y se mete ahi
			BufferedReader buffer = new BufferedReader(r);//En buffer se guarda la info
			
			String temp= " ";
			while(temp!=null)
			{temp = buffer.readLine();
			if(temp == null)
				break;
			System.out.println(temp);
				
			}
			System.out.println(buffer.readLine());//Leo una linea de codigo
		}catch(Exception e) {
		System.out.println(e.getMessage());
	
		};
		
	}
	public void escribir(String nombreArchivo)
	{
		File f; 
		f = new File(nombreArchivo); // le asigno el nombre
		
		//Escritura
		try {
			FileWriter w = new FileWriter(f);
			BufferedWriter br = new BufferedWriter(w);
			PrintWriter wr = new PrintWriter(br);
			
			wr.write("Esto es una linea de texto");
			wr.append("\n- Y esta esta en el segundo registro");
			wr.close();
			br.close();
		}catch(Exception e) {};
		
	}
	

}

package paquete;
import java.util.Stack;
public class Main {

	public static void main(String[] args) {
		/*Java = C
		 * Push = Insertar en pila
		 * Pop = Sacar de pila
		 * Peek = Ver tope
		 * Empry = Saber si la pila esta llena o vacia
		 * */
		Stack pila = new Stack ();
		pila.push("hola");
		pila.push(59);
		pila.push(5);
		pila.push(887);
		pila.push(5344);
		
		///System.out.println("El tope de la pila es: "+pila.peek());
		while(!pila.empty())
		{
			System.out.println("El valor de la pila es: "+pila.pop());
			
		}
	}

}

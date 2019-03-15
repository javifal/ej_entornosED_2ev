import code.MinimoComunMultiplo;
import code.VerificaNumerosAmigos;
/**
 * 
 * @author Javier
 * 
 * Esta es la clase demo desde la cual ejecutaremos los metodos de numerosAmigos y minimoComunMultiplo
 */
public class demo {

		public static void main (String[] args) {
			/**
			 * Aqui tenemos las llamadas de ambos metodos
			 */
			numerosAmigos();
			minimoComunMultiplo();
			
		}
		/**
		 * En este metodo se calculan si los numeros introducidos son amigos o no lo son.
		 */
		public static void numerosAmigos() {
			VerificaNumerosAmigos vf = new VerificaNumerosAmigos();
			vf.verificador();
		}
		/**
		 * En este metodo se calcula cual es el minimo comun multiplo de los numeros introducidos.
		 */
		public static void minimoComunMultiplo() {
			MinimoComunMultiplo mcm = new MinimoComunMultiplo();
			int[] candidatos = {17, 23};
			int resultado = mcm.candidatosMcM(candidatos);
			System.out.println("el mínimo común múltiplo de los candidatos es: "+resultado);
		}
}

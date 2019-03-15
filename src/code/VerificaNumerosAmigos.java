package code;
import javax.swing.JOptionPane;
/**
 * 
 * @author Javier
 * @version 1.0
 * 
 * Clase que nos verificara si los dos numeros introducidos son amigos
 */
public class VerificaNumerosAmigos {

	/*
	 * Dos números son amigos cuando la suma de los divisores de uno da como resultado el otro y viceversa.
	 * Por ejemplo: 220 y 284 son amigos.
	 * */
	/**
	 * Metodo en el cual se nos pedira introducir los dos numeros que nos mostrara por pantalla si los numeros son amigos o no dependiendo 
	 * de lo que nos devuelva el metodo comprobarAmigos
	 */
    public void verificador() {
        String entrada;

        entrada = JOptionPane.showInputDialog("Introducir 1er número");
        int x = Integer.parseInt(entrada);

        entrada = JOptionPane.showInputDialog("Introducir 2º número");
        int y = Integer.parseInt(entrada);
        
        if (this.comprobarSiAmigos(x,y)) {
            JOptionPane.showMessageDialog(null, x + " es amigo de " + y);
        } else {
            JOptionPane.showMessageDialog(null, x + " no es amigo de " + y);
        }        
    }
    /**
     * 
     * @param x A este metodo le pasamos un parametro de tipo entero llamado x
     * @param y A este metodo le pasamos otro parametro de tipo entero llamado y
     * @return Devuelve un valor booleano (true o false) segun si los numeros son amigos o no
     */
   public boolean comprobarSiAmigos(int x, int y) {
    	int i, z = 0;
    	
    	/**
    	 * Bucle que nos calcula la suma de los divisores de x
    	 */
    	for (i = 1; i < x; i++) {
            if (x % i == 0) {
                z = z + i;
            }
        }
    	/**
    	 * Bucle que nos calcula la suma de los divisores de y, si la suma de los divisores de x es igual a y
    	 */
        if (z == y) {
            z = 0;
            for (i = 1; i < y; i++) {
                if (y % i == 0) {
                    z = z + i;
                }
            }
            /**
             * Si la suma de los divisores de y es igual a x, nos devuelve true, por lo que x e y seran amigos, sino nos devuelve false y no seran amigos
             */
            if (z == x) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}

package code;

/**
 * @author Javier
 * @version 1.0
 * 
 * Clase MinimoComunMultiplo en la cual se calcula cual es el primer multiplo comun entre los numeros pasados
 */
public class MinimoComunMultiplo {
	/**
	 * Constructor minimoComunMultiplo al que no se le pasan parametros
	 */
  public MinimoComunMultiplo() {}
/**
 * @param args Son los argumentos enteros que se le pasan antes de iniciar el programa
 * @return Devuelve el valor de la variable d
 */
  public int candidatosMcM(int[] args) {
    if (args.length < 2) {
      throw new IllegalArgumentException(
        "Hacen falta dos o más números"
      );
    }

    if (algunoEsCero(args)) {
      throw new IllegalArgumentException(
        "Los números no pueden ser cero"
      );
    }

    args = abs(args);

    int max = max(args);
    int d = max;

    while (true) {
      if (esMinimoComunMultiplo(d, args)) {
        return d;
      }

      d += max;
    }
  }
/**
 * Metodo que calcula si uno de los dos numeros introducidos es 0
 * @param ints Se le pasa como parametro un array de enteros
 * @return Devuelve verdader si uno de los dos numeros es 0 y falso si no es 0
 */
  private boolean algunoEsCero(int[] ints) {
    for (int d : ints) {
      if (d == 0) {
        return true;
      }
    }

    return false;
  }
/**
 * @param ints Se le pasa como parametro un array de enteros el cual determinara el tama�o del array abs
 * @return Nos devuelve el valor absoluto de cada uno de los numeros del array
 */
  private static int[] abs(int[] ints) {
    int[] abs = new int[ints.length];

    for (int i = 0; i < ints.length; i += 1) {
      abs[i] = Math.abs(ints[i]);
    }

    return abs;
  }
  
/**
 * @param ints Se le pasa como parametro un array de enteros
 * @return Devuelve el valor maximo
 */
  private int max(int[] ints) {
    int max = ints[0];

    for (int i = 1; i < ints.length; i += 1) {
      max = Math.max(max, ints[i]);
    }

    return max;
  }
  
/**
 * @param d Se le pasa el parametro de tipo entero d el cual es el numero que sera dividido por todos los numeros del array para calcular el resto
 * @param ints Se le pasa como parametro un array de numeros enteros
 * @return Devuelve un valor booleano 
 */
  private boolean esMinimoComunMultiplo(int d, int[] ints) {
    for (int i = 0; i < ints.length; i += 1) {
      if (d % ints[i] != 0) {
        return false;
      }
    }

    return true;
  }
}

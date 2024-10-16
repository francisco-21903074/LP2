import java.util.ArrayList;
import java.util.List;


public class Main {

    public static String f1_converteNumero(int num1, int num2) {
        return num1 + " " + num2;
    }

    public static int[] f2_converteArray(int tamanho) {

        if (tamanho <= 0) {
            System.out.println("Tamanho tem que ser maior que 0");
            return new int[]{};
        }
        int[] array = new int[tamanho];

        /*for(int i = 0; i < tamanho; i++){
            array[i] = i;
        }*/
        return array;
    }

    public static int[] f3_preencheArray(int tamanho) {
        if (tamanho <= 0) {
            System.out.println("Tamanho tem que ser maior que 0");
            return new int[]{};
        }
        int[] array = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            array[i] = i;
        }
        return array;
    }

    public static String f4_converteParaString(int[] array) {
        String result = "[";

        for (int i = 0; i < array.length; i++) {
            result += array[i];  // Concatenate the array element
            if (i < array.length - 1) {
                result += ",";  // Add a comma after each element except the last one
            }
        }

        result += "]";
        return result;
    }

    public static int f5_somaArray (int[] array) {
        int soma = 0;
        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }
        return soma;
    }

    public static int f6_max (int[] array) {
        if (array == null)
            throw new IllegalArgumentException("array nao pode ser null");
        int max;
        max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;

    }

    public static List<Integer> f7_iguais (int[] array, int[] array2) {
        List<Integer> repetido = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array[i] == array2[j]) {
                    if(!repetido.contains(array[i])) {
                        repetido.add(array[i]);
                    }
                    break;
                }
            }
        }
        return repetido;

    }



    public static void main(String[] args) {
        int [] array = {0,2,3,5};
        int[] array2 = {11};
        System.out.println(f7_iguais(array, array2));

    }
}
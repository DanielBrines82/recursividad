import java.util.Scanner;

public class sumaVector {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos numeros quiere ingresar?");
        int arr[] = new int[sc.nextInt()];

        System.out.println("Cargar los Valores :");
        for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }

        System.out.println(sumarValores(arr, arr.length - 1));
}


    public static int sumarValores(int array[], int posArray) {

        int tam = posArray;
        int rta;

        if (tam == 0) {
            return array[tam];
        } else {

            rta = (array[tam]) + sumarValores(array, tam - 1);

        }
        return rta;
    }
    }

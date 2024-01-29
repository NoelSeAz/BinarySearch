package org.example;
public class Main {

    /**
     * Realiza una búsqueda binaria en un arreglo ordenado.
     *
     * @param array  El arreglo ordenado donde se realiza la búsqueda.
     * @param target El valor a buscar.
     * @return El índice del elemento si se encuentra, de lo contrario -1.
     */
    public int search(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Verificar si el elemento está presente en el medio
            if (array[mid] == target) {
                return mid;
            }

            // Si el elemento es más grande que mid, entonces solo puede
            // estar presente en el subarray derecho
            if (array[mid] < target) {
                left = mid + 1;
            }
            // De lo contrario, el elemento solo puede estar presente
            // en el subarray izquierdo
            else {
                right = mid - 1;
            }
        }

        // Si llegamos aquí, significa que el elemento no estaba presente
        return -1;
    }

    public static void main(String[] args) {
        Main binarySearch = new Main();

        int[] array = {2, 3, 4, 10, 40};
        int target = 10;

        int result = binarySearch.search(array, target);
        if (result == -1) {
            System.out.println("Elemento no presente en el arreglo");
        } else {
            System.out.println("Elemento encontrado en el índice: " + result);
        }
    }
}

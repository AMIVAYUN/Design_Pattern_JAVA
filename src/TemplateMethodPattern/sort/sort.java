package TemplateMethodPattern.sort;public class sort   {
}

    /**
     *

    public static void sort(Object[] a) {
        Object aux[] = (Object[]) a.clone();
        mergeSort(aux, a, 0, a .length, 0);
    }
    private static void mergeSort(Object src[],
                                  Object dest[], int low, int high, int off) {
        for (int i = low; i < high; i++) {
            for (int j = i; j > low && ((Comparable) dest[j
                    -1]).compareTo((Comparable) dest[j]) > 0; j--) {
                swap(dest, j, j – 1);
            }
        }
    }
     * @param a
     */
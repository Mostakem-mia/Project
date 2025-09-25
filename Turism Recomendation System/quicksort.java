
package tourist;

import java.util.ArrayList;

public class quicksort {
    public static void quickSortByDistance(ArrayList<User> list, int low, int high,int decend) {
        if (low < high) {
            int pivotIndex = partitionByDistance(list, low, high,decend);

            quickSortByDistance(list, low, pivotIndex - 1,decend);
            quickSortByDistance(list, pivotIndex + 1, high,decend);
        }
    }
    public static void quickSortByFee(ArrayList<MakePlan.User> list, int low, int high,int decend) {
       if (low < high) {
            int pivotIndex = partitionByFee(list, low, high,decend);

            quickSortByFee(list, low, pivotIndex - 1,decend);
            quickSortByFee(list, pivotIndex + 1, high,decend);
        }
    }

    public static int partitionByDistance(ArrayList<User> list, int low, int high,int decend) {
        User pivot = list.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            switch (decend) {
                case 1:
                    if (list.get(j).distance > pivot.distance) {
                        i++;
                        swap(list, i, j);
                    }       break;
                case 2:
                    if (list.get(j).distance < pivot.distance) {
                        i++;
                        swap(list, i, j);
                    }       break;
                case 3:
                    if (list.get(j).cost > pivot.cost) {
                        i++;
                        swap(list, i, j);
                    }
                    break;
                case 4:
                    if (list.get(j).cost < pivot.cost) {
                        i++;
                        swap(list, i, j);
                    }
                    break;
                default:
                    break;
            }
        }

        swap(list, i + 1, high);
        return i + 1;
    }

    public static int partitionByFee(ArrayList<MakePlan.User> list, int low, int high,int decend) {
        MakePlan.User pivot = list.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            switch (decend) {
                case 1:
                    if (list.get(j).time > pivot.time) {
                        i++;
                        swap1(list, i, j);
                    }       break;
                case 2:
                    if (list.get(j).time < pivot.time ) {
                        i++;
                        swap1(list, i, j);
                    }       break;
                case 3:
                    if (list.get(j).fee > pivot.fee) {
                        i++;
                        swap1(list, i, j);
                    }
                    break;
                case 4:
                    if (list.get(j).fee < pivot.fee) {
                        i++;
                        swap1(list, i, j);
                    }
                    break;
                default:
                    break;
            }
        }

        swap1(list, i + 1, high);
        return i + 1;
    }

    public static void swap(ArrayList<User> list, int i, int j) {
        User temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
    public static void swap1(ArrayList<MakePlan.User> list, int i, int j) {
        MakePlan.User temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

   

}

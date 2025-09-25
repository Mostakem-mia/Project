
package tourist;

import java.util.ArrayList;

public class KnapsackAlgo {
     static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    static int knapsackAlgo(int W, ArrayList<MakePlan.User> list, int n, ArrayList<Integer> selectedItems) {
        int i, w;
        int[][] knap = new int[n + 1][W + 1];
        for (i = 0; i <= n; i++) {
            for (w = 0; w <= W; w++) {
                if (i == 0 || w == 0) {
                    knap[i][w] = 0;
                } else if (list.get(i - 1).fee <= w) {
                    knap[i][w] = max(list.get(i - 1).time + knap[i - 1][w - list.get(i - 1).fee], knap[i - 1][w]);
                } else {
                    knap[i][w] = knap[i - 1][w];
                }
            }
        }
        int res = knap[n][W];
        int remainingWeight = W;
        for (i = n; i > 0 && res > 0; i--) {
            if (res != knap[i - 1][remainingWeight]) {
                // Item i was included
                selectedItems.add(i - 1);
                res -= list.get(i - 1).time;
                remainingWeight -= list.get(i - 1).fee;
            }
        }

        return knap[n][W];
    }
}

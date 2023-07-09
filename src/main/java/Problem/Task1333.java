package Problem;

import java.util.ArrayList;
import java.util.List;

public class Task1333 {
    public static List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {

        int[][] vals = new int[restaurants.length][2];

        for (int i = 0; i < restaurants.length; i++) {
            if (veganFriendly == 1) {
                if (restaurants[i][2] == 1) {
                    if (restaurants[i][4] <= maxDistance & restaurants[i][3] <= maxPrice) {
                        int[] a = {restaurants[i][0], restaurants[i][1]};
                        vals[i][0] = a[0];
                        vals[i][1] = a[1];
                    }
                }
            } else {
                if (restaurants[i][4] <= maxDistance & restaurants[i][3] <= maxPrice) {
                    int[] a = {restaurants[i][0], restaurants[i][1]};
                    vals[i][0] = a[0];
                    vals[i][1] = a[1];
                }
            }
        }
        for (int i = 0; i < vals.length; i++) {
            for (int j = 0; j < vals.length - i - 1; j++) {
                if (vals[j + 1][1] > vals[j][1]) {
                    int[] swap = vals[j];
                    vals[j] = vals[j + 1];
                    vals[j + 1] = swap;
                }

            }
        }
        for (int i = 0; i < vals.length; i++) {
            for (int j = 0; j < vals.length - i - 1; j++) {
                if (vals[j + 1][1] == vals[j][1]) {
                    if (vals[j + 1][0] > vals[j][0]) {
                        int[] swap = vals[j];
                        vals[j] = vals[j + 1];
                        vals[j + 1] = swap;
                    }
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < vals.length; i++) {
            if(vals[i][0]!=0){
                result.add(vals[i][0]);
            }
        }
        return result;
    }

}
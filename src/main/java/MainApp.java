import problems.Task1333;
public class MainApp {
    public static void main (String[] args) {

        int[][] restaurants = {{1, 4, 1, 40, 10}, {2, 8, 0, 50, 5}, {3, 8, 1, 30, 4}, {4, 10, 0, 10, 3}, {5, 1, 1, 15, 1}};
        System.out.println(Task1333.filterRestaurants(restaurants, 1, 50, 10));

    }
}

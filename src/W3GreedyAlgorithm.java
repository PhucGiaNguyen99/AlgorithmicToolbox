public class W3GreedyAlgorithm {
    public static int maxLoot(int[] c, int[] w, int W) {
        int i = 0;
        int totalValue = 0;
        while (W - w[i] > 0) {
            totalValue += c[i] * w[i];
            System.out.println("Increment: " + c[i] * w[i]);
            W -= w[i];
            System.out.println("w: " + W);
            // increment i
            i++;
        }

        totalValue += c[i] * W;

        return totalValue;
    }


    public static void main(String[] args) {
        int[] c = {5000, 200, 10};
        int[] w = {4, 3, 5};
        System.out.println(maxLoot(c, w, 9));
    }
}

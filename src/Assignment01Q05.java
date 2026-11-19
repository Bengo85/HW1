public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        if (i == j) return 0;
        int length = m.length;

        int[] distances = new int[length];
        for (int k = 0; k < length; k++) {
            distances[k] = -1;
        }

        int[] queue = new int[length];
        int head = 0;
        int tail = 0;

        distances[i] = 0;
        queue[tail++] = i;

        while (head < tail) {
            // Every node is visited at most once so we don't need % for the "queue" array
            int current = queue[head++]; // Like dequeue, get first in line and increment head index

            for (int next = 0; next < length; next++) {
                if (m[current][next] == 1 && distances[next] == -1) {
                    distances[next] = distances[current] + 1;
                    if (next == j) return distances[next];

                    queue[tail++] = next; // enqueue next and increment tail index
                }
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}
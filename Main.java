
  import java.util.*;

public class Main {

    public static String findKthUniqueString(List<String> strings, int k) {
        Map<String, Integer> countMap = new LinkedHashMap<>();

        // Count occurrences while preserving insertion order
        for (String s : strings) {
            countMap.put(s, countMap.getOrDefault(s, 0) + 1);
        }

        int uniqueCount = 0;
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueCount++;
                if (uniqueCount == k) {
                    return entry.getKey();
                }
            }
        }

        return "-1"; // Not enough unique strings
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> strings = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            strings.add(scanner.nextLine().trim());
        }

        int k = Integer.parseInt(scanner.nextLine());

        System.out.println(findKthUniqueString(strings, k));
    }
}



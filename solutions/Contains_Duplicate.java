import java.util.HashSet;

public class Contains_Duplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(
                new int[]{1, 2, 3, 1}));
    }
        public static boolean containsDuplicate(int[] nums) {
            HashSet<Integer> found = new HashSet<>();
            for (int n : nums) {
                if (!found.add(n)) {
                    return true;
                }
            }

            return false;
        }
    }

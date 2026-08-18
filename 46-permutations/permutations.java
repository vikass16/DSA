import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        // Convert the input array into an ArrayList for the helper function
        ArrayList<Integer> up = new ArrayList<>();
        for (int num : nums) {
            up.add(num);
        }
        return permStr(new ArrayList<>(), up);
    }

    public static List<List<Integer>> permStr(ArrayList<Integer> p, ArrayList<Integer> up) {
        List<List<Integer>> list = new ArrayList<>();
        
        // Base case: if no unprocessed elements remain, add the permutation to the result
        if (up.isEmpty()) {
            list.add(new ArrayList<>(p)); 
            return list;
        }

        // Get the first unprocessed element
        int ch = up.get(0);
        
        // Create copies of the sublist to prevent concurrent modification issues
        for (int i = 0; i <= p.size(); i++) {
            ArrayList<Integer> left = new ArrayList<>(p.subList(0, i));
            ArrayList<Integer> right = new ArrayList<>(p.subList(i, p.size()));
            
            // Reconstruct the new 'p' list with 'ch' inserted in the middle
            ArrayList<Integer> nextP = new ArrayList<>(left);
            nextP.add(ch);
            nextP.addAll(right);

            // Get the remaining unprocessed elements
            ArrayList<Integer> nextUp = new ArrayList<>(up.subList(1, up.size()));

            // Recursively solve and combine results
            list.addAll(permStr(nextP, nextUp));
        }
        return list;
    }
}

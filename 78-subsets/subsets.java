class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        // Creating List of List (Outer list [])
        List<List<Integer>> outer = new ArrayList<>();

        // Creating and Empty list inside outer list like this ( [[]] )
        outer.add(new ArrayList<>());
        
        // Now for Each Element in the Array i have to create one more internal list which must copy the previous list and Add current number of array in that list.
        /* like for number 1 
        Before it was like [[]] and now it will be like [[], [1]] i have created copy of previous list and add 1 into it.
        for number 2
        before [[],[1]] after [[],[1],  [2],[1,2]] i have copy of previous list of same size of that list and add 2 in it.
        */

        for(int num: nums){
            int n = outer.size();
            for(int i=0; i<n; i++){
                // Creating an internal list of size of Previous list
                ArrayList<Integer> internal = new ArrayList<>(outer.get(i));
                // Adding the current number into internal list
                internal.add(num);
                // now adding internal list into main(outer) list.
                outer.add(internal);

            }
        }
        return outer;
    }
}
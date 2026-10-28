// class Solution {
//     public boolean rotateString(String s, String goal) {
//         if(goal.length() < s.length()){
//             return false;
//         }
//         s = s.repeat(2);

//         if(s.contains(goal)){
//             return true;
//         }
//         return false;
//     }
// }

// class Solution {
//     public boolean rotateString(String s, String goal) {
//         if(s.length() > goal.length()){
//             return false;
//         }
//         s = s.repeat(2);

//         if(s.contains(goal)){
//             return true;
//         }
//         return false;
//     }
// }

class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        
        String str = s+s;

        return str.contains(goal);
    }
}
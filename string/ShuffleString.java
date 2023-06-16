class Solution {
    public String restoreString(String s, int[] indices) {
        // Get the length of the indices array
        int len = indices.length;

        // Create a character array to store the restored string
        char[] ch = new char[len];

        // Iterate over the indices array
        for (int i = 0; i < len; ++i) {
            // Place the character at the correct position in the restored string
            // based on the corresponding index from the indices array
            ch[indices[i]] = s.charAt(i);
        }

        // Convert the character array to a string and return the restored string
        return String.valueOf(ch);
    }
}


/*
String s = "code";
int[] indices = {3, 1, 2, 0};
In this example, the original string is "code", and the indices array represents the desired positions of each character in the restored string.

Initialize the variables:

len is set to the length of the indices array, which is 4.
Create a character array ch of size len, which is also 4.
Iterate over the indices array:

In the first iteration, i is 0. The value of indices[i] is 3. It means that the character at index 0 of the original string (s.charAt(0)) should be placed at index 3 in the restored string (ch[3]). So, the character 'c' is placed at index 3 in the ch array: ch[3] = 'c'.
In the second iteration, i is 1. The value of indices[i] is 1. It means that the character at index 1 of the original string (s.charAt(1)) should be placed at index 1 in the restored string (ch[1]). So, the character 'o' is placed at index 1 in the ch array: ch[1] = 'o'.
In the third iteration, i is 2. The value of indices[i] is 2. It means that the character at index 2 of the original string (s.charAt(2)) should be placed at index 2 in the restored string (ch[2]). So, the character 'd' is placed at index 2 in the ch array: ch[2] = 'd'.
In the fourth iteration, i is 3. The value of indices[i] is 0. It means that the character at index 3 of the original string (s.charAt(3)) should be placed at index 0 in the restored string (ch[0]). So, the character 'e' is placed at index 0 in the ch array: ch[0] = 'e'.
After iterating over the indices array, the ch array becomes ['e', 'o', 'd', 'c'].

Finally, convert the ch character array to a string using String.valueOf(ch). In this case, it becomes "eodc", which is the restored string.
So, the output of the restoreString method for the given example would be "eodc".
 */
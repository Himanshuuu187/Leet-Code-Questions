// 151. Reverse Words in a String
// Medium
// Topics
// premium lock icon
// Companies
// Given an input string s, reverse the order of the words.

// A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

// Return a string of the words in reverse order concatenated by a single space.

// Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

 

// Example 1:

// Input: s = "the sky is blue"
// Output: "blue is sky the"
// Example 2:

// Input: s = "  hello world  "
// Output: "world hello"
// Explanation: Your reversed string should not contain leading or trailing spaces.
// Example 3:

// Input: s = "a good   example"
// Output: "example good a"



public class Q8 {

    public static void main(String[] args) {
        String s1 = "the sky is blue";
        String s2 = "  hello world  ";
        String s3 = "a good   example";

        // Reverse mode (LeetCode version)
        System.out.println(reverseWords(s1, false)); // Output: blue is sky the
        System.out.println(reverseWords(s2, false)); // Output: world hello
        System.out.println(reverseWords(s3, false)); // Output: example good a

        // Bubble sort mode (for learning)
        System.out.println(reverseWords(s1, true));  // Output: blue is sky the (alphabetically sorted)
        System.out.println(reverseWords(s2, true));  // Output: hello world
        System.out.println(reverseWords(s3, true));  // Output: a example good
    }

    public static String reverseWords(String s, boolean useBubbleSort) {
        String[] words = s.trim().split("\\s+");

        if (useBubbleSort) {
            // Bubble Sort (Alphabetical Order)
            for (int i = 0; i < words.length - 1; i++) {
                for (int j = 1; j < words.length - i; j++) {
                    if (words[j - 1].compareTo(words[j]) > 0) {
                        String temp = words[j - 1];
                        words[j - 1] = words[j];
                        words[j] = temp;
                    }
                }
            }
        } else {
            // Reverse Order (LeetCode requirement)
            reverseArray(words);
        }

        return String.join(" ", words);
    }

    private static void reverseArray(String[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}

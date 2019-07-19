package codingbat;

public class WarmUp2 {

    /*Given a string and a non-negative int n, return a larger string that is n copies of the original string.
     */
    public static String stringTimes(String str, int n) {
        StringBuilder temp = new StringBuilder("");
        for (int i = 0; i < n; i++){
            temp.append(str);
        }
        return temp.toString();
    }

    /*Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
    * or whatever is there if the string is less than length 3. Return n copies of the front;
     */
    public static String frontTimes(String str, int n) {
        StringBuilder temp = new StringBuilder("");
        int a = str.length();
        for (int i = 0; i < n; i++){
            if (a >= 3){
                temp.append(str.substring(0,3));
            }else{
                temp.append(str.substring(0,a));
            }
        }
        return temp.toString();
    }
    /* Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
     */
   public static int countXX(String str) {
        int a = str.length();
        int count = 0;
        char x = 'x';
        for (int i = 0; i < (a-1); i++){
            if ((str.charAt(i) == x) && (str.charAt(i+1) == x)){
                count += 1;
            }
        }
        return count;
    }
    /* Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
     */

    public static boolean doubleX(String str) {
        int length = str.length();
        if (length < 2)
            return false;
        int index = str.indexOf('x');
        if (index + 1 >= length)
            return false;
        return str.charAt(index + 1) == 'x';
    }

    /* Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
     */
    public static String stringBits(String str) {
        StringBuilder temp = new StringBuilder("");
        int a = str.length();
        for (int i = 0; i < a && a >= 2; i += 2){
            temp.append (str.charAt(i));
        }
        return temp.toString();
    }
    /* Given a non-empty string like "Code" return a string like "CCoCodCode".
     */
    public static String stringSplosion(String str) {
        String temp = "";
        int length = str.length();
        if (length < 2 )
            return temp = str;

        for(int i =  0; i < length;i++){
            temp = str.substring(0,length - i) + temp;
        }
        return temp;
    }
    /* Given an array of ints, return the number of 9's in the array.
     */
    public static int arrayCount9(int[] nums) {
        int length = nums.length;
        int count = 0;
        for (int i = 0; i < length;i++){
            if (nums[i] == 9)
                count++;
        }
        return count;
    }
    /* Given an array of ints, return true if one of the first 4 elements in the array is a 9.
    * The array length may be less than 4.
     */
    public static boolean arrayFront9(int[] nums) {
        boolean result = false;
        for (int i = 0; i < nums.length && i < 3;i++){
            if (nums[i] == 9)
                result = true;
        }
        return result;
    }
    /* Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
     */
    public static boolean array123(int[] nums) {
        int length = nums.length;
        boolean numbers = false;
        if (length < 2)
            return false;
        for(int i = 0; i < length - 2;i++){
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3)
                return true;
        }
        return false;
    }
    /*  Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
    * So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
     */
    public static int stringMatch(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();
        int count = 0;
        if (aLength < 2 || bLength < 2)
            return count;

        for(int i = 0; i < aLength - 1 && i < bLength - 1;i++){
            if (a.substring(i,i + 2).equals(b.substring(i, i + 2)))
                count++;
        }
        return count;
    }

    /* Given a string, return a version where all the "x" have been removed.
    * Except an "x" at the very start or end should not be removed.
     */
    public static String stringX(String str) {
        int length = str.length();
        String newStr = "";
        if (length < 3)
            return str;
        for (int i = 0; i < length;i++){
            if (str.charAt(i) != 'x'){
                newStr += str.charAt(i);
            }else{
                if (i == 0 || i == length - 1)
                    newStr += str.charAt(i);
            }
        }
        return newStr;
    }
    /* Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
     */
    public static String altPairs(String str) {
        int length = str.length();
        String temp = "";
        for(int i = 0; i < length; i += 4){
            temp +=str.charAt(i);
            if (i + 1 < length)
                temp += str.charAt(i+1);
        }
        return temp;
    }
    /* Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed,
    * but the "a" can be any char. The "yak" strings will not overlap.
     */
    public static String stringYak(String str) {
        return str.replaceAll("yak","");
    }
    /* Given an array of ints, return the number of times that two 6's are next to each other in the array.
     * Also count instances where the second "6" is actually a 7.
     */
    public static int array667(int[] nums) {
        int length = nums.length;
        int count = 0;
        for(int i = 0; i < length - 1;i++){
            if (nums[i] == 6 && (nums[i+1] ==6 || nums[i+1] == 7) )
                count++;
        }
        return count;
    }
    /*Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
    * Return true if the array does not contain any triples.
     */
    public static boolean noTriples(int[] nums) {
        int length = nums.length;
        for(int i = 0; i < length - 2; i++){
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2])
                return false;
        }
        return true;
    }
    /* Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5,
     * followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.
     */
    public static boolean has271(int[] nums) {
        int length = nums.length;
        for(int i = 0; i < length - 2;i++ ){
            int aDiffers = nums[i + 1] - nums[i]; // 1 differs
            int bDiffers = nums[i + 2] - nums[i]; //2 differs

            if (aDiffers == 5 && bDiffers <= 1 && bDiffers >= -3)
                return true;
        }
        return false;
    }
}

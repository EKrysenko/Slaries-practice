package warmup;

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
    int countXX(String str) {
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
    boolean doubleX(String str) {

        return (str.length() >= 2) && ((str.length()-1) > str.indexOf('x')) && ('x' == str.charAt(str.indexOf('x') + 1)); //
    }

}

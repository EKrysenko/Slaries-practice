package codingbat;

public class String1 {

    /*Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
     */
    public static String helloName(String name) {
        return name = "Hello " + name + "!";
    }

    /*Given two strings, a and b,
    * return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
     */
    public static String makeAbba(String a, String b) {
        return a = a+b+b+a;
    }

    /* The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
    * In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
    */
    public static String makeTags(String tag, String word) {
        return word = "<" + tag + ">" + word + "</" + tag + ">";
    }

    /* Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle
    * of the out string, e.g. "<<word>>".
    * Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
    */
    public static String makeOutWord(String out, String word) {
        return word = out.substring(0,2) + word + out.substring(2,out.length());
    }

    /* Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
    * The string length will be at least 2.
    */
    public static String extraEnd(String str) {
        int length = str.length();
        if (length > 2)
            return str = str.substring(length - 2, length) + str.substring(length - 2, length) + str.substring(length - 2, length);
        else
            return str = str+str+str;
    }

    /*Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
    * If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string ""
    * yields the empty string "". Note that str.length() returns the length of a string.
     */
    public static String firstTwo(String str) {
        if(str.length()>2)
            return str = str.substring(0,2);
        else
            return str;
    }

    /* Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
     */
    public static String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    /* Given a string,
     * return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.
     */
    public static String withoutEnd(String str) {
        return str.substring(1,str.length()-1);
    }

    /* Given 2 strings, a and b, return a string of the form short+long+short,
    * with the shorter string on the outside and the longer string on the inside.
    * The strings will not be the same length, but they may be empty (length 0).
    */
    public static String comboString(String a, String b) {
        if(a.length() > b.length())
            return a = b + a + b;
        else
            return a = a + b + a;
    }
    /* Given 2 strings, return their concatenation, except omit the first char of each.
     * The strings will be at least length 1.
     */
    public static String nonStart(String a, String b) {
        return a = a.substring(1,a.length()) + b.substring(1,b.length());
    }
    /*Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
     * The string length will be at least 2.
     */
    public static String left2(String str) {
        if(str.length() >= 3)
            return str = str.substring(2,str.length()) + str.substring(0,2);
        else
            return str;
    }

    /*Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
     * The string length will be at least 2.
     */
    public static String right2(String str) {
        int length = str.length();
        if(length >= 3)
            return str = str.substring(length - 2,length) + str.substring(0,length - 2);
        else
            return str;
    }
}

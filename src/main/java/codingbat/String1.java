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
        if (length > 2) {
            return str = str.substring(length - 2, length) + str.substring(length - 2, length) + str.substring(length - 2, length);
        }else{
            return str+str+str;
        }
    }

    /*Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
    * If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string ""
    * yields the empty string "". Note that str.length() returns the length of a string.
     */
    public static String firstTwo(String str) {
        if(str.length()>2) {
            return str = str.substring(0, 2);
        }else {
            return str;
        }
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
        if(a.length() > b.length()) {
            return a = b + a + b;
        } else {
            return a = a + b + a;
        }
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
        if(str.length() >= 3) {
            return str = str.substring(2, str.length()) + str.substring(0, 2);
        }else {
            return str;
        }
    }

    /*Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
     * The string length will be at least 2.
     */
    public static String right2(String str) {
        int length = str.length();
        if(length >= 3) {
            return str = str.substring(length - 2, length) + str.substring(0, length - 2);
        }else {
            return str;
        }
    }

    /*Given a string, return a string length 1 from its front,
    * unless front is false, in which case return a string length 1 from its back. The string will be non-empty.
     */
    public String theEnd(String str, boolean front) {
        int length = str.length();
        if (front) {
            return str.substring(0, 1);
        }else {
            return str.substring(length - 1, length);
        }
    }

    /*Given a string, return a version without both the first and last char of the string.
    * The string may be any length, including 0.
     */
    public String withouEnd2(String str) {
        int length = str.length();
        if (length == 1) {
            return str.substring(0, length - 1);
        }
        if (length >= 2) {
            return str.substring(1, length - 1);
        } else {
            return str;
        }
    }

    /* Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri".
    * The string length will be at least 2.
     */
    public String middleTwo(String str) {
        int middle = str.length() / 2;
        return str.substring(middle - 1, middle + 1);
    }

    /*Given a string, return true if it ends in "ly".
     */
    public boolean endsLy(String str) {
        int length = str.length();
        if (length > 1) {
            return "ly".equals(str.substring(length - 2));
        }else {
            return false;
        }
    }

   /* Given a string and an int n, return a string made of the first and last n chars from the string.
    * The string length will be at least n.
    */
   public String nTwice(String str, int n) {
       int length = str.length();
       return str.substring(0,n) + str.substring(length - n, length);
   }

    /*Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and".
    * The string length will be at least 3.
     */
    public String middleThree(String str) {
        int middle = str.length()/2;
        return str.substring(middle - 1,middle + 2);
    }

    /*Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx".
    * The string may be any length, including 0. Note: use .equals() to compare 2 strings.
     */
    public boolean hasBad(String str) {
        int length = str.length();
        if (length == 3) {
            return "bad".equals(str.substring(0, 3));
        }
        if (length > 3) {
            return "bad".equals(str.substring(0, 3)) || "bad".equals(str.substring(1, 4));
        } else {
            return false;
        }
    }

    /* Given a string, return a string length 2 made of its first 2 chars.
     * If the string length is less than 2, use '@' for the missing chars.
     */
    public String atFirst(String str) {
        int length = str.length();
        if (length < 1){
            return ("@@");
        }
        if (length == 1){
            return str.substring(0,1)+("@");
        }
        else{
            return  str.substring(0,2);
        }
    }

    /* Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya".
     * If either string is length 0, use '@' for its missing char
     */
    public String lastChars(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();
        String result;
        if(aLength > 0){
            result = a.substring(0,1);
        }else{
            result = "@";
        }
        if( bLength > 0){
            result += b.substring(bLength - 1, bLength);
        }else{
            result += "@" ;
        }
        return result;
    }

    /*
    Given two strings, append them together (known as "concatenation") and return the result.
    * However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
     */
    public String conCat(String a, String b) {
        if (a.length() == 0 || b.length() == 0)
            return a+b;
        if ((a.substring(a.length() - 1, a.length())).equals(b.substring(0,1)))
            return a + b.substring(1,b.length());
        else
            return a+b;
    }

    /* Given a string of any length, return a new string where the last 2 chars,
     * if present, are swapped, so "coding" yields "codign".
     */
    public String lastTwo(String str) {
        int length = str.length();
        String result = "";
        if (length >= 2){
            result = str.substring(0,length - 2) + str.substring(length - 1, length) + str.substring(length - 2, length - 1);
        }else{
            result = str;
        }
        return result;
    }
    /* Given a string,
     * if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
     */
    public String seeColor(String str) {
        int length = str.length();
        String result = "";
        if (length > 3 && ("blue").equals(str.substring(0,4))){
            result = "blue";
        }
        if (length >= 3 && ("red").equals(str.substring(0,3))){
            result = "red";
        }
        return result;
    }

    /* Given a string,
     * return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".
     */
    public boolean frontAgain(String str) {
        int length = str.length();

        if(length > 1 && (str.substring(0,2)).equals(str.substring(length - 2, length))      ){
            return true;
        }else{
            return false;
        }
    }
    /* Given two strings, append them together (known as "concatenation") and return the result.
     * However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string.
     * So "Hello" and "Hi" yield "loHi". The strings may be any length.
     */
    public String minCat(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();
        if(aLength >= bLength){
            return a.substring(aLength - bLength,aLength) + b;
        }else{
            return a + b.substring(bLength - aLength,bLength);
        }
    }
    /* Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
     * The string may be any length. If there are fewer than 2 chars, use whatever is there.
     */

    public String extraFront(String str) {
        int length = str.length();
        if (length > 1){
            return str.substring(0,2) + str.substring(0,2) + str.substring(0,2);
        }else{
            return str + str + str;
        }
    }

    /* Given a string, if a length 2 substring appears at both its beginning and end,
     * return a string without the substring at the beginning, so "HelloHe" yields "lloHe".
     * The substring may overlap with itself, so "Hi" yields "".
     * Otherwise, return the original string unchanged.
     */
    public String without2(String str) {
        int length = str.length();
        if (length < 3 && length > 1){
            return "";
        }
        if (length > 2 && (str.substring(0,2)).equals(str.substring(length - 2, length))){
            return str.substring(2,length);
        }else{
            return str;
        }
    }
    /*Given a string, return a version without the first 2 chars.
     * Except keep the first char if it is 'a' and keep the second char if it is 'b'.
     * The string may be any length. Harder than it looks.
     */
    public String deFront(String str) {
        int length = str.length();
        String result = "";
        if ( length > 2){
            result = str.substring(2, length);
        }
        if (str.charAt(1) == 'b'){
            result = "b" + result;
        }
        if (str.charAt(0) == 'a'){
            result = "a" + result;
        }
        return result;
    }
    /*Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string,
     * except its first char does not need to match exactly.
     * On a match, return the front of the string, or otherwise return the empty string.
     * So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip".
     * The word will be at least length 1.
     */
    public String startWord(String str, String word) {
        int lenthStr = str.length();
        int lenthWord = word.length();
        if (lenthStr == 0){
            return "";}
        if (lenthWord > lenthStr){
            return "";}
        if (lenthWord == 1) {
            return str.substring(0, 1);
        }else
        if (str.substring(1, lenthWord).equals(word.substring(1, lenthWord)))
            return str.substring(0, lenthWord);
        else{
            return "";
        }
    }
    /*Given a string, if the first or last chars are 'x', return the string without those 'x' chars,
     * and otherwise return the string unchanged.
     */
    public String withoutX(String str) {
        int length = str.length();
        String result = "";
        if (str.length() == 0){
            return str;
        }
        if (length >= 2 && str.charAt(length-1) == 'x'){
            result = str.substring(0,length - 1);
        } else{
            result = str;
        }
        if (result.charAt(0) == 'x' && result.length() > 0){
            result = result.substring(1,result.length());
        }
        return result;
    }
    /*Given a string, if one or both of the first 2 chars is 'x', return the string without those
     * 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.
     */
    public String withoutX2(String str) {
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            if (i == 0 && str.charAt(i) != 'x')
                temp += str.charAt(i);
            else if (i == 1 && str.charAt(i) != 'x')
                temp += str.charAt(i);
            else if (i > 1)
                temp += str.charAt(i);
        }
        return temp;
    }

    /*Given a string and an index, return a string length 2 starting at the given index.
     * If the index is too big or too small to define a string length 2, use the first 2 chars. The string length will be at least 2.
     */
    public String twoChar(String str, int index) {
        if (str.length() <= index + 1 || index < 0)
            return str.substring(0,2);
        else
            return str.substring(index, index + 2);
    }

}

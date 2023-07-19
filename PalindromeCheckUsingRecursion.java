public class a83PalindromeCheckUsingRecursion {
    public static boolean check_palindrome(String str, int start, int end)
    {
        if(start>=end)
            return true;
        return (str.charAt(start)==str.charAt(end)&&check_palindrome(str,start+1,end-1));
    }
    public static void main(String[] args) {
        String s = "ROTATOR";
        System.out.println(check_palindrome(s,0,s.length()-1));
    }
}

package SwordToOffer.chapter1;

public class AddTwoBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("1010",
                                     "110"));
    }


    public static String addBinary(String a, String b) {
        int p1 = a.length() - 1;
        int p2 = b.length() - 1;
        String result = "";
        int carry = 0;
        while (p1 >= 0 && p2 >= 0) {
            int n1 = a.charAt(p1--) - '0';
            int n2 = b.charAt(p2--) - '0';
            int n = (n1 + n2 + carry) % 2;
            carry = (n1 + n2 + carry) / 2;
            result = n + result;
        }
        while (p1 >= 0 || p2 >= 0) {
            int n1 = p1 >=0 ? a.charAt(p1--) - '0' : a.charAt(p2--) - '0';
            int n = (n1 + carry) % 2;
            carry = (n1 + carry) / 2;
            result = n + result;
        }
        if (carry > 0) {
            result = carry + result;
        }
        return result;
    }
}

package SwordToOffer.chapter1;
// 1.没有考虑正负数
// 2.没有考虑边界值
public class IntegerDivision {
    public static int integerDivision(int a, int b) {
        int result = 0;
        if (a == 0) {
            return result;
        }

        while (a >= b) {
            int tmp = b;
            int n = 1;
            while (a >= (tmp + tmp)) {
                tmp = tmp + tmp;
                n = n + n;
            }
            result += n;
            a -= tmp;
        }
        return result;
    }

    public static void main(String[] args) {
        int a = -Integer.MIN_VALUE;
        System.out.printf(a + "");
    }
}

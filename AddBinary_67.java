import java.math.BigInteger;

class AddBinary_67 {
    public static String addBinary2(String a, String b) {
        BigInteger x = new BigInteger(a, 2);
        BigInteger y = new BigInteger(b, 2);
        BigInteger zero = new BigInteger("0", 2);
        BigInteger carry, answer;
        while (y.compareTo(zero) != 0) {
            answer = x.xor(y);
            carry = x.and(y).shiftLeft(1);
            x = answer;
            y = carry;
        }
        return x.toString(2);
    }


    public static String addBinary(String a, String b) {
        int n = a.length(), m = b.length();
        if (n < m) return addBinary(b, a);
        int L = Math.max(n, m);

        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int j = b.length() - 1;
        for (int i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i) == '1') carry++;
            if (j >= 0 && b.charAt(j--) == '1') carry++;

            if (carry % 2 == 0) { // two ones
                sb.append('0');

            } else {
                sb.append('1');
            }

            carry /= 2;
        }
        if (carry == 1) sb.append('1');
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("1111", "10"));
//        System.out.println(addBinary2("1001", "1111"));
    }
}

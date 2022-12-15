public class LogicOperations {
    public static void main(String[] args) {
        int x = 145, y = 9000, z = 16;
        int res1;
        int res2;
        int res3;
        int res4;
        int res5;
        res1 = x += y >> x++ * z;
        res2 = z = ++x & y * 5;
        res3 = y /= x + 5 | z;
        res4 = z = x++ & y * 5;
        res5 = x = y << x++ ^ z;
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
        System.out.println(res5);
    }
}

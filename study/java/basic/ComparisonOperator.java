package basic;

public class ComparisonOperator {
    public static void main(String[] args) {

        int x = 1;
        int y = 2;

        boolean result = true;

        result = x > y;
        System.out.println(result);
        result = x < y;
        System.out.println(result);
        result = x == y;
        System.out.println(result);
        result = x != y;
        System.out.println(result);


        // 예상 출력:
//        x가 y보다 큰가? false
//        x가 y보다 작은가? true
//        x와 y가 같은가? false
//        x와 y가 다른가? true
    }
}

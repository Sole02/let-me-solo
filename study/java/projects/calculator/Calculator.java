package projects.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private List<Integer> resultList = new ArrayList<>();

    public List<Integer> getResultList() {
        return resultList;
    }

    public void setResultList(List<Integer> resultList) {
        this.resultList = resultList;
    }

    public void removeResult() {
        this.resultList.remove(0);
    }

    public int calculate(int num1, int num2, char operator) {

        int result = 0;

        if (operator == '+') {
            result = num1 + num2;

        } else if (operator == '-') {
            result = num1 - num2;

        } else if (operator == '*') {
            result = num1 * num2;

        } else if (operator == '%') {
            if (num2 == 0) {
                throw new ArithmeticException("두번째 정수에 0이 입력될 수 없습니다.");
            } else {
                result = num1 % num2;
            }

        } else if (operator == '/') {
            if (num2 == 0) {
                throw new ArithmeticException("두번째 정수에 0이 입력될 수 없습니다.");
            } else {
                result = num1 / num2;
            }

        } else {
            throw new IllegalArgumentException("지원하지 않는 기호입니다.");
        }
        resultList.add(result);
        return result;
    }

}

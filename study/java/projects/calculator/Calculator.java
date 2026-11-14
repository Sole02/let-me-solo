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

    public int calculate(int num1, int num2, OperatorType type) {

        int result = 0;

        if (type == OperatorType.ADDITION) {
            result = num1 + num2;

        } else if (type == OperatorType.SUBTRACTION) {
            result = num1 - num2;

        } else if (type == OperatorType.MULTIPLICATION) {
            result = num1 * num2;

        } else if (type == OperatorType.REMAINDER) {
            if (num2 == 0) {
                throw new ArithmeticException("두번째 정수에 0이 입력될 수 없습니다.");
            } else {
                result = num1 % num2;
            }

        } else if (type == OperatorType.DIVISION) {
            if (num2 == 0) {
                throw new ArithmeticException("두번째 정수에 0이 입력될 수 없습니다.");
            } else {
                result = num1 / num2;
            }
        }

        resultList.add(result);
        return result;
    }

}

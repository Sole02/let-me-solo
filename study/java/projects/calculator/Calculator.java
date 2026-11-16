package projects.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator<T extends Number> {

    private List<Double> resultList = new ArrayList<>();

    public List<Double> getResultList() {
        return new ArrayList<>(resultList);
    }

    public void clearResults() {
        this.resultList.clear();
    }

    public void removeFirstResult() {
        this.resultList.remove(0);
    }

    public double calculate(T num1, T num2, OperatorType type) {

        double result = 0;

        if (type == OperatorType.ADDITION) {
            result = num1.doubleValue() + num2.doubleValue();

        } else if (type == OperatorType.SUBTRACTION) {
            result = num1.doubleValue() - num2.doubleValue();

        } else if (type == OperatorType.MULTIPLICATION) {
            result = num1.doubleValue() * num2.doubleValue();

        } else if (type == OperatorType.REMAINDER) {
            if (num2.doubleValue() == 0) {
                throw new ArithmeticException("두번째 숫자에 0이 입력될 수 없습니다.");
            } else {
                result = num1.doubleValue() % num2.doubleValue();
            }

        } else if (type == OperatorType.DIVISION) {
            if (num2.doubleValue() == 0) {
                throw new ArithmeticException("두번째 숫자에 0이 입력될 수 없습니다.");
            } else {
                result = num1.doubleValue() / num2.doubleValue();
            }
        }

        resultList.add(result);
        return result;
    }

    public List<Double> getResultsGreaterThan(double threshold) {

        List<Double> greaterResults = resultList
                .stream()
                .filter(result -> result > threshold)
                .toList();
        return greaterResults;
    }

}

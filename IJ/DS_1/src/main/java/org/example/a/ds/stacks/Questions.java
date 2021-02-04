package org.example.a.ds.stacks;

public class ShuntingYard {
    private MyStack<String> operationStack;
    private MyStack<Double> valueStack;

    public ShuntingYard() {
        operationStack = new ListStack<>();
        valueStack = new ArrayFirstStack<>();
    }

    public void interpretExpression(String expression) {
        String[] expressionArray = expression.split(" ");
        for (String s : expressionArray) {
            switch (s) {
                case "(":
                    break;
                case "+": case "-": case "*": case "/":
                    operationStack.push(s);
                    break;
                case ")":
                    executeOperation(operationStack.pop());
                    break;
                default:
                    valueStack.push(Double.parseDouble(s));
            }
        }
    }

    private void executeOperation(String operation) {
        switch (operation) {
            case "+":
                valueStack.push(valueStack.pop() + valueStack.pop());
                break;
            case "-":
                valueStack.push(valueStack.pop() + valueStack.pop());
                break;
            case "*":
                valueStack.push(valueStack.pop() + valueStack.pop());
                break;
            case "/":
                valueStack.push(valueStack.pop() + valueStack.pop());
                break;
            default:
                break;
        }
    }

    public double result() {
        return valueStack.pop();
    }
}

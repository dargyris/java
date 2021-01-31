package org.example.zerholc.stk;

/* Dijkstra's interpreter'
/  Parsing math expressions
**/

public class ShuntingYard {
    private MyStack<String> operationStack;
    private MyStack<Double> valueStack;

    public ShuntingYard() {
        operationStack = new StackList<>();
        valueStack = new ArrayFirst<>();
    }

    public void interpretExpression(String expression) {
        String[] expressionArray = expression.split(" ");
        for (String s : expressionArray) {
            switch (s) {
                case "(":
                    break;
                case "+":
                    operationStack.push(s);
                    break;
                case "-":
                    operationStack.push(s);
                    break;
                case "*":
                    operationStack.push(s);
                    break;
                case "/":
                    operationStack.push(s);
                    break;
                case ")":
                    String operation = operationStack.pop();
                    switch (operation) {
                        case "+":
                            valueStack.push(valueStack.pop() + valueStack.pop());
                            break;
                        case "-":
                            valueStack.push(valueStack.pop() - valueStack.pop());
                            break;
                        case "*":
                            valueStack.push(valueStack.pop() * valueStack.pop());
                            break;
                        case "/":
                            valueStack.push(valueStack.pop() / valueStack.pop());
                            break;
                        default:
                            break;
                    }
                    break;
                default:
                    valueStack.push(Double.parseDouble(s));
            }
        }
    }

    public void result() {
        System.out.println(valueStack.pop());
    }
}

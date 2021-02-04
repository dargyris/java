package org.example.a.ds.stacks;

public class Questions {
    class QueueWithOneStack {
        private MyStack<Integer> queueStack;

        public QueueWithOneStack() {
            queueStack = new ListStack<>();
        }

        public void enqueue(int item) {
            queueStack.push(item);
        }

        // In reality I am utilizing the call stack of the application instead of creating a second stack.
        public int dequeue() {
            if (queueStack.size() == 1) {
                return queueStack.pop();
            }

            int item = queueStack.pop();
            int lastDequeuedItem = dequeue();
            enqueue(item);
            return lastDequeuedItem;
        }
    }

    class QueueWithStacks {
        private MyStack<Integer> enqueueStack;
        private MyStack<Integer> dequeueStack;

        public QueueWithStacks() {
            enqueueStack = new ArrayLastStack<>();
            dequeueStack = new ArrayFirstStack<>();
        }

        public void enqueue(int item) {
            enqueueStack.push(item);
        }

        public int dequeue() {
            if (enqueueStack.isEmpty() && dequeueStack.isEmpty()) {
                throw new RuntimeException("Stacks are empty.");
            }

            if (dequeueStack.isEmpty()) {
                while (!enqueueStack.isEmpty()) {
                    dequeueStack.push(enqueueStack.pop());
                }
            }
            return dequeueStack.pop();
        }
    }

    class MaxItemStack {
        private MyStack<Integer> mainStack;
        private MyStack<Integer> maxStack;

        public MaxItemStack() {
            this.mainStack = new ListStack<>();
            this.maxStack = new ArrayLastStack<>();
        }

        public void push(int item) {
            mainStack.push(item);
            if (mainStack.size() == 1) {
                maxStack.push(item);
                return;
            }

            if (item > maxStack.peek()) {
                maxStack.push(item);
            } else {
                maxStack.push(maxStack.peek());
            }
        }

        public int pop() {
            maxStack.pop();
            return mainStack.pop();
        }

        public int getMaxItem() {
            return maxStack.peek();
        }
    }

    class ShuntingYard {
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
                    case "+":
                    case "-":
                    case "*":
                    case "/":
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
    }

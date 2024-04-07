import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int lenStudents = students.length;
        Queue<Integer> studentsQueue = new LinkedList<>();
        Stack<Integer> foodStack = new Stack<>();

        for (int i = 0; i < lenStudents; i++) {
            studentsQueue.offer(students[i]);
            foodStack.push(sandwiches[lenStudents - 1 - i]);
        }

        int counter = 0;
        while (counter < foodStack.size()) {
            if (studentsQueue.peek().equals(foodStack.peek())) {
                studentsQueue.poll();
                foodStack.pop();
                counter = 0;
            } else {
                int deqVal = studentsQueue.poll();
                studentsQueue.offer(deqVal);
                counter++;
            }
        }

        return counter;
    }
}

class MyStack {
    private Queue<Integer> mainQueue;
    private Queue<Integer> tempQueue;

    public MyStack() {
        mainQueue = new LinkedList<>();
        tempQueue = new LinkedList<>();
    }

    public void push(int x) {
        tempQueue.offer(x);
        while (!mainQueue.isEmpty()) {
            tempQueue.offer(mainQueue.poll());
        }
        Queue<Integer> temp = mainQueue;
        mainQueue = tempQueue;
        tempQueue = temp;
    }

    public int pop() {
        if (mainQueue.isEmpty()) {
            return -1; // Return a default value for an empty stack
        }
        return mainQueue.poll();
    }

    public int top() {
        if (mainQueue.isEmpty()) {
            return -1; // Return a default value for an empty stack
        }
        return mainQueue.peek();
    }

    public boolean empty() {
        return mainQueue.isEmpty();
    }
}
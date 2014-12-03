/**
 * DoubleStack.java
 * <p/>
 * Calvin Wong
 * <p/>
 * The class DoubleStack holds two lists that act like stacks inside one array.
 */

public class DoubleStack {

    private String[] array;
    private int topIndex1;
    private int topIndex2;

    private boolean isStack1Empty;
    private boolean isStack2Empty;

    public DoubleStack(int totalLength) {
        array = new String[totalLength];

        topIndex1 = 0;
        topIndex2 = array.length - 1;

        isStack1Empty = true;
        isStack2Empty = true;
    }

    public boolean push(int stackNum, String item) {
        if (stackNum == 1 && (array[topIndex1 + 1] == null)) {
            if (isStack1Empty) {
                isStack1Empty = false;
            } else {
                topIndex1++;
            }
            array[topIndex1] = item;
            return true;

        } else if (stackNum == 2 && (array[topIndex2 - 1] == null)) {
            if (isStack2Empty) {
                isStack2Empty = false;
            } else {
                topIndex2--;
            }
            array[topIndex2] = item;
            return true;
        }
        return false;
    }

    public String pop(int stackNum) {

        String stackItem = "Please enter 1 or 2 to specify stack.";

        if (stackNum == 1) {
            if (array[topIndex1] == null) {
                return "There is no item at this spot";
            }

            stackItem = array[topIndex1];
            array[topIndex1] = null;

            if (topIndex1 > 0) {
                topIndex1--;
            } else if (topIndex1 == 0) {
                isStack1Empty = true;
            }
            return stackItem;

        } else if (stackNum == 2) {
            if (array[topIndex2] == null) {
                return "There is no item at this spot";
            }

            stackItem = array[topIndex2];
            array[topIndex2] = null;

            if (topIndex2 < array.length - 1) {
                topIndex2++;
            } else if (topIndex2 == array.length - 1) {
                isStack2Empty = true;
            }
            return stackItem;
        }
        return stackItem;
    }

    public String topValue(int stackNum) {
        if (stackNum == 1) {
            return array[topIndex1];
        } else if (stackNum == 2) {
            return array[topIndex2];
        }
        return "Please enter 1 or 2 to specify stack.";
    }

    public int length(int stackNum) {
        if (stackNum == 1) {
            if (isStack1Empty) {
                return 0;
            } else {
                return topIndex1 + 1;
            }
        } else if (stackNum == 2) {
            if (isStack2Empty) {
                return 0;
            } else {
                return array.length - topIndex2;
            }
        }
        return 0;
    }

    public void clear(int stackNum) {
        if (stackNum == 1) {
            if (!isStack1Empty) {
                for (int i = 0; i <= topIndex1; i++) {
                    array[i] = null;
                }
                isStack1Empty = true;
            }
        } else if (stackNum == 2) {
            if (!isStack2Empty) {
                for (int i = array.length - 1; i >= topIndex2; i--) {
                    array[i] = null;
                }
                isStack2Empty = true;
            }
        }
    }

    public String getStackValues(int stackNum) {

        String values = "";

        if (stackNum == 1) {
            values = "Stack 1 values:\n";

            for (int i = topIndex1; i >= 0; i--) {
                values += i + " " + array[i] + "\n";
            }
            return values;
        }

        if (stackNum == 2) {
            values = "Stack 2 values:\n";

            for (int i = topIndex2; i <= array.length - 1; i++) {
                values += i + " " + array[i] + "\n";
            }
            return values;
        }
        return "Please specify either stack 1 or 2.";
    }
} // end of class
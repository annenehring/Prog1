package Klausur;

class MyStackElement {
    public Integer value;
    public MyStackElement next;
    MyStackElement(Integer value, MyStackElement next) {
        this.value = value;
        this.next = next;
    }
}

class MyStack {
    private MyStackElement top = null;


    public void push(Integer value) {
        if (top == null){
            MyStackElement el = new MyStackElement(value, null);
            top = el;
        }else{
            top = new MyStackElement(value, top);
        }
    }


    public Integer pop() {
        if(top == null){
            return null;
        }
        MyStackElement result = top;
        if(top.next != null) {
            top = top.next;
        }else{
            top = null;
        }

        return result.value;
    }


        public static void main(String[] args) {
            MyStack stack = new MyStack();

            stack.push(10);
            stack.push(20);
            stack.push(30);

            System.out.println(stack);

            stack.pop(); // 30
            System.out.println(stack);
            stack.pop(); // 20
            System.out.println(stack);
            stack.pop(); // 10
            System.out.println(stack);
            stack.pop(); // null
            System.out.println(stack);
        }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        MyStackElement current = top;

        sb.append("Top -> ");

        while (current != null) {
            sb.append(current.value).append(" -> ");
            current = current.next;
        }

        sb.append("null");
        return sb.toString();
    }


}


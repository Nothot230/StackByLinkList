public class Test {
    public static void main(String[] args){
        Stack s = new Stack();
        s.push(11);
        s.push(12);
        s.push(13);
        s.push(14);
        s.push(15);

        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
    }
}

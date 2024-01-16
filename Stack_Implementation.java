class Stack{
    Node tos;
    Stack(){
        this.tos = null;
    }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public void push(int data){
        Node newNode = new Node(data);
        if(tos == null){
            tos = newNode;
        }
        else{
            newNode.next = tos;
            tos = newNode;
        }
    }
    
    public void pop(){
        if(tos == null){
            System.out.println("Stack is empty!");
        }
        else{
            tos = tos.next;
        }
    }
    
    public int peek(){
        if(tos == null){
            System.out.println("Stack is empty!");
            return -1;
        }
        return tos.data;
    }
    
    public int size(){
        Node temp = tos;
        int len = 0;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        return len;
    }
}

public class Stack_Implementation{
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println(stack.peek());
		System.out.println("Size of the stack = " + stack.size());
		stack.pop();
		System.out.println(stack.peek());
		System.out.println("Size of the stack = " + stack.size());
	}
}

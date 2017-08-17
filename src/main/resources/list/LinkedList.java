package list;

public class LinkedList<T> {
	private Node<T> head;
	private Node<T> tail;
	public void add(Node<T> nextNode) {
		if (head != null && tail != null){
			tail.setNextNode(nextNode);
			tail = nextNode;
		}else {
			head = nextNode;
			tail = nextNode;
		}
	}
	
	public void remove(Node<T> value) {
		
		
	}
	
	public void get(int index){
		
	}
	
	public Boolean contains(T value) {
		return false;
	}

}

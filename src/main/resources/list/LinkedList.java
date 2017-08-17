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
	
	public void remove(Node<T> node) {
		if(head == node && tail == node){
			head = null;
			tail = null;
		}else if(node == tail){
			tail = tail.getPreviousNode();
			tail.setNextNode(null);
		}else if(node == head){
			head = head.getNextNode();
			head.setPreviousNode(null);
			
		}else{
			Node<T> previous = node.getPreviousNode();
			Node<T> next = node.getNextNode();
			previous.setNextNode(next);
			next.setPreviousNode(previous);
			
		}
		
	}
	
	public void get(int index){
		
	}
	
	public Boolean contains(T value) {
		return false;
	}

}

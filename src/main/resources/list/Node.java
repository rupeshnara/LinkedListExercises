package list;

public class Node<T> {
	private Node<T> nextNode, previousNode;
	private T value;
	
	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}
	
	public Node<T> getNextNode() {
		return nextNode;
	}
	
	public void setPreviousNode (Node<T> previousNode) {
		this.previousNode = previousNode;
	}
	
	public Node<T> getPreviousNode() {
		return previousNode;
	}
	
	public void setVal (T value) {
		this.value = value;
	}
	
	public T getVal() {
		return value;
	}
	

}

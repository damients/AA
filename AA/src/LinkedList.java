import  java.util.Scanner;
import java.util.Stack;

public  class LinkedList<T> implements MyList<T>{

	 protected Node mHead;

	    /** Length of list. */
	    protected int mLength;


	    public LinkedList() {
	        mHead = null;
	        mLength = 0;
	    } // end of SimpleList()


	    public void add(T newValue) {
	        Node newNode = new Node(newValue);

	        // If head is empty, then list is empty and head reference need to be initialised.
	        if (mHead == null) {
	            mHead = newNode;
	        }
	        // otherwise, add node to the head of list.
	        else {
	            newNode.setNext(mHead);
	            mHead = newNode;

	        }

	        mLength++;
	    } // end of add()

	    public void add(int index, T newValue) throws IndexOutOfBoundsException {
	        if (index >= mLength || index < 0) {
	            throw new IndexOutOfBoundsException("Supplied index is invalid.");
	        }

	        Node newNode = new Node(newValue);

	        if (mHead == null) {
	            mHead = newNode;
	        }
	        // list is not empty
	        else {
	            Node currNode = mHead;
	            for (int i = 0; i < index-1; ++i) {
	                currNode = currNode.getNext();
	            }

	            newNode.setNext(currNode.getNext());
	            currNode.setNext(newNode);
	        }

	        mLength += 1;
	    } // end of add()


	    public T get(int index) throws IndexOutOfBoundsException {
	        if (index >= mLength || index < 0) {
	            throw new IndexOutOfBoundsException("Supplied index is invalid.");
	        }

	        Node currNode = mHead;
	        for (int i = 0; i < index; ++i) {
	            currNode = currNode.getNext();
	        }

	        return currNode.getValue();
	    } // end of get()

	    public boolean search(T value) {
	        Node currNode = mHead;
	        for (int i = 0; i < mLength; ++i) {
	        if (currNode.getValue() == value) {
	        return true;
	        }
	            currNode = currNode.getNext();
	        }

	        return false;
	    } // end of search()



	    public boolean remove(T value) {
	        // YOUR IMPLEMENTATION

	    Node current = mHead;
	    Node next = current.getNext();
	    Node prev = null;

	    if(next == null)
	    {
	    if(current.getValue() == value)
	    {
	    current = null;
	    mLength --;
	    return true;
	    }
	    }

	    while(next != null)
	    {
	    if(current.getValue()==value)
	    {
	    prev.setNext(next);

	    current = null;
	    mLength--;
	    return true;
	    }

	    prev = current;
	    current = next;
	    next = current.getNext();
	    }

	        return false;
	    } // end of delete()


	    public int remove(int index, boolean dummy) throws IndexOutOfBoundsException{
	        if (index >= mLength || index < 0) {
	            throw new IndexOutOfBoundsException("Supplied index is invalid.");
	        }

	        // YOUR IMPLEMENTATION

	        Node current = mHead;
	        Node next = current.getNext();
	        Node prev = null;

	        if(next == null)
	        {
	        current = null;
	        mLength--;
	        return -1;
	        }

	        while(next != null)
	        {
	        for(int i = 0 ; i < index ; i++)
	        {
	        prev = current;
	        current = next;
	        next = next.getNext();
	        }

	        prev.setNext(next);
	        current = null;
	        mLength--;

	        return 0;
	        }


	        // UPDATE
	        return -1;
	    } // end of delete()
	    public int min() throws IllegalStateException {
	        if (mLength == 0) {
	            throw new IllegalStateException("Min is not defined for an empty list.");
	        }

	        // traverse list, looking for the minimum valued element


	        return 0;
	    } // end of min()


	    public int max() throws IndexOutOfBoundsException {
	        if (mLength == 0) {
	            throw new IllegalStateException("Min is not defined for an empty list.");
	        }

	        // traverse list, looking for the minimum valued element


	        return 0;
	    } // end of max()



	    public void print() {
	        System.out.println(toString());
	    } // end of print()



	    public void reversePrint() {
	        // use a stack
	        Stack<T> stack = new Stack<T>();
	        Node currNode = mHead;
	        while (currNode != null) {
	            stack.add(currNode.getValue());
	            currNode = currNode.getNext();
	        }


	        while (!stack.empty()) {
	            System.out.print(stack.pop() + " ");
	        }

	        System.out.println("");
	    } // end of reversePrint()

	    /**
	     * @return String representation of the list.
	     */
	    public String toString() {
	        Node currNode = mHead;

	        StringBuffer str = new StringBuffer();

	        while (currNode != null) {
	            str.append(currNode.getValue() + " ");
	            currNode = currNode.getNext();
	        }

	        return str.toString();
	    } // end of getString();
	    /**
	     * Node type, inner private class.
	     */
	    private class Node
	    {
	        /** Stored value of node. */
	        protected T mValue;
	        /** Reference to next node. */
	        protected Node mNext;

	        public Node(T value) {
	            mValue = value;
	            mNext = null;
	        }

	        public T getValue() {
	            return mValue;
	        }


	        public Node getNext() {
	            return mNext;
	        }


	        public void setValue(T value) {
	            mValue = value;
	        }


	        public void setNext(Node next) {
	            mNext = next;
	        }
	    } // end of inner class Node
		@Override
		public int get(T index) throws IndexOutOfBoundsException {
			// TODO Auto-generated method stub
			return 0;
		}
}
package com.company;

class Node {

    public int value;
    public Node next;


    public Node( int value ) {
        this.value = value;
        this.next = null;
    }

    public Node( int value, Node n ) {
        this.value = value;
        this.next = n;
    }
}

class List{ //LinkedList
    private Node head;
    private int count;

    public void Add(int value)
    {
        Node node = new Node(value);

        if (head == null)
        {
            this.head = node;
            this.count=1;
        }
        else
        {

        }

    }

}

 class LinkedContainer<Integer> {

    private Node<Integer> fstHode;
    private Node<Integer> lstNode;
    private Integer size = 0;

     public LinkedContainer() {

         lstNode = new Node<Integer>(null, fstHode, null);
         fstHode = new Node<Integer>(null, null, lstNode);
     }


         private class Node<Integer> {
        private Integer currentElement;
        private Node<Integer> nextElement;
        private Node<Integer> prevElement;

        private Node(Integer currentElement, Node<Integer> prevElement, Node<Integer> nextElement) {
            this.currentElement = currentElement;
            this.nextElement = nextElement;
            this.prevElement = prevElement;
        }


        public Integer getCurrentElement() {
            return currentElement;
        }

        public void setCurrentElement(Integer currentElement) {
            this.currentElement = currentElement;
        }

        public Node<Integer> getNextElement() {
            return nextElement;
        }

        public void setNextElement(Node<Integer> nextElement) {
            this.nextElement = nextElement;
        }

        public Node<Integer> getPrevElement() {
            return prevElement;
        }

        public void setPrevElement(Node<Integer> prevElement) {
            this.prevElement = prevElement;
        }
    }

}

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

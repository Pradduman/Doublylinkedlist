package main;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;

public class SinglyLinkedList{
    private class Node;
    private int data;

    private Node next;
    public int getNext(){
        return data;

    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public SinglyLinkedList(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

private Node head = null;
private int size = 0

    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();

        System.out.println(linkedList);
        for (int i = 0; i < 10; i++) {

        }

        System.out.println(linkedList);}
    public String toString() {
        StringBuilder response -new StringBuilder();
        response.append("[");
        Node temp = this.head;
        while(temp!=null){
            response.append(temp.getData());
            temp= temp.next;
        }
                ]




        response.append("]");
        return response.toString();

    }
    private void insertHead(int data)
    {
        Node newNode = new Node(data,this.head);
        this.head = newNode;
        size++;
    }
    private void insertAfter(int data, Node node)
    {
        Node newnode = new Node(data, node.next);
        node.next = newNode;
        size++;

    }
    private void insertAfter(int data)
    {
        if (head==null)
        {
            insertHead(data);

0        }

   else
        {
            Node temp = this.head;
            while(temp!=null)
            {
                temp = temp.next
            }
        }}



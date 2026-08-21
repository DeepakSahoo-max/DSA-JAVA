package Linkedlist.MediumonLL;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import Array7.stockBuySell;

class Node {
    int data;
    Node next;
    Node (int data1,Node next1){
        data = data1;
        next = next1;
    }
    Node (int data1){
        data = data1;
        next = null;
    }
}

public class sortlinkedlist {
    // private static Node sortLinkedList(Node head){
    //     ArrayList <Integer> ans = new ArrayList<>();
    //     Node temp = head;
    //     while(temp!=null){
    //         ans.add(temp.data);
    //         temp= temp.next;
    //     }
    //     Collections.sort(ans);

    //     int i=0; temp = head;
    //     while(temp!=null){
    //         temp.data = ans.get(i);
    //         i=i+1;
    //         temp = temp.next;
    //     }
    //     return head;
    // }
    private static Node mergeTwoLists(Node list1,Node list2){
        Node dummyNode = new Node(-1);
        Node temp = dummyNode;
        while(list1 != null && list2!=null){
            if(list1.data < list2.data){
                temp.next = list1;
                temp = list1;
                list1 = list1.next;
            }
            else {
                temp.next = list2;
                temp = list2;
                list2 = list2.next;
            }
        }
        if(list1!= null) temp.next = list1;
        else temp.next = list2;
        return dummyNode.next;
    }
    private static Node findmiddle(Node head){
         Node slow =head;
         Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private static Node sortLinkedList(Node head){
        if(head == null || head.next==null) return head;

        Node middle = findmiddle(head);;
        Node right = middle.next;
        middle.next = null;
        Node left = head;

        left = sortLinkedList(left);
        right = sortLinkedList(right);
        return mergeTwoLists(left,right);
    }
     public static void main (String[]args){
         Node head = new Node(3);
        Node second = new Node(2);
        Node third = new Node(1);
        Node fourth = new Node(6);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // Create a loop
        fifth.next = null;
        head = sortLinkedList(head);
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }
}

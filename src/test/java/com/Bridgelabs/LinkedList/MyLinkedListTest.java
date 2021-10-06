package com.Bridgelabs.LinkedList;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
    @Test
    public void given3NumberAdded2LinkListToTop(){
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(70);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(firstNode);
//        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);
        myLinkedList.insert(firstNode,secondNode);
        myLinkedList.pop();
        myLinkedList.printMyNodes();

        boolean result = myLinkedList.head.equals(firstNode) && myLinkedList.head.getNext().equals(secondNode)
        		&& myLinkedList.tail.equals(thirdNode);

        Assert.assertTrue(result);
    }

}

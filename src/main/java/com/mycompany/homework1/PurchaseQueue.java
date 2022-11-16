package com.mycompany.homework1;

public class PurchaseQueue {
  private Node<Purchase> front, rear;

  /**
   * Sets {@code front} and {@code rear} to {@code null}.
   */
  public PurchaseQueue() {
    this.front = null;
    this.rear = null;
  }

  /**
   * Adds a new item to the end of the queue.
   *
   * @param g The item to add to the end of the queue.
   */
  void enqueue(Purchase g) {
    Node<Purchase> temp = new Node<Purchase>();

    temp.data = g;
    temp.next = null;

    if (this.rear == null) {
      this.front = temp;
    } else {
      this.rear.next = temp;
    }

    this.rear = temp;
  }

  /**
   * Removes an item from the front of the queue.
   *
   * @return The front item of the queue.
   */
  Purchase dequeue() {
    Purchase item;
    item = this.front.data;
    this.front = this.front.next;

    if (front == null) {
      this.rear = null;
    }

    return item;
  }

  /**
   * Gets the length of the PurchaseQueue;
   *
   * @return The amount of elements in the queue.
   */
  int getLength() {
    Node<Purchase> temp = this.front;
    int count = 0;

    while (temp != null) {
      count++;

      temp = temp.next;
    }

    return count;
  }

  void show() {
    if (!this.isEmpty()) {
      Node<Purchase> temp = this.front;

      while (temp != null) {
        System.out.println(temp.data);

        temp = temp.next;
      }
    } else {
      System.out.println("The queue is empty");
    }

    System.out.println(" ");
  }

  /**
   * Clears the contents of the queue.
   */
  void makeEmpty() {
    this.front = null;
    this.rear = null;
  }

  /**
   * Checks if the queue is empty.
   *
   * @return {@code True} if the queue is empty.
   */
  boolean isEmpty() {
    return this.front == null;
  }
}

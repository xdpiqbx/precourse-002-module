# FIFO - first in first out

## Queue
```java
public interface Queue<E> extends Collection<E> {
    boolean add(E e);
    boolean offer(E e);
  // The remove() and poll() methods remove and return the head of the queue.
  // when the queue is empty: the remove() method throws an exception, while the poll() method returns null.
    E remove();
    E poll();
  // The element() and peek() methods return, but do not remove, the head of the queue.
    E element();
    E peek();
}
```

# FILO - first in last out

## Deque
```java
public interface Deque<E> extends Queue<E> {
    void addFirst(E e);
    void addLast(E e);
    boolean offerFirst(E e);
    boolean offerLast(E e);
    E removeFirst();
    E removeLast();
    E pollFirst();
    E pollLast();
    E getFirst();
    E getLast();
    E peekFirst();
    E peekLast();
    boolean removeFirstOccurrence(Object o);
    boolean removeLastOccurrence(Object o);
  // *** Queue methods ***
    boolean add(E e);
    boolean offer(E e);
    E remove();
    E poll();
    E element();
    E peek();
  // *** Stack methods ***
    void push(E e);
    E pop();
  // *** Collection methods ***
    boolean remove(Object o);
    boolean contains(Object o);
    int size();
    Iterator<E> iterator();
    Iterator<E> descendingIterator();
}
```

Queue or Dequeue ? =)) That is the question...
/**
 * This Queue maintains the queue of messages coming from connected clients.
 */
public class P2PMessageQueue {

    private P2PMessage head = null;
    private P2PMessage tail = null;

    /**
     * This method allows adding a message object to the existing queue.
     *
     * @param oMessage
     */
    public synchronized void enqueue(P2PMessage oMessage) {

        if (head == null) {
            // The queue is empty, set both head and tail to the new message.
            head = oMessage;
            tail = oMessage;
        } else {
            // Append the message to the end of the queue and update the tail.

            tail.next = oMessage;
            tail = oMessage;
        }
    }


    /**
     * This method allows removing a message object from the existing queue.
     *
     * @return
     */
    public synchronized P2PMessage dequeue() {
        if (head == null) {
            return null;
        } else {

            P2PMessage temp = head;
            head = head.next;
            return temp;
        }
    }

    public boolean hasNodes() {
        if (head == null) {
            return false;
        } else {
            return true;
        }
    }

    public P2PMessage getHead() {
        return head;
    }


    public P2PMessage getTail() {
        return tail;
    }
}


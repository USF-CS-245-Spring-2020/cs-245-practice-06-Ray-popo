public class LinkedList<T> implements List<T>
{
    private Node <T> head;
    private int size;

    public LinkedList()
    {
        this.head = null;
        this.size = 0;
    }
    @Override
    public void add(T item) {
        //set head point
        if (this.head== null)
        {
            //check new Node if it is empty
            this.head = new Node<T>(item);
        }
        else {
            //first Node
            Node <T> current  = this.head;
            while (current.next!=null)
            {   //set current to next
                current = current.next;
                //move Node to the end
                current.next = new Node<T>(item);
            }
        }
        //re-increased size
        this.size++;
    }

    @Override
    public void add(int pos, T item)
    {
        Node temp =new Node(item, null,null);
        //check if head is empty
        if (this.head== null)
        {
            this.head = temp;
        }
        else {
            //set the head point on new Node
            Node<T> current = this.head;
            Node<T> prev = null;
            //move the prevs Node point on current.next
            for (int i = 0; i < pos; i++) {
                prev = current;
                current = current.next;
            }//check prev if it is empty
            if (prev != null)
            {
                prev.next = new Node<T>(item);
            }
        }
        //increased size
        this.size++;

    }

    @Override
    public T get(int pos) {
        //check if the size is empty
        if (this.size ==0){
            return null;
        }//set up the point on the head
        Node <T> current= this.head;
        //ckeck the current Node points on next
        for (int i=0;i<pos;i++)
        {
            current = current.next;
        }
        return current.data;

    }

    @Override
    public T remove(int pos) {
        //check the size if it is no element
        if (this.size ==0) {
            return null;
        }
        Node <T> prev =null;
        //set point on head
        Node <T> current = this.head;
        //prev element transfer to current.next
        for (int i=0; i<pos; i++)
        {
            prev = current;
            current = current.next;
        }
        //double check prev, if it is empty
        if (prev!=null)
        {
            prev.next = current.next;
        }
        //decreased size
        this.size--;
        return current.data;
    }

    @Override
    public int size() {
        //return size;
        return this.size;
    }
}

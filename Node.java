public class Node <T>
{
    protected T data;
    protected Node<T>next;
    protected Node<T>prev;

    public Node(T data )
    {
        //store data
        this.data = data;
        //set next to null
        this.next = null;
        //set prev to null
        this.prev = null;
    }

    public Node(T data, Node<T>next)
    {
        this.data=data;
        this.next=next;
    }

    public Node(T data, Node<T>next,Node<T>prev)
    {
        this.data=data;
        this.next=next;
        this.prev=prev;
    }
}

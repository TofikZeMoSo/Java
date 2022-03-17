public class SListIterator <T>{


    Node <T> head;


    SListIterator(Node head)
    {
        this.head = head;
    }

    public void add(int num)
    {
        if(head == null)
            head = new Node  (num);
        else
        {
            Node <T> temp = head;

            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = new Node(num);
        }
    }

    public void insert(int index ,int num)
    {
        if(index==0)
        {
            Node obj = new Node(num);
            obj.next = head;
            head = obj;
        }
        else
        {
            int count = 0;
            Node <T> obj = head;
            while(obj != null)
            {
                obj = obj.next;
                count++;
            }
            if(index < count) {
                int count1 = 0;
                Node<T> temp = head;
                while (count1 < index - 1) {
                    temp = temp.next;
                    count1++;
                }
                Node<T> newObj = new Node(num);
                newObj.next = temp.next;
                temp.next = newObj;
            }
            else
            {
                System.out.println("Not possible");
            }

        }
    }

    public void remove(int index)
    {
        if(index == 0)
        {
            Node <T> temp = head;
            head = temp.next;
        }
        else
        {
            int count = 0;
            Node <T> obj = head;
            while(obj != null)
            {
                obj = obj.next;
                count++;
            }
            if(index < count)
            {
                Node <T> temp = head;
                int cnt1 = 0;
                while(cnt1 < index-1)
                {
                    temp = temp.next;
                    cnt1++;
                }
                temp.next = temp.next.next;
            }
            else
                System.out.println("not possible");

        }
    }

    public void printList ()
    {
        Node <T> temp = head;
        while(temp != null)
        {
            System.out.print(temp.num+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
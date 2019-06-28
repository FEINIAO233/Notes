using System;

namespace List
{
    public class Node
    {
        public int data;
        public Node next;

        public Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public class Lists
    {
        private Node Head = null;
        private Node Tail = null;
        private Node Pointer = null;
        private int Length = 0;

        public void DeleteAll()
        {
            Head = null;
            Tail = null;
            Pointer = null;
            Length = 0;
        }

        public bool IsEmpty()
        {
            return (Length == 0);
        }

        public void Reset()
        {
            Pointer = null;
        }

        public bool IsEnd()
        {
            if (Length == 0)
            {
                throw new Exception();
            }
            else if (Length == 1)
            {
                return true;
            }
            else
            {
                return (Cursor() == Tail);
            }
        }

        private Node Cursor()
        {
            if (Head == null)
            {
                throw new Exception();
            }
            else if (Pointer == null)
            {
                return Head;
            }
            else
            {
                return Pointer.next;
            }
        }

        public object NextNode()
        {
            if (Length == 1)
            {
                throw new Exception();
            }
            else if (Length == 0)
            {
                throw new Exception();
            }
            else
            {
                Node temp = Cursor();
                Pointer = temp;
                if (temp != Tail)
                {
                    return (temp.next.data);
                }
                else
                {
                    throw new Exception();
                }
            }
        }

        public object CurrentNode()
        {
            Node temp = Cursor();
            return temp.data;
        }

        public void Insert(int d)
        {
            Node e = new Node(d);
            if (Length == 0)
            {
                Tail = e;
                Head = e;
            }
            else
            {
                Node temp = Cursor();
                e.next = temp;
                if (Pointer == null)
                {
                    Head = e;
                }
                else
                {
                    Pointer.next = e;
                }
            }
            Length++;
        }

        public object Remove()
        {
            object temp;
            if (Length == 0)
            {
                throw new Exception();
            }
            else if (Length == 1)
            {
                temp = Head.data;
                DeleteAll();
            }
            else
            {
                Node cur = Cursor();
                temp = cur.data;
                if (cur == Head)
                {
                    Head = cur.next;
                }
                else if (cur == Tail)
                {
                    Pointer.next = null;
                    Tail = Pointer;
                    Reset();
                }
                else
                {
                    Pointer.next = cur.next;
                }
                Length--;
            }
            return temp;
        }

    }
}

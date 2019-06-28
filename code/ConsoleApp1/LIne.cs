using System;
using System.Collections.Generic;
using System.Text;

namespace LeetCode
{
    public class Node
    {
        public int data;
        public Node next;
    }

    public class Line
    {
        private Node Head = null;
        private Node Tail = null;
        private Node Pointer = null;
        private int Length = 0;
    }

}

using System;
using System.IO;
using List;

namespace LeetCode
{
    public class Program 
    {
        //001 两数相加
        //static void Main(string[] args)
        //{
        //    int[] a = { 2, 3, 4, 5 };
        //    var target = 5;
        //    bool flag = true;
        //    for (var i = 0; i < a.Length; i++)
        //    {
        //        for (var j = 0; j < a.Length; j++)
        //        {
        //            if (a[i] + a[j] == target)
        //            {
        //                flag = false;
        //                int[] b = {i, j };
        //                Console.WriteLine("{0},{1}", b[0], b[1]);
        //                break;
        //            }
        //        }
        //        if (!flag)
        //        {
        //            break;
        //        }
        //    }
        //}

        static void Main()
        {
            Lists a = new Lists();
            for(int i = 1;i<=10;i++)
            {
                a.Insert(i);
            }
            Console.WriteLine(a.CurrentNode());
            while(!a.IsEnd())
            {
                Console.WriteLine(a.NextNode());
            }
            a.Reset();
            while(!a.IsEnd())
            {
                a.Remove();
            }
            a.Remove();
            a.Reset();
            if(a.IsEmpty())
            {
                Console.WriteLine("链表为空！");
            }
            Console.WriteLine("按任意键退出");
            try
            {
                Console.Read();
            }
            catch(IOException e)
            {
                throw e;
            }
        }
    }
}

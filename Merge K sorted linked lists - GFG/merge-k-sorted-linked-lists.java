//{ Driver Code Starts
import java.util.*;

class Node
{
    int data;
    Node next;
    
    Node(int key)
    {
        data = key;
        next = null;
    }
}


class GfG
{
    public static void printList(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0)
        {   
            int N = sc.nextInt();
            
            Node []a = new Node[N];
            
            for(int i = 0; i < N; i++)
            {
                int n = sc.nextInt();
                
                Node head = new Node(sc.nextInt());
                Node tail = head;
                
                for(int j=0; j<n-1; j++)
                {
                    tail.next = new Node(sc.nextInt());
                    tail = tail.next;
                }
                
                a[i] = head;
            }
            
            Solution g = new Solution();
             
            Node res = g.mergeKList(a,N);
            if(res!=null)
                printList(res);
            System.out.println();
        }
    }
}
// } Driver Code Ends


/*class Node
{
    int data;
    Node next;
    
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

// a is an array of Nodes of the heads of linked lists
// and N is size of array a


class Solution
{
    //Function to merge K sorted linked list.
        Node mergeKList(Node[]arr,int k)
    {
        //Add your code here.
        if(k==0)
        return null;
    
        Node result=arr[0];
        int i=1;
        while(i<k){
            result=sortedMerge(result,arr[i]);
            i++;
        }
        return result;
    }
     Node sortedMerge(Node l1, Node l2) {
    
       Node head=new Node(0);
        Node temp=head;
        
        while(l1 != null && l2 != null){
            if(l1.data<l2.data){
                temp.next=l1;
                l1=l1.next;
                temp=temp.next;
            }
            else{
                temp.next=l2;
                l2=l2.next;
                temp=temp.next; 
            }
            }
        
        if(l1 != null){
                temp.next=l1;
                l1=l1.next;
        }
        if(l2 != null){
            temp.next=l2;
            l2=l2.next;
        }
    return head.next;
    
    }
}
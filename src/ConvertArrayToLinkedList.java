public class ConvertArrayToLinkedList {
    Node head;

    public  Node convertArrayTOLinkedList(int[] arr){
        if(arr==null ||arr.length==0){
            return null;
        }
        head=new Node(arr[0]);
        Node temp=head;
        for(int i=1;i<arr.length;i++){
            Node newNode=new Node(arr[i]);
            temp.next=newNode;
            temp=newNode;
        }
        return head;
    }
    public void traversal(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("End");
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        Node head1;
        ConvertArrayToLinkedList obj=new ConvertArrayToLinkedList();
        head1=obj.convertArrayTOLinkedList(arr);
        obj.traversal();;
    }
}

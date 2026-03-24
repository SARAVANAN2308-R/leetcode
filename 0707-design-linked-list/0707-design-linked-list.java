class MyLinkedList {
       class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
       }
      Node head,tail;
      int count;
    public MyLinkedList() {
        head=null;
        tail=null;
        count=0;
    }
    
    public int get(int index) {
        if(index<0 || index>=count){
            return -1;
        }
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.data;
        
    }
    
    public void addAtHead(int val) {
        Node nn = new Node(val);
        if(head==null){
            head=tail=nn;
        }else{
            nn.next=head;
            head=nn;
        }
        count++;
    }
    
    public void addAtTail(int val) {
        Node nn = new Node(val);
        if(head==null){
            head=tail=nn;
        }else{
            tail.next=nn;
            tail=nn;
        }
        count++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index >count) return;
    if(index == 0){
        addAtHead(val);
        return;
    }
    if(index == count){
        addAtTail(val);
        return;
    }
    Node nn = new Node(val);
    Node temp = head;

    for(int i = 0; i < index - 1; i++){
        temp = temp.next;
    }
    nn.next = temp.next;
    temp.next = nn;
    count++;
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= count){
        return;
    }
    if(index == 0){
        head = head.next;
        if(head == null){
            tail = null;
        }
        count--;
        return;  
    }
    Node temp = head;
    for(int i = 0; i < index - 1; i++){
        temp = temp.next;
    }
    temp.next = temp.next.next;

    if(temp.next == null){
        tail = temp;
    }

    count--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
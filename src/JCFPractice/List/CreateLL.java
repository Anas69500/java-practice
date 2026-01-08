package JCFPractice.List;

class LL {
    int size;
    class Node{
        String data;
        Node next;


        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
//    int size;
    Node head;

    //----------------------  ADD-FIRST METHOD -------------------------//
    public void addfirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            size++;
            return;
        }

        newNode.next = head;
        head = newNode;
        size++;
    }

    //----------------------  ADD-LAST METHOD -------------------------//
    public void addlast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            size++;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
        size++;
    }

    //----------------------  REMOVE METHOD -------------------------//
    public void remove(int index){
        if(head == null){
            System.out.println("List is empty!");
            return;
        }

        Node currNode = head;

        if (index == 0){
            head = head.next;
            return;
        }

        try{
            while (size < index) {
                currNode = currNode.next;
            }
            currNode.next = currNode.next.next;
            size--;
        } catch (Exception e){
            System.out.println("index size OutOFF bound!");
        }

    }

    //----------------------  SIZE METHOD -------------------------//
    public int lsize(){
        System.out.println(size);
        return 0;
    }

    public void show(){
        Node currNode = head;
        System.out.print("{ " );
        while(currNode != null){
            System.out.print(currNode.data + ", ");
            currNode = currNode.next;

        }
        System.out.println(" }");
    }
}

public class CreateLL {
    public static void main(String[] args){
        LL list = new LL();
        list.addfirst("Adnan");
        list.addfirst("Nihal");
        list.addlast("xnxbc");
        list.addlast("xcdxc");
//        list.remove(2);
        list.lsize();
        list.show();
        list.remove(4);
        list.show();

    }
}
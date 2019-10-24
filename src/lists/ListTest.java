package lists;

import lists.list.LinkedList;

public class ListTest {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.append(10);
        linkedList.append(40);
        linkedList.append(15);
        linkedList.append(23);
        linkedList.append(37);

        linkedList.delete(10);

        linkedList.prepend(1);

    }
}

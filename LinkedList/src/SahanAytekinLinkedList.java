public class SahanAytekinLinkedList {

    SahanAytekinNode head;
    SahanAytekinNode tail;

    private int size = 0;

    public SahanAytekinLinkedList() {

    }

    public void addLast(int data, int column) {
        SahanAytekinNode<Integer> node = new SahanAytekinNode<>(data);
        node.CIndex = column;

        if (tail == null) {
            head = node;
        } else {
            tail.next = node;
            node.prev = tail;
        }
        tail = node;
        size++;
    }

    public void print() {
        SahanAytekinNode<Integer> temp = head;
        while (temp != null) {
            if (temp.CIndex != 0) {
                System.out.print(temp.data + " <> ");
                temp = temp.next;
            }
        }
        System.out.print("null");
        System.out.println();
    }

    public void printBoard() {
        for (int c = 1; c <= 5; c++) {
            System.out.printf("Column %d -> ", c);
            printSpecificColumn(c);
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }

    public void printSpecificColumn(int column) {
        SahanAytekinNode<Integer> temp = head;
        while (temp != null) {
            if (temp.CIndex == column) {
                if (temp.data != 0) {
                    System.out.print(temp.data + " ");
                }
            }
            temp = temp.next;
        }
        System.out.println();
    }

    public void mergeSpecificColumn(int column) {
        SahanAytekinNode<Integer> temp = head;

        while (temp != null) {
            SahanAytekinNode next = temp.next;
            while (next != null) {
                if (temp.CIndex == column && next.CIndex == column) {
                    if (temp.data == next.data) {
                        temp.data = temp.data * 2;
                        next.data = 0;
                        size--;
                    }
                }
                next = next.next;
            }
            temp = temp.next;
        }
    }

    public void mergeColumns() {
        for (int k = 1; k <= 5; k++) {
            mergeSpecificColumn(k);
        }
    }
}

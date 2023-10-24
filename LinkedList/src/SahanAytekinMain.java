public class SahanAytekinMain {

    public static void main(String[] args) {
        int[] index = {1, 4, 2, 3, 5, 2, 5, 1, 1, 2, 3, 3, 4, 2, 3, 1, 5, 3, 2, 4, 4, 4, 4, 2, 3, 3, 3, 3, 3, 2, 2};
        int[] data = {2, 2, 4, 2, 4, 2, 4, 8, 8, 32, 2, 64, 16, 64, 32, 16, 16, 32, 64, 8, 4, 2, 2, 2, 64, 32, 16, 8, 8, 4, 8};

        SahanAytekinLinkedList list = new SahanAytekinLinkedList();

        for (int i = 0; i < index.length; i++) {
            list.addLast(data[i], index[i]);
            list.mergeColumns();
            System.out.printf("Adding %d to column %d: \n", data[i], index[i]);
            list.printBoard();
        }

    }

}

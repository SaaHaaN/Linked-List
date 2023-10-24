public class SahanAytekinNode<T> {

    T data;
    SahanAytekinNode<T> next;
    SahanAytekinNode<T> prev;

    int CIndex;

    public SahanAytekinNode(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
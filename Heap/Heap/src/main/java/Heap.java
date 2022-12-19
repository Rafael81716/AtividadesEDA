import java.util.Arrays;

public class Heap{
    private int[] heap;
    private int tail;

    public Heap(int capacidade){
        this.heap = new int[capacidade];
        this.tail = -1;
    }
    public Heap(int[] heap){
        this.heap = heap;
        this.tail = this.heap.length - 1;
        this.buildHeap();
    }

    public int size(){
        return this.tail + 1;
    }

    private void buildHeap() {
        for(int i = parent(tail); i >= 0; i--){
            this.heapify(i);
        }
    }
    public boolean isEmpty(){//O(1)
        return this.tail == -1;
    }

    public int left(int index){//O(1)
        return index * 2 + 1;
    }

    public int right(int index){//O(1)
        return (index + 1) * 2;
    }

    public int parent(int index){//O(1)
        return (index - 1)/2;
    }

    public void add(int valor){//O(log n)
        if(tail >= (heap.length - 1))
            resize();

        tail += 1;
        this.heap[tail] = valor;

        int i = tail;
        while(i > 0 && this.heap[parent(i)] < this.heap[i]){
            int aux = this.heap[i];
            this.heap[i] = this.heap[parent(i)];
            this.heap[parent(i)] = aux;
            i = parent(i);
        }
    }

    private void resize(){
        int[] newHeap = new int[this.heap.length * 2];
        for(int i = 0; i < tail; i++){
            newHeap[i] = this.heap[i];
        }
        this.heap = newHeap;
    }

    public int remove(){ // O(log n)
        if(isEmpty()) throw new RuntimeException("empty heap");
        int element = this.heap[0];
        this.heap[0] = this.heap[tail];
        this.tail--;

        this.heapify(0);

        return element;
    }

    private void heapify(int i) {
        if(isLeaf(i) || !isValidIndex(i)) return;

        int index_max = max_index(i, left(i), right(i));

        if(index_max != i){
            swap(i, index_max);
            heapify(index_max);
        }
    }

    private void swap(int i, int index_max) {
        int aux = this.heap[i];
        this.heap[i] = this.heap[index_max];
        this.heap[index_max] = aux;
    }

    private int max_index(int index, int left, int right) {
        if (this.heap[index] > this.heap[left]) {
            if (isValidIndex(right)) {
                if (this.heap[index] < this.heap[right])
                    return right;
            }
           
            return index;
        
        } else {
            if (isValidIndex(right)) {
                if (this.heap[left] < this.heap[right])
                    return right;
            } 
            
            return left;
        }
    }

    private boolean isLeaf(int index) {
        return index > parent(tail) && index <= tail;
    } 

    private boolean isValidIndex(int index) {
        return index >= 0 && index <= tail;
    }
    public String toString() {
        return Arrays.toString(this.heap);
    }
}
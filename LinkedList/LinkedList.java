package LinkedList;

import java.util.NoSuchElementException;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return this.head == null;
    }

    public void addLast(Aluno aluno){
        Node newNode = new Node(aluno);
        if(isEmpty()){
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            newNode.prev = tail;
            this.tail = newNode;
        }

        this.size += 1;
    }
    
    public void addFirst(Aluno aluno){
        Node newNode = new Node(aluno);

        if(isEmpty()){
            this.head = newNode;
            this.tail = newNode;
        }else{
            newNode.next = this.head;
            this.head.prev = newNode;
            this.head = newNode;
        }

        size += 1;
    }

    public void add(int index, Aluno aluno){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }

        Node newNode = new Node(aluno);

        if(index == 0){
            this.addFirst(aluno);
        }else if(index == size - 1){
            this.addLast(aluno);
        }else{
            Node aux = this.head;

            for(int i = 0; i < index - 1; i++){
                aux = aux.next;
            }

            newNode.next = aux.next;
            aux.next = newNode;
            newNode.next.prev = newNode;
            newNode.prev = aux;

            size += 1;
        }
    }

    public Aluno get(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }

        Node aux = this.head;

        for(int i = 0; i < index; i++){
            aux = aux.next;
        }

        return aux.aluno;
    }
    public int indexOf(Aluno aluno){
        Node aux = this.head;
        int index = 0;
        while(aux != null){
            if(aux.aluno.getMatricula().equals(aluno.getMatricula())){
                return index;
            }
            aux = aux.next;
            index += 1;
        }
        return -1;
    }
    public boolean contains(Aluno aluno){
        return indexOf(aluno) != -1;
    }
    public Aluno getFirst(){
        if(this.isEmpty()) return null;
        return this.head.aluno;
    }
    public Aluno getLast(){
        if(this.isEmpty()) return null;
        return this.tail.aluno;
    }
    public Aluno removeFirst(){
        if(isEmpty()) throw new NoSuchElementException();

        Aluno aluno = this.head.aluno;

        if(this.head.next == null){
            this.head = null;
            this.tail = null;
        }else{
            this.head = this.head.next;
            this.head.prev = null;
        }

        size -= 1;
        return aluno;
    }
    public Aluno removeLast(){
        if(isEmpty()) throw new NoSuchElementException();

        Aluno aluno = this.tail.aluno;

        if(this.head.next == null){
            this.head = null;
            this.tail = null;
        } else {
            this.tail = this.tail.prev;
            this.tail.next = null;
        }

        size -= 1;
        return aluno;
    }
    public Aluno remove(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }

        if(index == 0) return removeFirst();
        if(index == size - 1) return removeLast();

        Node aux = this.head;
        for(int i = 0; i < index; i++){
            aux = aux.next;
        }

        aux.prev.next = aux.next;
        aux.next.prev = aux.prev;
        size -= 1;

        return aux.aluno;
    }
    public boolean remove(Aluno aluno){
        Node aux = this.head;
        for(int i = 0; i < this.size; i++){
            if(aux.aluno.equals(aluno)){
                if(i == 0) removeFirst();
                else if(i == size - 1) removeLast();
                else{
                    aux.prev.next = aux.next;
                    aux.next.prev = aux.prev;
                    size -= 1;
                }
                return true;
            }
            aux = aux.next;
        }
        return false;
    }
}
class Node{
    Aluno aluno;
    Node next;
    Node prev;

    public Node(Aluno aluno){
        this.aluno = aluno;
        this.prev = null;
        this.next = null;
    }
}
class Aluno {

    private Integer matricula;
    private String nome;
    
    public Integer getMatricula() {
        return this.matricula;
    }

    public String getNome() {
        return this.nome;
    }
}
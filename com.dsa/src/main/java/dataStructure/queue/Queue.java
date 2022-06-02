package dataStructure.queue;

import java.util.Arrays;

public class Queue {

    public static void main(String[] args) {

        Queue q = new Queue(10);
        q.enqueue(10);



    }

        int[] arr;
        int size;
        int rear; // new data is entered in the rear and , old data is dequeue from front (FIFO)


        Queue(int n){
            this.size = n;
            this.arr = new int[n];
            this.rear = -1;
        }

        void enqueue(int a){
            if(size == rear){
                throw new ArrayIndexOutOfBoundsException();

            }
            else {
                rear++;
                arr[rear] = a;

            }
            System.out.println(arr[rear]);

        }

        int dequeue(){

            if(rear == -1) throw new IllegalArgumentException();
            int result = arr[0];

                for(int i =0;i<size-1;i++){
                    arr[i] = arr[i+1];

                }

            rear--;
            System.out.println(result);
            return result;
        }

        int front(){
            if(rear == -1) throw new IllegalArgumentException();

            System.out.println(arr[0]);
            return arr[0];
        }
        void printQueue(){


            System.out.println(Arrays.toString(arr));

        }

    }


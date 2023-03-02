public class CRUD{
    int arr[];
    int currentSize;

    public CRUD(int n){
        this.arr = new int[n];
        this.currentSize = 0;
    }

    public void insert(int index, int item){
        if(index > currentSize){
            System.out.println("Invalid");
            return;
        }
        arr[index] = item;
        currentSize++;
    }

    void print(){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        CRUD operations = new CRUD(5);
        operations.insert(0,10);
    }
}
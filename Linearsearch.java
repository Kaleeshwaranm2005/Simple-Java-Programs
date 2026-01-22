public class Linearsearch {
    public static void main(String args[]){
        int arr[] = {5,9,2,7};
        int key = 2;
        int index = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                index = i;
                break;
            }
        }
        if(index != -1){
            System.out.println("Index = " + index);
        }
        else{
            System.out.println("Element not found");
        }
    }
}

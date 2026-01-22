public class Countoccurences {
    public static void main(String args[]){
        int arr[] = {1,2,2,3,4,5,2,45,5,2};
        int key = 2;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                count++;
            }
        }
        System.out.println(key + "Appears " + count + " times");
    }
}

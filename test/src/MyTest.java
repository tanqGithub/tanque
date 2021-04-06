public class MyTest {
    public static void main(String[] args) {
        //定义一个无序数组
        int[] arr={1,5,8,3,2};
        sort(arr);
    }
    private static void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printArr(arr);
    }
    private static void  printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"");
        }
    }
}

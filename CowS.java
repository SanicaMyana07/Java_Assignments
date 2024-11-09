package Questions;

public class CowS {
    public static void operation_on_array(int arr[], int input) {
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] > input || arr[i] - arr[i + 1] > input) {
                System.out.println(arr[i + 1]);
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={15,18,21,24,35};
        int input=3;
        CowS.operation_on_array(arr,input);
    }
}

//array: 10,1,5,13,15,17    , input: 4    , output: 13
//array:15,18,21,24,35    , input: 3    , output: 35
//array:20,22,24,29,30    , input: 2    , output: 29
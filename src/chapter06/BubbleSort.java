package chapter06;

public class BubbleSort {
    public static void main(String[] args) {
        // int [] arr = { 24 , 69 , 80 , 110 , 130 , 150 , 300 , 400 , 410 };
        int[] arr = {24, 69, 80, 57, 13, -1, 30, 200, -110};
        int arrLength = arr.length;
        int temp, changeNum;
        int i = arrLength - 1;
        for (; i > 0; i--)    // for (int i = 0 ; i < arrLength ; i++)
        {
            temp = arr[0];
            changeNum = 0;
            for (int j = 0; j < i; j++) {
                temp = (temp > arr[j + 1] ? temp : arr[j + 1]);
                if (temp == arr[j]) {
                    changeNum++;
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (changeNum == 0) {
                break;
            }
            System.out.println("The " + (arrLength - i) + " round of sorting results are as follows:");
            for (int c = 0; c < arrLength; c++) {
                System.out.print(arr[c] + "\t");
            }
            System.out.println();
        }
        System.out.println("Bubble sorting was completed, and finally " + (arrLength - i) + " rounds of sorting were carried out, and the result was:");
        for (int c = 0; c < arrLength; c++) {
            System.out.print(arr[c] + "\t");
        }
        System.out.println();

    }
}

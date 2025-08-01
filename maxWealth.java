public class MaxWealth {
    public static void main(String[] args) {

    }
    public int maximumWealth(int[][] accounts) {
        // person = rol
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) { // Loop through each person
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) { // Loop through each account of the person
                sum += accounts[i][j];
            }
            if (sum > ans) {
                ans = sum;
            }
        }

        return ans;
    }
}

        // for (int[] ints : accounts) {
        //     // when you start a new row, take a new sum for that row
        //     int sum = 0;
        //     for (int anInt : ints) {
        //         sum += anInt;
        //     }
        //     // now we have sum of accounts of person
        //     // check with overall ans
        //     if (sum > ans) {
        //         ans = sum;
        //     }
        // }
        // return ans;

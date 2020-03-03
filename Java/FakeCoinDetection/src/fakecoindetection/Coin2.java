/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fakecoindetection;

/**
 *
 * @author Akshay
 */
public class Coin2 {
    
    FakeCoinDetectionLogicController fxml;

    int divide(int inp[], int count, int coin) {
        int n = inp.length;

        if (n <= 2) {
            count++;
            return count;
        }
        int[] a = new int[(n + 1) / 2];
        int[] b = new int[n - a.length];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i < a.length) {
                a[i] = inp[i];
                sum += inp[i];
            } else {
                b[i - a.length] = inp[i];
            }
        }
        int y = coin * (a.length);
        if (sum == y) {
            count++;
            return divide(b, count, coin);

        } else {
            count++;
            return divide(a, count, coin);

        }
    
}
    }

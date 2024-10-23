//https://leetcode.com/problems/flipping-an-image/
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int m = image.length;
        int n = image[0].length;
        for (int i = 0; i < m; i++) {
            int p = 0;
            int q = n - 1;
            while (p <= q) {
                if (p < q) {
                    if (image[i][p] == 0)
                        image[i][p] = 1;
                    else
                        image[i][p] = 0;

                    if (image[i][q] == 0)
                        image[i][q] = 1;
                    else
                        image[i][q] = 0;
                } else {
                    if (image[i][q] == 0)
                        image[i][q] = 1;
                    else
                        image[i][q] = 0;
                }

                int temp = image[i][p];
                image[i][p] = image[i][q];
                image[i][q] = temp;
                p++;
                q--;
            }
        }
        return image;

    }
}
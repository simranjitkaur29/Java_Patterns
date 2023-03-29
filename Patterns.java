public class Patterns {
    public static void main(String[] args) {
        pattern24(5);

    }
//    * * * * *
//    * * * * *
//    * * * * *
//    * * * * *
//    * * * * *
    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            //for every row,run the col
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            //when one row is printed ,we need to add a newline
            System.out.println();
        }
    }

//    *
//    * *
//    * * *
//    * * * *
//    * * * * *
    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            //for every row,run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            //when one row is printed ,we need to add a newline
            System.out.println();
        }
    }

//    * * * * *
//    * * * *
//    * * *
//    * *
//    *
    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            //for every row,run the col
            for (int col = n; col >= row; col--) {
                System.out.print("* ");
            }
            //when one row is printed ,we need to add a newline
            System.out.println();
        }
    }

//    1
//    1 2
//    1 2 3
//    1 2 3 4
//    1 2 3 4 5
    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            //for every row,run the col
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            //when one row is printed ,we need to add a newline
            System.out.println();
        }
    }

//    *
//    * *
//    * * *
//    * * * *
//    * * * * *
//    * * * *
//    * * *
//    * *
//    *
    static void pattern5(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int totalCol = row > n ? 2 * n - row : row;

            for (int col = 1; col <= totalCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }


//            *
//          * *
//        * * *
//      * * * *
//    * * * * *
    static void pattern6(int n) {
        for (int row = 1; row <= n; row++) {
            int spaces = n - row;
            for (int s = 1; s <= spaces; s++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

 /    * * * * *
//    * * * *
//    * * *
//    * *
//    *
    static void pattern7(int n) {
        for (int row = 1; row <= n; row++) {
            int spaces = row - 1;
            for (int s = 0; s < spaces; s++) {
                System.out.print("  ");
            }
            for (int col = n; col >= row; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//            *
//          * * *
//        * * * * *
//      * * * * * * *
//    * * * * * * * * *
    static void pattern8(int n) {
        for (int row = 1; row <= n; row++) {
            int spaces = n - row;
            for (int s = 1; s <= spaces; s++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//
//    * * * * * * * * *
//     * * * * * * *
//       * * * * *
//         * * *
//           *
    static void pattern9(int n) {
        for (int row = 1; row <= n; row++) {
            int spaces = row - 1;
            for (int s = 1; s <= spaces; s++) {
                System.out.print("  ");
            }
            for (int col = 2 * n - row; col >= row; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

//        *
//       * *
//      * * *
//     * * * *
//    * * * * *
    static void pattern10(int n) {
        for (int row = 1; row <= n; row++) {
            int spaces = n - row;
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//   * * * * *
//    * * * *
//     * * *
//      * *
//       *
    static void pattern11(int n) {
        for (int row = 1; row <= n; row++) {
            int spaces = row - 1;
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }
            for (int col = n; col >= row; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//    * * * * *
//     * * * *
//      * * *
//       * *
//        *
//        *
//       * *
//      * * *
//     * * * *
//    * * * * *
    static void pattern12(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int totalCols = row > n ? row - n : n - row + 1;

            int spaces = n - totalCols;
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }
            for (int cols = 1; cols <= totalCols; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //
//        *
//       * *
//      *   *
//     *     *
//    *********
    static void pattern13(int n) {
        for (int row = 1; row <= n; row++) {
            int spaces = n - row;
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                if (row == 1 || row == n) {
                    System.out.print("*");
                } else if (col == 1 || col == 2 * row - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

//    *********
//     *     *
//      *   *
//       * *
//        *
    static void pattern14(int n) {
        for (int row = n; row >= 1; row--) {
            int spaces = n - row;
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                if (row == n || row == 1) {
                    System.out.print("*");
                } else if (col == 1 || col == 2 * row - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern15(int n) {

    }

//       1
//      1 1
//     1 2 1
//    1 3 3 1
//   1 4 6 4 1
    static void pattern16(int n)
    {
        for (int row = 1; row <= n; row++) {
            int spaces = n - row;
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }
            int c = 1;
            for (int col = 1; col <= row; col++) {
                System.out.print(c + " ");
                c = c * (row - col) / col;
            }
            System.out.println();
        }
    }


//         1
//       2 1 2
//     3 2 1 2 3
//   4 3 2 1 2 3 4
// 5 4 3 2 1 2 3 4 5
//   4 3 2 1 2 3 4
//     3 2 1 2 3
//       2 1 2
//         1
    static void pattern17(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int totalCol = row > n ? 2 * n - row : row;
            int spaces = n - totalCol;
            for (int s = 1; s < spaces; s++) {
                System.out.print("  ");
            }

            for (int col = totalCol; col > 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 1; col <= totalCol; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }

//            **********
//            ****  ****
//            ***    ***
//            **      **
//            *        *
//            *        *
//            **      **
//            ***    ***
//            ****  ****
//            **********
    static void pattern18(int n)
    {
        for(int row=1;row<=2*n;row++)
        {
            int totalCols=row>n?2*n-row+1:row;
            for(int col=n;col>=totalCols;col--)
            {
                System.out.print("*");
            }
            int spaces=totalCols;
            for(int s=1;s<spaces;s++)
            {
                System.out.print("  ");
            }
            for(int col1=n;col1>=totalCols;col1--)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
//
//            *        *
//            **      **
//            ***    ***
//            ****  ****
//            **********
//            ****  ****
//            ***    ***
//            **      **
//            *        *
    static void pattern19(int n)
    {
        for(int row=1;row<=2*n;row++)
        {
            int totalCols=row>n?2*n-row:row;
            for(int col=1;col<=totalCols;col++)
            {
                System.out.print("*");
            }
            int spaces=n-totalCols;
            for(int s=1;s<=spaces;s++)
            {
                System.out.print("  ");
            }
            for(int col1=1;col1<=totalCols;col1++)
            {
                System.out.print("*");
            }
            System.out.println();

        }

    }


//*****
//*   *
//*   *
//*   *
//*****
    static void pattern20(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n || col == 1 || col == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

//    1
//    2 3
//    4 5 6
//    7 8 9 10
//    11 12 13 14 15
    static void pattern21(int n)
    {
        int i = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(i++ + " ");
            }
            System.out.println();
        }
    }

//1
//01
//101
//0101
//10101
    static void pattern22(int n)
    {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                if ((row + col) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

//      *   *
//     * * * *
//    *   *   *
    static void pattern23(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=n*n;col++)
            {
                if((row+col)%4==0||(row==2&&col%2==0))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

//            *        *
//            **      **
//            * *    * *
//            *  *  *  *
//            *   **   *
//            *  *  *  *
//            * *    * *
//            **      **
//            *        *
    static void pattern24(int n)
    {

        for(int row=1;row<=2*n;row++)
        {
            int totalCols=row>n?2*n-row:row;
            for(int col=1;col<=totalCols;col++)
            {
                if(col==1||col==totalCols)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            int spaces=n-totalCols;
            for(int s=1;s<=spaces;s++)
            {
                System.out.print("  ");
            }
            for(int col1=1;col1<=totalCols;col1++)
            {
                if(col1==1||col1==totalCols)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    //
//      *****
//     *   *
//    *   *
//   *   *
//  *****
    static void pattern25(int n) {
        for (int row = 1; row <= n; row++) {
            int spaces = n - row;
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n || col == 1 || col == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

//  1 1 1 1 1
//  2 2 2 2
//  3 3 3
//  4 4
//  5
    static void pattern26(int n) {
        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print(-1 * (row - n - 1) + " ");
            }
            System.out.println();
        }

    }

//    1 2 3 4 20 19 18 17
//      5 6 7 16 15 14
//        8 9 13 12
//          10 11
    static void pattern27(int n)
    {
        int x=1;
        int y=20;
        for(int row=1;row<=n;row++)
        {
            int spaces=row-1;
            for(int s=1;s<=spaces;s++)
            {
                System.out.print("  ");
            }
            for(int col=n;col>=row;col--)
            {
                System.out.print(x++ +" ");
            }
            for(int col1=n;col1>=row;col1--)
            {
                System.out.print(y--+" ");
            }

            System.out.println();
        }
    }

//                *
//               * *
//              * * *
//             * * * *
//            * * * * *
//             * * * *
//              * * *
//               * *
//                *

    static void pattern28(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int totalCol = row > n ? 2 * n - row : row;
            int spaces = n - totalCol;

            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//            1
//          2 1 2
//        3 2 1 2 3
//      4 3 2 1 2 3 4
//    5 4 3 2 1 2 3 4 5
    static void pattern30(int n)
    {
        for (int row = 1; row <= n; row++) {
            for (int s = 1; s <= n - row; s++) {
                System.out.print("  ");
            }
            for (int col = row; col > 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }

//            5 5 5 5 5 5 5 5 5 5 5
//            5 4 4 4 4 4 4 4 4 4 5
//            5 4 3 3 3 3 3 3 3 4 5
//            5 4 3 2 2 2 2 2 3 4 5
//            5 4 3 2 1 1 1 2 3 4 5
//            5 4 3 2 1 0 1 2 3 4 5
//            5 4 3 2 1 1 1 2 3 4 5
//            5 4 3 2 2 2 2 2 3 4 5
//            5 4 3 3 3 3 3 3 3 4 5
//            5 4 4 4 4 4 4 4 4 4 5
//            5 5 5 5 5 5 5 5 5 5 5

    static void pattern31(int n)
    {
        int originN=n;
        n=2*n;
        for(int row=0;row<=n;row++)
        {
            for(int col=0;col<=n;col++)
            {
                int left=col;
                int right=n-col;
                int top=row;
                int bottom=n-row;
                int atIndex=originN-Math.min(Math.min(left,right),Math.min(top,bottom));
                System.out.print(atIndex +" ");
            }

            System.out.println();
        }

    }

//    E
//    D E
//    C D E
//    B C D E
//    A B C D E

    static void pattern32(int n) {
        for (int row = 1; row <= n; row++) {
            int x = 'E';
            for (int col = row; col >= 1; col--) {
                char y = (char) ((char) x - col + 1);
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }

//    a
//    B c
//    D e F
//    g H i J
//    k L m N o
    static void pattern33(int n) {
        char x = 'a';
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {

                System.out.print(x + " ");
                if (Character.isLowerCase(x)) {
                    x = (char) (Character.toUpperCase(x) + 1);
                } else {
                    x = (char) (Character.toLowerCase(x) + 1);
                }
            }
            System.out.println();
        }
    }

//    E D C B A
//    D C B A
//    C B A
//    B A
//    A
    static void pattern34(int n)
    {
        char x = 'E';
        for (int row = n; row >= 1; row--) {
            char y = x;
            x -= 1;

            for (int col = 1; col <= row; col++) {
                System.out.print(y-- + " ");
            }
            System.out.println();
        }
    }

//    1        1
//    12      21
//    123    321
//    1234  4321
//    1234554321
    static void pattern35(int n) 
    {
        for (int row = 1; row <= n; row++) {
            int x = 1;
            for (int col = 1; col <= row; col++) {
                System.out.print(x++);
            }
            int spaces=2*n-2*row;
            for(int s=1;s<=spaces;s++)
            {
                System.out.print(" ");
            }
            for(int col2=row;col2>=1;col2--)
            {
                System.out.print(col2);
            }

            System.out.println();
        }

    }
}

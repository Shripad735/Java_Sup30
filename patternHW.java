public class patternHW {
    public static void main(String[] args) {
        int space,i,j;
        for(i=1;i<=5;i++){
            for(j=1;j<=5;j++){
                if(i==1 || i==5 || j==1 || j==5){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("=====================================");

        //triangel by integers 
        //       1
        //      2 2
        //     3 3 3
        //    4 4 4 4
        //   5 5 5 5 5

        for(i=1;i<=5;i++){
            for(space=5;space>=i;space--){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        System.out.println("=====================================");


        //number inecreasing pyramid
        //1
        //1 2
        //1 2 3
        //1 2 3 4
        //1 2 3 4 5

        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("=====================================");


        //number increasing reverse pyramid
        //1 2 3 4 5
        //1 2 3 4
        //1 2 3
        //1 2
        //1

        for(i=5;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("=====================================");

        //number changing pyramid
        //1
        //2 3
        //4 5 6
        //7 8 9 10

        int num=1;
        for(i=1;i<=4;i++){
            for(j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }

        System.out.println("=====================================");

        //zero one triangle
        //1
        //0 1
        //1 0 1
        //0 1 0 1
        //1 0 1 0 1

        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        System.out.println("=====================================");

        //palindrome triangle
        //        1
        //      1 2 1
        //    1 2 3 2 1
        //  1 2 3 4 3 2 1
        //1 2 3 4 5 4 3 2 1

        for(i=1;i<=5;i++){
            for(space=5;space>=i;space--){
                System.out.print("  ");
            }
            for(j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(j=i-1;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("=====================================");

        //rhombus star pattern
        //    *********
        //   *********
        //  *********
        // *********
        //*********

        for(i=1;i<=5;i++){
            for(space=5;space>=i;space--){
                System.out.print(" ");
            }
            for(j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("=====================================");

        //diamond star pattern
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *

        for(i=1;i<=4;i++){
            for(space=4;space>=i;space--){
                System.out.print(" ");
            }
            for(j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(i=3;i>=1;i--){
            for(space=4;space>=i;space--){
                System.out.print(" ");
            }
            for(j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("=====================================");

        //butterfly star pattern
        //*        *
        //**      **
        //***    ***
        //****  ****
        //**********
        //**********
        //****  ****
        //***    ***
        //**      **
        //*        *

        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            for(space=5;space>=i;space--){
                System.out.print("  ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(i=4;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            for(space=5;space>=i;space--){
                System.out.print("  ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("=====================================");

        //square fill pattern
        //*****
        //*****
        //*****
        //*****
        //*****

        for(i=1;i<=5;i++){
            for(j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("=====================================");

        //right half pyramid
        //*
        //**
        //***
        //****
        //*****

        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("=====================================");

        //reverse right half pyramid
        //*****
        //****
        //***
        //**
        //*

        for(i=5;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("=====================================");

        //left half pyramid
        //    *
        //   **
        //  ***
        // ****

        for(i=1;i<=4;i++){
            for(space=4;space>=i;space--){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("=====================================");

        //reverse left half pyramid
        // ****
        //  ***
        //   **
        //    *

        for(i=4;i>=1;i--){
            for(space=4;space>=i;space--){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}

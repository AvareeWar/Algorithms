package com.company.Algorithms.LeetCode;

public class Roman_To_Integer {

    public int romanToInt(String s) {

        int j = 0;
        int sum = 0;
        char a;
        char st = 'Q';

        for(int i = 0; i < s.length(); i++){
            a = s.charAt(i);

            if(a == 'I'){
                j += 1;
                System.out.println("+1 -> I: " + j);
            }

            if(a == 'V'){
                if(st == 'I'){
                    j -= 2;
                    System.out.println("-1 ->  V || X: " + j);
                }
                j += 5;
            }

            if(a == 'X'){
                if(st == 'I'){
                    j -= 2;
                    System.out.println("-1 ->  V || X: " + j);
                }
                j += 10;
                System.out.println("+10 -> X: " + j);

            }

            if(a == 'L'){
                if(st == 'X'){
                    j -= 20;
                    System.out.println("-1 ->  V || X: " + j);
                }
                j += 50;
                System.out.println("+50 -> L: " + j);
            }

            if(a == 'C'){
                if(st == 'X'){
                    j -= 20;
                    System.out.println("-1 ->  V || X: " + j);
                }

                j += 100;
                System.out.println("+100 -> C: " + j);

            }

            if(a == 'D'){
                if(st == 'C'){
                    j -= 200;
                    System.out.println("-1 ->  V || X: " + j);
                }
                j += 500;
                System.out.println("+500 -> D: " + j);
            }

            if(a == 'M'){
                if(st == 'C'){
                    j -= 200;
                    System.out.println("-1 ->  V || X: " + j);
                }
                j += 1000;
                System.out.println("+1000 -> M: " + j);
            }

            st = a;
            sum = sum + j;
            j = 0;
            System.out.println("Sum: " + sum);
        }
        return sum;
    }
}

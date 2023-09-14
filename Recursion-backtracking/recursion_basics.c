#include<stdio.h>

// static int call =50;

// void printer(){
//     if(call!=0){
//         printf("%d\n",call);
//         call--;
//         printer();
//     }
//     else{
//         return;
//     }
// }

// int main(){
//     printer();
// }


// #include<stdio.h>

// int caller =0;

// void printer(){
//     if(caller == 50){
//         return;
//     }
//     else{
//         caller++;
//         printf("%d\n",caller);
//         printer(); //see differnce , unccoment this is recursion , function runs 50 times , comment this its linear program where function executing only once 
//     }
// }

// int main(){
//     printer();
// }

//sum of first N numbers 

//iterative

// int main(){
//     int sum = 0;

//     for(int i=1;i<=6;i++){
//         sum = sum+i;
//     }

//     printf("%d",sum);
// }

//recursive 

// void recur(int i,int sum){
//     if(i<1){
//         printf("%d", sum);
//         return;
//     }

//     recur(i-1,sum+i);
// }

// void main(){
//     recur(6,0);
// }


//recursive alt

// int sum = 0;
// int i = 6;

// void recur(){
//     if(i<0){
//         printf("%d",sum);
//         return;
//     }
//     sum = sum+i;
//     i--;
//     recur();
// }

// int main(){
//     recur();
// }

//another recursive alt

// int recur(int n){
//     if(n==0){
//         return 0;
//     }
//     return n+recur(n-1);
// }

// int main(){
//     printf("%d",recur(5));
// }

//factorial code-->

// int facto(int x){
//     if(x==0){
//         return 1;
//     }
//     if(x<0){
//         return -1;
//     }

//     return x*(facto(x-1));
// }

// int main(){
//     printf("%d",facto(5));
// }


//JAVA FINDING PALINDROME RECURSION
// import java.lang.*;
// import java.util.*;

// public class java {

//     static String tester = "ABCDEECBA";
//     static int stringsize = tester.length();

//     static boolean ispalindrome(int i){
//         if(i>=stringsize/2){
//             return true;
//         }

//         if(tester.charAt(i)!=tester.charAt(stringsize-i-1)){
//             return false;
//         }

//         return ispalindrome(i+1); //when both cases dont occur, i.e neither do we cross halfway nor do we break because they are same
//     }

//     public static void main(String[] args) {
//         System.out.println(ispalindrome(0));
//     } 
// }

//fibonacci using iteration

// import java.util.*;
// import java.lang.*;
// import java.io.*;


// class recursion_basics_java{
//     public static void main(String[] args) {
//         List<Integer> fibolist = new ArrayList<>();

//         fibolist.add(0);
//         fibolist.add(1);
//             //printing first 20 fibonacci terms
//         for(int i=2;i<22;i++){
//             fibolist.add(fibolist.get(i-2)+fibolist.get(i-1)); //adding the next number at the ith index
//         }

//         for(Integer k: fibolist){
//             System.out.println(k);
//         }
//     }
// }



//fibonacci using recursion
// int fibo(int n){
//     if(n<=1){
//         return n;
//     }

//     int last = fibo(n-2);
//     int first = fibo(n-1);

//     return last+first;
// }

// int main(){
//     printf("%d\n",fibo(10));
// }



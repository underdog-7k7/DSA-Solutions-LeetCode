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


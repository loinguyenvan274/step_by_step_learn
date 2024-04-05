#include<stdio.h>

int count = 0;
int sumA(int n){
    return n*(n+1)/2;
}
// begin longe to privet = 1 and n is sum array / 2
void find(int n,int sum,int privet,int s){
    
    if(sum == s){
        count += 1;
        return;
    }
    if(sum-s >= privet+1){
        if(sum-s <= n){
            count += 1;
            return;
        }
        for(int i = privet+1; i <= n ; i++){
            find(n,sum,i,s+i);
        }
    }else{
        privet = n;
        return;
    }
}

int main(){
    int n ;
    scanf("%d",&n);
    int  S = sumA(n);
    if(S%2== 0){
         find(n,sumA(n)/2,1,1);
    }
    printf("%d",count);
}
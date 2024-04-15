#include <stdio.h>
struct testai
{
    int data;
    struct testai *next;
};
void printd(char a[], char b[]){
    printf("%s %s",a,b);
}
void print(char a[], char b[],char c []){
    printf("%s %s %s",a,b,c);
}
int main(){
    print("anh","yeu","em");
}
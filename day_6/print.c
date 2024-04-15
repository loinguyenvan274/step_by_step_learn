#include <stdio.h>
#include <stdlib.h>
int Swap(int* x, int* y){
 int s = *x;
 *x = *y;
 *y = s;
}
int main()
{
    int num, *arr, i;
    scanf("%d", &num);
    arr = (int*) malloc(num * sizeof(int));
    for(i = 0; i < num; i++) {
        scanf("%d", arr + i);
    }


    for(i = 0; i<num/2; i++){
        Swap(&arr[i],&arr[num-1-i]);
    }

    for(i = 0; i < num; i++)
        printf("%d ", *(arr + i));
    return 0;
}
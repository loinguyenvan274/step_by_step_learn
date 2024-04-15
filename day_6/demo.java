public class demo{
    static void innit(int a[]){
        for(int i = 0; i<a.length;i++){
            a[i] = i;
        }
    }
    static int sum = 0;
    static void print(int b[],int a[]){
        if(b[a[0]]>b[a[1]])
            sum += b[a[0]]&b[a[1]];
        else
        sum += b[a[1]]&b[a[0]];
    }
    static boolean freshen(int a[],int k){
        for(int i = k-1 ; i>0; i--){
            if(a[i]-a[i-1] > 1){
                    a[i-1] += 1;
                for(int j = i;j < k;j++){
                    a[j] = a[j-1] + 1; 
                }
                return true;
            }
        }
        return false;
    }
    static void permutation(int b[]){
        int [] a = new int[b.length];
        innit(a);
        int k = 2;
        int max = b.length-1;
        boolean check = true;
        while(check){ 
            print(b,a);
            if(a[k-1] == max){
                check = freshen(a,k);
            }
            else{
                a[k-1] += 1;
            }
        }

    }
    public static void main(String[] args) {
        int [] b = {5,10,15,7,8,3,9,3,1};
        permutation(b);
        System.out.println(sum);
    }
}
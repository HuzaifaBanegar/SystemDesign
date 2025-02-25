package practiseQuestion;

class Main{

public static void main(String[] args){
    int[][] arr = {{0,0,0,0,1,1,1,1,1}, {0,0,1,1,1,1,1,1,1}, {0,0,0,0,0,1,1,1,1}};
    int ans = countMaxZeros(arr);
    System.out.println(ans);
}

public static int countMaxZeros(int[][] a){
    int n = a.length;
    int m = a[0].length;
    int i=0;
    int j=0;
    int count =0;
    while(i<n && j<m){
        if(a[i][j] ==0){
            count++;
            j++;
        }else{
            i++;
        }
    }
    return count;

}
}


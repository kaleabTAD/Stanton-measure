public class Main {
    public static void main(String[] args) {
        int []a={1};
        System.out.println(stantonMeasure(a));
    }
    static int stantonMeasure(int []a){
        int count=0,countN=0;
        if (a.length==0)return 0;
        for (int i=0;i<a.length;i++){
            if (a[i]==1){
                count++;
            }
        }
        for (int i = 0; i <a.length ; i++) {
            if (count==a[i]){
                countN++;
            }
        }
        return countN;
    }
}
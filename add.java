class adds{
    public int addition(int a,int b){
        int result=a*b;
        return result;
    }
}
public class add {
    public static void main(String[] args) {
        int a=5,b=8;

        adds ad=new adds();
        int result=ad.addition(a, b);
        System.out.println(result);
    }
}

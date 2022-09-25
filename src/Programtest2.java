public class Programtest2 {
    int a, b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
    public void resultOfDeviding(int a, int b){
        if (a % b ==0){
            System.out.println("devide "+a/b);
        }else{
            System.out.println("not devide "+a%b);
        }
    }
    public static void main(String[] args) {
        Programtest2 number3 =new Programtest2();
        number3.resultOfDeviding(4,2);
    }
}

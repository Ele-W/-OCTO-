# -OCTO-
//乘法表
public class T04 {
    public static void main(String[] args) {
        int i,j,c;
        for (i=1;i<=9;i++) {
            for (j = 1; j <= i; j++) {
                c=i*j;
                System.out.print("  "+i+"*"+j+"="+c);
            }
            System.out.print("\n");
        }
    }
}

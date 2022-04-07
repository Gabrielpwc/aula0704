import javax.print.attribute.standard.Media;

public class ex3 {
    public static void main(String[] aStrings) {
        float Media=0;
        float A[]={ 8.0f, 7.5f, 4.5f, 9.0f};
        float n= A.length;
        for (int i=0; i<n;i++){
            Media=Media+A[i];
        }
        System.out.println("A média de  8.0, 7.5, 4.5 e 9.0 é ="+ (float)(Media /n));
    }
}

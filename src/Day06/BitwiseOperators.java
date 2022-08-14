package Day06;

public class BitwiseOperators {
    public static void main(String[] args) {
        //Bitwise Operators,
        // &, |, ^, ~, <<(sola kaydır),>>( sağa kaydır), >>>
        //         76543210
        int x=5; //00000101
        int y=7; //00000111
        int r=x&y;
        int r2=x|y;
        System.out.println(r);
        System.out.println(r2);
         int sayi=128; //10000000
         sayi=sayi>>1; // bir sağa kaydır işlemi (>>1), iki sağa kaydır işlemi (>>2)
        System.out.println(sayi);
        sayi=sayi<<2; // sola kaydır işlrmi ( 2 sola kaydır )
        System.out.println(sayi);



    }
}

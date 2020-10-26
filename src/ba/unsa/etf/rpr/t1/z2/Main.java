package ba.unsa.etf.rpr.t1.z2;
import java.util.Scanner;

public class Main {

    public static int sumaCifara(int broj){
        int suma = 0, cifra = 0;
        while(broj!= 0){
            suma = suma + broj%10;
            broj = broj/10;
        }
        return suma;
    }

    public static void main(String[] args) {
	Scanner ulaz = new Scanner(System.in);
	System.out.println("Unesite broj n: ");
	int n = ulaz.nextInt();
	int i = 1;
	for(i = 1; i<=n; i++) if( i%sumaCifara(i) == 0) System.out.println(i + " ");
    }
}

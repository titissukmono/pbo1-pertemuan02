import java.util.Scanner;

public class inputOutput{
public static void main(String [] args){
Scanner scanner = new Scanner(System.in);
String nama;
int sks;
double ipk;

System.out.print("Masukan Nama anda : ");
nama = scanner.nextLine();
System.out.println("Hai,"+nama);


System.out.print("Masukan Jumlah sks anda : ");
sks = scanner.nextInt();


System.out.print("Masukan IPK Sementara : ");
ipk = scanner.nextDouble();

double jumlah =ipk*sks;
System.out.print("Total Nilai ="+jumlah);

}
}
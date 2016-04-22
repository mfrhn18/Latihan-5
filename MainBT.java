import java.util.Scanner;
public class MainBT {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        System.out.print("Input jumlah tamu : ");
        int jt = in.nextInt();
        TugasBT hm[] = new TugasBT(jt);
        for(int a=0; a<jt; a++){
            System.out.print("Masukkan nama anda : ");
            String name1 = in.next();
            System.out.print("Masukkan alamat anda : ");
            String address1 = in.next();
            hm[a] = new TugasBT (String name, String address);
        }
        for(int b=0; b<jt; b++){
            hm[b].displayMessage();
        }
        System.out.println("Jumlah tamu yang hadir "+TugasBT.getCount()+" orang.");
    }
}

import java.util.Scanner;

public class QuyDoiTienTe {
    public static void main(String[] args) {
        int rate = 23000;
        int USD = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so tien muon quy doi: ");
        USD = input.nextInt();
        System.out.println("Doi sang tien Viet la "+USD*rate+" VND");

    }
}

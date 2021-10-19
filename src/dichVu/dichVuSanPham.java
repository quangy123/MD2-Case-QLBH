package dichVu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class dichVuSanPham {
public void insetr(){
    Scanner inputs = new Scanner(System.in);
    System.out.println("Nhập thông tin sản phẩm : ");

    try{
        System.out.println("mã: ");
        int id = inputs.nextInt();

        System.out.println("Tên:");
        String tensp = inputs.nextLine();

        System.out.println("Số lượng:");
        int soLuong = inputs.nextInt();

        System.out.println("ghi chú:");
        String ghiChu = inputs.nextLine();
    }
    catch (InputMismatchException ei){
        System.out.println("bạn đã nhập sai giá trị! Mời bạn nhập lại !");
    }
    catch (Exception e){
        System.out.println(e.getMessage());
    }
}
}

package dichVu;

import model.donHang;
import model.sanPham;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Aap {
    public static List<sanPham>SANPHAM = new ArrayList<sanPham>();
    public static List<donHang>DONHANG = new ArrayList<donHang>();
    public static void menu(){
        System.out.println("------------------Danh sách chức năng----------------------------");
        System.out.println("1. Thêm mới sản phẩm");
        System.out.println("2. Hiển thị sản phẩm");
        System.out.println("3. Sửa sản phẩm");
        System.out.println("4. Xóa sản phẩm");
        System.out.println("5. Mua hàng");
        System.out.println("6. Hiện thị danh sách đơn hàng");
        System.out.println("7. Thoát.");
    }

    public static void main(String[] args) {
        int function = 0 ;

        do {
            Scanner input = new Scanner(System.in);
            menu();
            System.out.println("Mời bạn chọn chức năng");
            function = input.nextInt();
            try{

            }
            catch (InputMismatchException ei){
                System.out.println("bạn đã nhập sai giá trị! Mời bạn nhập lại !");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while (function != 0 );
        System.out.println("cảm ơn bạn đã ghé shop!");
    }
}


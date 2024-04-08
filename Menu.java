/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.xuongoop;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Menu {
    public static void main(String[] args) {
         SinhVien_Service svs = new SinhVien_Service();
        Scanner s = new Scanner(System.in);
        int menu =0;
        do {
            System.out.println("------------ menu-------------");
            System.out.println("0.Thoat");
            System.out.println("1.Nhap danh sach sinh vien");
            System.out.println("2.Xuat danh sach sinh vien");
            System.out.println("3.Tim sinh vien theo ma");
            System.out.println("4.Xoa sinh vien theo ma");
            System.out.println("5.Tim sinh vien theo diem");
            System.out.println("6.Cap nhat sinh vien");
            System.out.println("7.Sap xep theo ho");
            System.out.println("8.Sap xep theo diem TB");
            System.out.println("9.So luong sinh vien");
            System.out.println("10.Xoa toan bo"); 
            System.out.println("------------------------------");
            System.out.println("Moi ban nhap chuc nang:");
            menu = Integer.parseInt(s.nextLine());
            
            switch (menu) {
                case 0:
                    System.out.println("thoat");
                    break;
                case 1:
                    svs.nhapDanhSach();
                    break;
                case 2:
                    svs.xuatDanhSach();
                    break;
                case 3:
                    svs.timSV();
                    break;
                case 4:
                    svs.xoaSV();
                    break;
                case 5:
                    svs.timDiem();
                    break;
                case 6:
                    svs.capNhat();
                    break;
                case 7:
                    svs.sapXepTen();
                    break;
                case 8:
                    svs.sapxepDiemTB();
                    break;
                case 9:
                    svs.soLuong();
                    break;
                case 10:
                    svs.clear();
                    break;
                default:
                    System.out.println("khong hop le");
                    break;
            }
        }while (menu !=0) ;
    }
}

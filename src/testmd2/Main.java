package testmd2;


import ghidocfile.FileDanhBa;
import neww.DanhBa;
import neww.QuanLyDanhBa;

import java.io.IOException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        QuanLyDanhBa qldb=new QuanLyDanhBa();

        Scanner scanner =new Scanner(System.in);
        int choice=0;
        do {
            System.out.println("------ MENU-------");
            System.out.println("1: Thêm danh bạ");
            System.out.println("2: Hiển thị danh bạ");
            System.out.println("3: Tìm kiếm người dùng qua số điện thoại");
            System.out.println("4: Sửa thông tin người dùng");
            System.out.println("5: Xoá thông tin qua số điện thoại");
            System.out.println("6: Ghi vào  file");
            System.out.println("7: Đọc thông tin file");
            System.out.println("8: Thoát");

            try {
                choice = scanner.nextInt();
//      bắt ngoại lệ1
            } catch (InputMismatchException a) {
                System.out.println("nhập sai , trở lại menu");
                scanner.nextLine();
            }
            if(choice==1){
//    thêm danh bạ
                System.out.println("nhập số điên thoại");
                int soDt=scanner.nextInt();
                System.out.println("nhập ngày sinh");
                int day= scanner.nextInt();
                System.out.println("nhập tháng sinh");
                int motlh= scanner.nextInt();
                System.out.println("nhập năm sinh");
                int year= scanner.nextInt();
                scanner.nextLine();
                System.out.println("nhập tên");
                String name=scanner.nextLine();
                System.out.println("nhập nhóm");
                String group=scanner.nextLine();
                System.out.println("nhập giới tính");
                String sex=scanner.nextLine();
                System.out.println("nhập địa chỉ");
                String address=scanner.nextLine();
                System.out.println("nhập email");
                String email=scanner.nextLine();

                qldb.add(new DanhBa(soDt,LocalDate.of(year,motlh,day),name,group,sex,address,email));
            }

            else if(choice==2){
//        hiển thị
                qldb.display();
            }
            else if(choice==3){
//tìm kiếm
                System.out.println("nhập số điên thoại");
                int soDt=scanner.nextInt();
                qldb.seach(soDt);
            }
            else if(choice==4){
//    sửa
                System.out.println("nhập số điên thoại");
                int soDt1=scanner.nextInt();
                System.out.println("nhập số điên thoại");
                int soDt=scanner.nextInt();
                System.out.println("nhập ngày sinh");
                int day= scanner.nextInt();
                System.out.println("nhập tháng sinh");
                int motlh= scanner.nextInt();
                System.out.println("nhập năm sinh");
                int year= scanner.nextInt();
                scanner.nextLine();
                System.out.println("nhập họ tên");
                String name=scanner.nextLine();
                System.out.println("nhập nhóm");
                String group=scanner.nextLine();
                System.out.println("nhập giới tính");
                String sex=scanner.nextLine();
                System.out.println("nhập địa chỉ");
                String address=scanner.nextLine();
                System.out.println("nhập email");
                String email=scanner.nextLine();
                DanhBa danhBa=new DanhBa(soDt,LocalDate.of(year,motlh,day),name,group,sex,address,email);
                qldb.edit(soDt1,danhBa);
            }
            else if ((choice==5)){
//      xoa
                System.out.println("nhập số điên thoại");
                int soDt1=scanner.nextInt();
                qldb.delete(soDt1);
            }
            else if(choice==6){

                FileDanhBa.writeToFile("test.csv",qldb.getDanhBaList());
            }
            else if (choice==7){
                FileDanhBa.list("test.csv");
            }

        }while (choice!=8);


    }
}

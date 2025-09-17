package com.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Nguoi {
    private String Hoten;
    private LocalDate Ngaysinh;
    private String Congviec;
    public Nguoi(){

    }
    public Nguoi(String Hoten,LocalDate Ngaysinh,String Congviec){
        this.Hoten=Hoten;
        this.Ngaysinh=Ngaysinh;
        this.Congviec=Congviec;

    }
    public void Nhaptt(Scanner sc){
        System.out.println("\tHo va ten ");
        Hoten=sc.nextLine();
        System.out.println("Ngay sinh theo dinh dang dd/MM/yyyy ");
        String Ngay=sc.nextLine();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Ngaysinh=LocalDate.parse(Ngay,formatter);
        System.out.println("Nhap cong viec cua ban");
        Congviec=sc.nextLine();
    }
    public void Hienthi(){
        System.out.println("Ho va ten la "+Hoten);
        System.out.println("Ngay sinh la "+Ngaysinh);
        System.out.println("Cong viec la "+Congviec);
    }
}

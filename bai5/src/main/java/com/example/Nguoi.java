package com.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Nguoi {
    private String Hoten_103;
    private LocalDate Ngaysinh_103;
    private String Congviec_103;
    public Nguoi(){

    }
    public Nguoi(String Hoten_103,LocalDate Ngaysinh_103,String Congviec_103){
        this.Hoten_103=Hoten_103;
        this.Ngaysinh_103=Ngaysinh_103;
        this.Congviec_103=Congviec_103;

    }
    public void Nhaptt(Scanner sc){
        System.out.println("\tHo va ten ");
        Hoten_103=sc.nextLine();
        System.out.println("Ngay sinh theo dinh dang dd/MM/yyyy ");
        String Ngay=sc.nextLine();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Ngaysinh_103=LocalDate.parse(Ngay,formatter);
        System.out.println("Nhap cong viec cua ban");
        Congviec_103=sc.nextLine();
    }
    public void Hienthi(){
        System.out.println("Ho va ten la "+Hoten_103);
        System.out.println("Ngay sinh la "+Ngaysinh_103);
        System.out.println("Cong viec la "+Congviec_103);
    }
    public int getTuoi(int namHienTai){
        return namHienTai-Ngaysinh_103.getYear();
    }
}

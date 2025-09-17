package com.example;

import java.time.LocalDate;
import java.util.Scanner;

public class Hodan extends Nguoi {
    private int stv_103;
    private String Sonha_103;
    // ham luu tru thong tin thanh vien
    private Nguoi[] list;
    public Hodan(){
        list=new Nguoi[10];
    }
    public Hodan(String Hoten,LocalDate Ngaysinh,String Congviec,int stv_103,String Sonha_103){
        super(Hoten,Ngaysinh,Congviec);
        this.stv_103=stv_103;
        this.Sonha_103=Sonha_103;
    }
    public void Nhaptt(Scanner sc){
        System.out.println("Nhap so nguoi trong ho");
        stv_103=sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap so nha");
        Sonha_103=sc.nextLine();
        for(int i=0;i<stv_103;i++){
            System.out.println("Nhap thong tin thanh vien thu "+(i+1));
            list[i]=new Nguoi();
            list[i].Nhaptt(sc);
        }
    }
    public void Hienthi(){
        System.out.println("So thanh vien trong ho "+stv_103);
        System.out.println("So nha "+Sonha_103);
        for(int i=0;i<stv_103;i++){
            System.out.println("Thong tin thnah vien thu"+(i+1));
            list[i].Hienthi();
        }
    }
    // ham lay ra thanh vien trong ho dan
    public Nguoi[] getList(){
        return list;
    }
    public int getThanhVien(){
        return stv_103;
    }
}

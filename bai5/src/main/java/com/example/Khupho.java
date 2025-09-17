package com.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Khupho {
    private ArrayList<Hodan> dshd;
    public Khupho(){
        dshd=new ArrayList<Hodan>(10);
    }
    public void themhd(Hodan hd){
        dshd.add(hd);
    }
    public void Nhaptt(Scanner sc){
        System.out.println("Nhap so ho dan");
        int shd=sc.nextInt();
        Hodan hodan;
        sc.nextLine();
        for(int i=0;i<shd;i++){
            System.out.println("Nhap ho dan thu "+(i+1));
            hodan=new Hodan();
            hodan.Nhaptt(sc);
            themhd(hodan);
        }
    }
    public void Hienthi(){
        for(Hodan hodan: dshd){
            hodan.Hienthi();
        }
    }
    public void Timkiemho(){
        int namHienTai= LocalDate.now().getYear();
        boolean Huongduong=false;
        for(Hodan hodan: dshd){
            Nguoi[] ds=hodan.getList();
            for( int i=0;i<hodan.getThanhVien();i++){
                if(ds[i].getTuoi(namHienTai)>=80){
                    hodan.Hienthi();
                    Huongduong=true;
                    break;
                }
            }
        }
        if(!Huongduong){
            System.out.println("Khong co ho dan nao co thanh vien tren 80 tuoi");
        }
    }
    
}

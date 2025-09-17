package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Khupho kp=new Khupho();
        int chon;
        do { 
            System.out.println("1.Nhap thong tin ho dan\t 2.Hien thi thong tin\t 3.Tim kiem ho dan");
            chon=sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1:
                    kp.Nhaptt(sc);
                    break;
                case 2:
                    kp.Hienthi();
                    break;
                case 3:
                    kp.Timkiemho();
                    break;
            
                default:
                    break;
            }
        } while (chon!=0);
    }
}
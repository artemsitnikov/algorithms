/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scan;

/**
 *
 * @author Артём
 */
class Stud {
    String name;
    String sname;
    String fname;
    String birth;
    String addr;
    String phone;
    
    Stud(String n, String s, String f, String b, String a, String p) {
        name = n;
        sname = s;
        fname = f;
        birth = b;
        addr = a;
        phone = p;
    }
    void printlist() {
        System.out.println(name + sname + fname + birth + addr + phone);
    }
}

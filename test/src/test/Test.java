/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author INT105
 */
public class Test {
    public static void main(String[] args) {
        //(int buildNumber,String village,String street ,String district,String province,int zipcode,String country)
        //Adress add1=new Adress;
        Adress add1=new Adress("201/31","Tipnakorn","Phrachautid","Thung-kru","Bangkok",10140,"Thailand"); 
        Adress add2=new Adress("201/32","Tipnakorn","Phrachautid","Thung-kru","Bangkok",10140,"Thailand"); 
        Adress add3=new Adress("201/33","Tipnakorn","Phrachautid","Thung-kru","Bangkok",10140,"Thailand"); 
        Adress add4=new Adress("201/34","Tipnakorn","Phrachautid","Thung-kru","Bangkok",10140,"Thailand"); 
        Adress[] total={add1,add2,add3};
        Adress[] total2={add2};
        Person patric = new Person(2115,total);
         System.out.println(patric);
               total[2].setAdress("555", "Bangmod", "phrachaUtid", "Thunfg", "Samutprakan", 10150, "lao");//เปลี่ยนที่อยู่
               
                System.out.println(patric);
        //patric.setAddr(arraddr2);
        add1.removeAdress();
        System.out.println(patric);
        
        
    }
}

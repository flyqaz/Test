package cn.test;

public class Test { 
        String name="a"; 
        String go(){ 
            return "- function in A"; 
        } 
    } 
class B extends Test { 
        String name="b"; 
        String go(){ 
            return "- function in B"; 
        } 
    public static void main(String[] args) { 
        Test a= new B(); 
        System.out.println(a.name+a.go()); 
        }   
    } 
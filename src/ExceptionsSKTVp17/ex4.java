/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionsSKTVp17;

class MyClass {
public void myMethod() throws Exception {
Exception exception = new Exception("My Exception");
throw exception;}}


/**
 *
 * @author user
 */
public class ex4 {
public static void main(String[] args){
try {
MyClass instance = new MyClass();
instance.myMethod();}
catch (Exception e){
System.out.println("Mesage: "+ e.getMessage());
System.out.println("Stack trace");
e.printStackTrace();}}    
}

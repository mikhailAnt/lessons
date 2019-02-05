/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionsSKTVp17;

/**
 *
 * @author user
 */
public class ex3 {
    public static void main (String[] args){
    try {
    throw new Exception("My Exception");}
    catch (Exception e){
    System.out.println("Exception Proceed");
    System.out.println(e.getMessage());
    }}
}


package test;

import java.util.Scanner;

/**
 *
 * @author beyza
 */

public class test1{
   
public static void main(String []args){
Scanner sc = new Scanner(System.in);   
  System.out.println("Welcome to FieldLine. Please enter your personal data to continue.");

          user.askuserInf();
          user.askcreditcInf();
          System.out.println("Thank you for trusting us. What are you looking for? 1- Find a product for adding to favourites, %n 2- Buying a product, 3-Send us a message.");
          int select = sc.nextInt();
          switch(select){
              case 1: System.out.println("You have chosen add a favourite product.");
              order b1 = new order();
              b1.favouriteProduct();
               break;
              case 2: System.out.println("You have chosen to buy a product.");
              order b2 = new order();
              b2.productOrder();
              break;
              case 3: System.out.println("You can type anything you want to let us know.");
              String message = sc.next();
                  System.out.println("If we can reach out this message. We will do what is necessary. Thank you for sharing your thoughts. We wish you a good day.");
                  break;
          }
          
          }




}
package com.ecommerce.product;

import UserInformation.ProductInfo;
import UserInformation.User;


import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

import UserInformation.ProductInfo;

public class Product {
    Scanner s = new Scanner(System.in);
    private int totalPrice;

    public void register() {
        System.out.println("Enter your name:");
        String str = s.nextLine();
        System.out.println("Enter your mobNo:");
        long l = s.nextLong();
        s.nextLine();
        System.out.println("enter your Password:");
        String str1 = s.nextLine();
        System.out.println("Confirm password");
        String st = s.nextLine();
        System.out.println("Registration sucessfully");
        System.out.println("you can show now...");
        System.out.println("Enter your choice code from below list");
        System.out.println("1.login");
        System.out.println("2.logout");
        int cha = s.nextInt();
        s.nextLine();
        if (cha == 1) {
            System.out.println("Login");
            System.out.println("Enter your username");
            String str2 = s.nextLine();
            System.out.println("Enter your password");
            String str3 = s.nextLine();
            System.out.println("Confirm password");
            String str4 = s.next();
            if (str3.equals(str4)) {
                System.out.println("Login sucessfully");
                addproduct();
            } else {
                System.out.println("invalid password");
            }
        } else {
            System.out.println("Logout");
        }
    }

    public void addproduct() {
        ProductInfo p = new ProductInfo(104, "Laptop", "intel core i5 12th Gen 16GB RAM", 4.5f, 52000);
        ProductInfo p1 = new ProductInfo(102, "Smartwatch", "Noise 15.4 inch display", 4.0f, 1800);
        ProductInfo p3 = new ProductInfo(101, "smartphone", "vivo 12GB RAM & 256 ROM", 4.4f, 25000);
        ProductInfo p4 = new ProductInfo(103, "Laptop Bag", "length 35L", 4.0f, 800);
        Comparator<ProductInfo> is = (o1, o2) -> {
            return Integer.compare(o1.getProductId(), o2.getProductId());
        };
        TreeSet<ProductInfo> productSet = new TreeSet<>(is);
        productSet.add(p);
        productSet.add(p1);
        productSet.add(p3);
        productSet.add(p4);
        totalPrice = 0;
        while (true) {
            for (ProductInfo p2 : productSet) {
                System.out.println(p2);
            }
            System.out.println("Choose product from above list by id:");
            System.out.println("Enter id:");
            int i = s.nextInt();
            for (ProductInfo p2 : productSet) {
                if (p2.getProductId() == i) {
                    totalPrice += p2.getProductPrice();
                    System.out.println(" You have chosen: " + p2.getProductId() + ", " + p2.getProductName() + ", " + p2.getProductInfo() + " ," + p2.getProductRate() + " ," + p2.getProductPrice());
                    System.out.println("Total price: " + totalPrice);
                }
            }
            System.out.println("you want to add more products?");
            System.out.println("Enter 1 for adding more products to your cart , Enter 2 for exit");
            int i2 = s.nextInt();
            if (i2 == 2) {
                System.out.println("Existing");
            System.out.println("your cart (:");
         for(ProductInfo p2:productSet) {
        	 System.out.println(p2);
         }
          System.out.println("you want to remove any product?");
          System.out.println("1.Remove products  2.proceed further");
          int r=s.nextInt();
          
          if(r==1) {
        	  System.out.println("remove products");
        	  
         	 int id=s.nextInt();
         	 for(ProductInfo p2:productSet) {
         		 if(p2.getProductId()==id) {
         			 productSet.remove(p2);
         			 totalPrice -=p2.getProductPrice();
         			 System.out.println("product remove from cart");
         			 break;
         		 }
         	 }
        
          }   else {
        	System.out.println("proceed further");
        	
        }
          System.out.println("your total bill is:" + totalPrice);
          System.out.println("----------------thanks for shopping----------------");
          break;
            }
            
            }
    }}



   
   
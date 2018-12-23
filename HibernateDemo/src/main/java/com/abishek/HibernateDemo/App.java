package com.abishek.HibernateDemo;

import model.Product;
import model.ProductDAO;

public class App 
{
    public static void main( String[] args )
    {
       Product pd = new Product("Google",30000);
       ProductDAO pdo = new ProductDAO();
       pdo.insertProduct(pd);
       System.out.println("Sucess");
    }
}

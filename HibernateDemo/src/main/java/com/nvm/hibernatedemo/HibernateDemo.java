/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.nvm.hibernatedemo;

import com.nvm.pojo.Product;
import com.nvm.repository.impl.ProductRepositoryImpl;
import java.util.HashMap;
import javax.persistence.Query;
import org.hibernate.Session;
import java.util.List;
import java.util.Map;

/**S
 *
 * @author nmau4
 */
public class HibernateDemo {

    public static void main(String[] args) {
        ProductRepositoryImpl s = new ProductRepositoryImpl();
        Map<String, String> params = new HashMap<>();
        params.put("kw", "Galaxy");
        params.put("fromPrice", "18000000");
        params.put("toPrice", "20000000");


        
        
                
                

        s.getProducts(params).forEach(p-> System.out.println(p.getId() + " - " +   p.getName() + " - " + p.getPrice()));
        
        
        
//        try(Session s = HibernateUtils.getFactory().openSession()){
//            Query q = s.createNamedQuery("Product.findAll");
//            List<Product> products = q.getResultList();
//            products.forEach(p -> System.out.println(p.getName()));
//            Query q = s.createQuery("FROM Category");
//            List<Category> cates = q.getResultList();
//            
//            cates.forEach(c -> System.err.println(c.getName()));
            
            
        }
    }


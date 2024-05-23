package com.nvm.hibernatedemo;

import com.nvm.pojo.Category;
import com.nvm.pojo.Comment;
import com.nvm.pojo.OrderDetail;
import com.nvm.pojo.ProdTag;
import com.nvm.pojo.Product;
import com.nvm.pojo.SaleOrder;
import com.nvm.pojo.Tag;
import com.nvm.pojo.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import java.util.Properties;
import org.hibernate.cfg.Environment;

public class HibernateUtils {

    private static final SessionFactory factory;

    static {
        Configuration conf = new Configuration();
        conf.configure("hibernate.cfg.xml");
        
//        Properties props = new Properties();
//        props.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
//        props.put(Environment.URL, "jdbc:mysql://localhost/saledb");
//        props.put(Environment.USER, "root");
//        props.put(Environment.PASS, "115116");
//        props.put(Environment.SHOW_SQL, "true");
//                conf.setProperties(props);
        
        conf.addAnnotatedClass(Category.class);
        conf.addAnnotatedClass(Product.class);
        conf.addAnnotatedClass(Tag.class);
        conf.addAnnotatedClass(SaleOrder.class);
        conf.addAnnotatedClass(OrderDetail.class);
        conf.addAnnotatedClass(User.class);
        conf.addAnnotatedClass(ProdTag.class);
        conf.addAnnotatedClass(Comment.class);


       

        




        ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
        factory = conf.buildSessionFactory(registry);
    }

    public static SessionFactory getFactory() {
        return factory;
    }
}

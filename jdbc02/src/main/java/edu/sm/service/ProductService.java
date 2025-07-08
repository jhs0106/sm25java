package edu.sm.service;

import edu.sm.dto.Product;
import edu.sm.frame.ConnectionPool;
import edu.sm.frame.SmRepository;
import edu.sm.frame.SmService;
import edu.sm.repository.ProductRepository;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class ProductService implements SmService<Product, Integer> {
    ProductRepository productRepository;
    ConnectionPool connectionPool;

    public ProductService(){
        this.productRepository = new ProductRepository();
        try{
            connectionPool = ConnectionPool.create();
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void register(Product product) throws Exception {
        Connection con = connectionPool.getConnection();
        try{
            con.setAutoCommit(false);
            productRepository.insert(product, con);
            con.commit();
        }catch(Exception e){
            throw e;
        }finally {
            if(con!=null){
                connectionPool.releaseConnection(con);
            }
        }
    }

    @Override
    public void modify(Product product) throws Exception {
        Connection con = connectionPool.getConnection();
        try{
            productRepository.update(product, con);
        }catch(Exception e){
            throw e;
        }finally {
            if(con!=null){
                connectionPool.releaseConnection(con);
            }
        }
    }

    @Override
    public void remove(Integer integer) throws Exception {
        Connection con = connectionPool.getConnection();
        try{
            productRepository.delete(integer, con);
        }catch(Exception e){
            throw e;
        }finally {
            if(con!=null){
                connectionPool.releaseConnection(con);
            }
        }
    }

    @Override
    public List<Product> get() throws Exception {
        List<Product> products = new ArrayList<>();
        Connection con = connectionPool.getConnection();
        try{
            products = productRepository.selectAll(con);
        }catch(Exception e){
            throw e;
        }finally {
            if(con!=null){
                connectionPool.releaseConnection(con);
            }
        }
        return products;
    }

    @Override
    public Product get(Integer integer) throws Exception {
        Product product = null;
        Connection con = connectionPool.getConnection();
        try{
            product = productRepository.select(integer, con);
        }catch(Exception e){
            throw e;
        }finally {
            if(con!=null){
                connectionPool.releaseConnection(con);
            }
        }
        return product;
    }
}
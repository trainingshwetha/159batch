package com.mphasis.training.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mphasis.training.pojos.Product;
import com.mphasis.training.util.DbUtil;

public class ProductDaoImpl implements ProductDao {
private Connection con;
	public ProductDaoImpl() {
		con=DbUtil.getConnection();
	}
	@Override
	public List<Product> getAllProduct() {
		List<Product> products=new ArrayList<>();
		try {
			Statement st=con.createStatement();
			String sql="select * from product";
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				Product p=new Product();
				p.setPid(rs.getInt(1));
				p.setPname(rs.getString("pname"));
				p.setCost(rs.getDouble(3));
				p.setQuantity(rs.getShort(4));
				products.add(p);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return products;
	}
	@Override
	public void insertProduct(Product p) {
		String sql="insert into product values(?,?,?,?)";
		try {
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setInt(1, p.getPid());
		pst.setString(2, p.getPname());
		pst.setDouble(3, p.getCost());
		pst.setInt(4, p.getQuantity());
		int i=pst.executeUpdate();
		if(i>0) System.out.println("record inserted");
		else System.out.println("record not inserted");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void updateProduct(int id, double cost, int quantity) {
String sql="update product set cost=?, quantity=? where pid=?";
		try {
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setDouble(1, cost);
			pst.setInt(2, quantity);
			pst.setInt(3, id);
			pst.executeUpdate();	
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void deleteProduct(int id) {
		String sql="delete from product where pid=?";
		try {
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1, id);
			pst.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public List<Product> getProductByName(String name) {
		List<Product> products=new ArrayList<>();
		try {
			String sql="select * from product where pname=?";
			PreparedStatement st=con.prepareStatement(sql);
			st.setString(1, name);
			ResultSet rs=st.executeQuery();
			while(rs.next()) {
				Product p=new Product();
				p.setPid(rs.getInt(1));
				p.setPname(rs.getString("pname"));
				p.setCost(rs.getDouble(3));
				p.setQuantity(rs.getShort(4));
				products.add(p);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return products;
	}
	@Override
	public Product getProductById(int pid) {
		Product product=new Product();
		try {
			String sql="select * from product where pid=?";
			PreparedStatement st=con.prepareStatement(sql);
			st.setInt(1, pid);
			ResultSet rs=st.executeQuery();
			if(rs.next()) {
				product.setPid(rs.getInt(1));
				product.setPname(rs.getString("pname"));
				product.setCost(rs.getDouble(3));
				product.setQuantity(rs.getShort(4));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return product;
	}	
}

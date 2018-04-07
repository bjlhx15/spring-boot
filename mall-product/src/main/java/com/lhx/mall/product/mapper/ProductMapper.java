package com.lhx.mall.product.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.lhx.mall.product.bean.Product;

@Mapper
public interface ProductMapper {
	@Insert("insert into products(pname,type,price)values(#{pname},#{type},#{price})")
	public Integer addProduct(Product product);

	@Delete("delete from products where id=#{args1}")
	public Integer deleteById(Integer id);

	@Update("update products set pname=#{pname},type=#{type},price=#{price} where id=#{id}")
	public Integer update(Product producr);

	@Select("select * from products where id= #{args1}")
	public Product getById(Integer id);

	@Select("select * from products order by id desc")
	public List<Product> queryByLists();
}

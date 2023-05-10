package com.sheryians.major.repository;

import com.sheryians.major.model.Category;
import com.sheryians.major.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;


public interface ProductRepository extends JpaRepository<Product,Long> {
//  @Query("SELECT p from Product p WHERE concat( p.name ,p.category)like %?1%")
//  public List<Product>search(String keyword);

  List<Product> findAllByCategory_Id( int id);
}

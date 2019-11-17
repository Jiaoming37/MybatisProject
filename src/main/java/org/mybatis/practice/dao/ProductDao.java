package org.mybatis.practice.dao;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.practice.MybatisFactory;
import org.mybatis.practice.entity.Product;
import org.mybatis.practice.mapper.ProductMapper;

public class ProductDao {
    public Long addNew(Product product) {
        try (SqlSession session = MybatisFactory.getSession()) {
            ProductMapper mapper = session.getMapper(ProductMapper.class);
            Long id = mapper.insert(product);
            session.commit();
            return id;
        }
    }

    public Product queryById(Long id) {
        try (SqlSession session = MybatisFactory.getSession()) {
            ProductMapper mapper = session.getMapper(ProductMapper.class);
            return mapper.queryById(id);
        }
    }
}

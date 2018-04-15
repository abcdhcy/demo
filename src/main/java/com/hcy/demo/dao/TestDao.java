package com.hcy.demo.dao;

import com.hcy.demo.eneity.Test;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TestDao extends JpaRepository<Test,Long>{

}

package com.example.pro5_6.repository;

import com.example.pro5_6.entity.Xiaomi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface XiaomiRepo extends JpaRepository<Xiaomi, Integer> {

}

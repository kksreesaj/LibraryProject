package com.learning.emp.repository;


import com.learning.emp.model.LibBooksModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends JpaRepository<LibBooksModel,Long> {
}

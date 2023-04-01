package com.project.board.author.repository;

// mybatis 이전에 ibatis 라는 기술을 활용했었기에 여전히 ibatis 패키지를 사용하고 있음
import com.project.board.author.domain.Author;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface AuthorMapper {

    List<Author> findAll();
    Optional<Author> findById(Long id);
    void save(Author author);
    Optional<Author> findByEmail(String email);
//    List<Author> findAllFetchJoin();



}
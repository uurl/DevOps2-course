package com.baeldung.mybatis.spring;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface ArticleMapper {
    @Select("SELECT * FROM ARTICLES WHERE id = #{id}")
    Article getArticle(@Param("id") Long id);

    @Select ( "{CALL fn_vista(#{id})")
    void executeView(@Param("id") Long id);

}



/*
try
  conn = X. getConnection
  stmt = conn.executeQuery( "Select *..")
  result = stmt.getResultset

  while (result ) {
      List r =
          result.get(1).toStrin
      }
  catch() {
      return ...
    }


  finally {
   if (result != null)
       result.close()
      if (statment != null)
      statemnt.close()
      if (conn != null)
      conn.close()
      }
*/
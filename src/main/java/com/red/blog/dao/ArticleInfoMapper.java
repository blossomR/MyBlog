package com.red.blog.dao;

import com.red.blog.entity.ArticleInfo;
import com.red.blog.entity.ArticleInfoExample;

import java.util.List;

public interface ArticleInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ArticleInfo record);

    int insertSelective(ArticleInfo record);

    List<ArticleInfo> selectByExample(ArticleInfoExample example);

    ArticleInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ArticleInfo record);

    int updateByPrimaryKey(ArticleInfo record);
}
package com.findgeo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.findgeo.dto.postSearchDto;
import com.findgeo.entity.Posts;

public interface PostsRepositoryCustom {
	Page<Posts> getPostPage(postSearchDto postSearchDto, Pageable pageable);
}

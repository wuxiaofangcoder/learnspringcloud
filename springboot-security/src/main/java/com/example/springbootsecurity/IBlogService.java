package com.example.springbootsecurity;


import java.util.List;


public interface IBlogService {
    List<Blog> getBlogs();
    void deleteBlog(long id);
}

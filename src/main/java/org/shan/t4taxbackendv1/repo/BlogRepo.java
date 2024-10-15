package org.shan.t4taxbackendv1.repo;

import org.shan.t4taxbackendv1.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepo extends JpaRepository<Blog, Integer> {
}

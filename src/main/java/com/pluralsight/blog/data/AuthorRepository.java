package com.pluralsight.blog.data;

import com.pluralsight.blog.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// Only display within a post, but not explicitly by the /authors endpoint.
@RepositoryRestResource(exported = false)
public interface AuthorRepository extends JpaRepository<Author, Long> {


}
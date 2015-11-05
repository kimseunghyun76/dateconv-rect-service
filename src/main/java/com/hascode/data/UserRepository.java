package com.hascode.data;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by Helloworld
 * User : USER
 * Date : 2015-11-04
 * Time : 오전 10:40
 * To change this template use File | Settings | File and Code Templates.
 */
@RepositoryRestResource(collectionResourceRel = "user" , path="user")
public interface UserRepository extends PagingAndSortingRepository<User,Long> {
    List<User> findByUserName(@Param("name") String name);
}

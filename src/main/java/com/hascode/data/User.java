package com.hascode.data;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Helloworld
 * User : USER
 * Date : 2015-11-04
 * Time : 오전 10:36
 * To change this template use File | Settings | File and Code Templates.
 */
@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userSeq;
    private String userName;
    private String userId;
    private String userPassword;

}

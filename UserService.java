package com.springrest.springrest.service;

import java.util.List;

import com.springrest.springrest.entity.UserEntity;

int num = 29;
  if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");

        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            if(num % i == 0)
            {
//                 flag = true;
//                 break;
//             }
//         }

//         if (!flag)
//             System.out.println(num + " is a prime number.");
//         else
//             System.out.println(num + " is not a prime number.");

// public interface UserService {
// 	// create user
	public UserEntity createUser(UserEntity user) throws Exception;

	// get user by email
	public List getUser(String email) throws Exception      {
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");

public interface UserService {
	// create user
	public UserEntity createUser(UserEntity user) thr;
	
	// get user by data
	public List getUser(String data) throws Exception;
}

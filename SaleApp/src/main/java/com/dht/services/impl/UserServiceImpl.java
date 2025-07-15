/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.services.impl;

import com.dht.pojo.User;
import com.dht.repositories.UserRepository;
import com.dht.services.UserService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author huu-thanhduong
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepo;

    @Override
    public User getUserByUsername(String username) {
        return this.userRepo.getUserByUsername(username);
    }
    
    @Override
    public User addUser(Map<String, String> params, MultipartFile avatar) {
        return null;
//        User u = new User();
//        u.setFirstName(params.get("firstName"));
//        u.setLastName(params.get("lastName"));
//        u.setEmail(params.get("email"));
//        u.setPhone(params.get("phone"));
//        u.setUsername(params.get("username"));
//        u.setPassword(this.passwordEncoder.encode(params.get("password")));
//        u.setUserRole("ROLE_USER");
//        
//        if (!avatar.isEmpty()) {
//            try {
//                Map res = cloudinary.uploader().upload(avatar.getBytes(), ObjectUtils.asMap("resource_type", "auto"));
//                u.setAvatar(res.get("secure_url").toString());
//            } catch (IOException ex) {
//                Logger.getLogger(ProductServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        
//        return this.userRepo.addUser(u);
    }
}

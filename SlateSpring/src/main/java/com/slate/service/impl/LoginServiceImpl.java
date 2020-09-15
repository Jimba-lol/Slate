/**
 * Implementation of the LoginService interface.
 * Used to create, update, verify, and delete Login objects from the DataBase.
 * @author William Knox
 */

package com.slate.service.impl;

import com.slate.model.Login;
import com.slate.repo.LoginRepo;
import com.slate.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginRepo LoginRepo;
    
    /**
     * This will save a login to the database.
     * @param login a valid login object, requires a email and a password.
     * 
     */
    @Override
    public Login createLogin(Login login) {
        // save the new login object
        return LoginRepo.save(login);
    }

    /**
     * Updates a login's password, saves to database
     * @param login a valid login
     * @param password the new password
     * @return the updated login object with the new password
     */
    @Override
    public Login updateLogin(Login login, String password) {
        // get the appropriate Login from the DB
        Login user = LoginRepo.findByEmailAndPassword(login.getEmail(), login.getPassword());
        // replace the password
        user.setPassword(password);
        // save
        return LoginRepo.save(user);
    }

    /**
     * Verifies the username and password of a login
     * @param login the Login object we're trying to verify exists
     * @return valid login, or null
     */
    @Override
    public  Login verifyLogin(Login login) {
        // if we can find by email and Password, then credentials are correct and we return.
        return LoginRepo.findByEmailAndPassword(login.getEmail(), login.getPassword());
    }

    /**
     * Deletes the given Login object + associated Actor object
     * @param login the login to be deleted
     */
    @Override
    public void deleteLogin(Login login) {
        // delete by ID
        LoginRepo.deleteById(login.getId());
    }
}

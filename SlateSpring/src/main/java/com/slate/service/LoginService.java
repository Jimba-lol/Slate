package com.slate.service;

import com.slate.model.Login;

public interface LoginService {
    public Login createLogin(Login login);
    public Login updateLogin(Login login, String password); // for if someone wants to change their password
    public Login verifyLogin(Login login); // checks if Username + Password are valid
    public void deleteLogin(Login login); // needs to also delete associated Actor object.
}

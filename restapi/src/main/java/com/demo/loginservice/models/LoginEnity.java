package com.demo.loginservice.models;


public class LoginEnity {

    public int user_id;
    public String name;
    public String email;
    public String password;

public LoginEnity(){

}
    /**
     * Gets id.
     *
     * @return the id
     */
    public long getId() {
        return user_id;
    }
    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.user_id = id;
    }
    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }
    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }
    /**
     * Sets password.
     *
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password;
    }


}

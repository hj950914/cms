package com.jluster.cms.entity;

/**
 * Author: hj
 * Date: 2019-06-11 16:18
 * Description: <描述>
 */
public class UserTest {

    private String username;

    private String passowrd;

    public UserTest() {

    }

    public UserTest(String username, String passowrd) {
        this.username = username;
        this.passowrd = passowrd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassowrd() {
        return passowrd;
    }

    public void setPassowrd(String passowrd) {
        this.passowrd = passowrd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || o.getClass() != UserTest.class) {
            return false;
        } else {
            UserTest userTest = (UserTest) o;
            return userTest.getUsername().equals(this.getUsername()) && userTest.getPassowrd().equals(this.getPassowrd());
        }
    }


    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31*result + (passowrd != null ? passowrd.hashCode() : 0);
        return result;
    }
}

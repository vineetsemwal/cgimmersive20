package com.cg.apps.userappsecurity.entities;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
public class User {

    @GeneratedValue
    @Id
    private Long id;

    private String username;

    private String password;

    public User(){

    }

    public User(String username, String password, Set<String>roles){
        this.username=username;
        this.password=password;
        this.roles=roles;
    }

    @ElementCollection(fetch = FetchType.EAGER)
    private Set<String> roles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
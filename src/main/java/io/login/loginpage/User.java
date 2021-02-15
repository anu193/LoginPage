package io.login.loginpage;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    private Long id;
    private String username;
    private String password;
    private String role;
    private int enabled;

    protected User() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId(){
        return id;
    }

    public String getPassword() { return this.password; }

    public void setPassword(String pass) { this.password = pass; }

    public void setId(Long id) {
        this.id = id;
    }

    public void setRole(String role) { this.role = role; }

    public void setEnabled(int enabled) { this.enabled = enabled; }

    public String getRole() { return this.role; }

    public int getEnabled() { return this.enabled; }
}

package com.lucifer.stock.model.security;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lucifer.stock.constants.SchemaConstant;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;


@Entity
@Table(name = "SYS_USERS", schema= SchemaConstant.STOCK_SCHEMA)
public class SysUsers implements UserDetails, Serializable {
    private static final long serialVersionUID = -6498309642739707784L;

    @Id
    @Column(name = "userId", unique=true, nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userId;

    @Column(name = "username")
    private String username;

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

    @Column(name = "dtCreate")
    private Date dtCreate;

    @Column(name = "lastLogin")
    private Date lastLogin;

    @Column(name = "deadline")
    private Date deadline;

    @Column(name = "loginIp")
    private String loginIp;

    @Column(name = "VQzjgid")
    private String VQzjgid;

    @Column(name = "VQzjgmc")
    private String VQzjgmc;

    @Column(name = "depId")
    private String depId;

    @Column(name = "depName")
    private String depName;

    @Column(name = "enabled")
    private boolean enabled;

    @Column(name = "accountNonExpired")
    private boolean accountNonExpired;

    @Column(name = "accountNonLocked")
    private boolean accountNonLocked;

    @Column(name = "credentialsNonExpired")
    private boolean credentialsNonExpired;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @JsonIgnore
    private Set<SysUsersRoles> sysUsersRoleses = new HashSet<SysUsersRoles>(0);

    private Collection<GrantedAuthority> authorities;



    public SysUsers() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDtCreate() {
        return dtCreate;
    }

    public void setDtCreate(Date dtCreate) {
        this.dtCreate = dtCreate;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public String getVQzjgid() {
        return VQzjgid;
    }

    public void setVQzjgid(String VQzjgid) {
        this.VQzjgid = VQzjgid;
    }

    public String getVQzjgmc() {
        return VQzjgmc;
    }

    public void setVQzjgmc(String VQzjgmc) {
        this.VQzjgmc = VQzjgmc;
    }

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    public void setAccountNonExpired(boolean accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    public void setAccountNonLocked(boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    public void setCredentialsNonExpired(boolean credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }
}

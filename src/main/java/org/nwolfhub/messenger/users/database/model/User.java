package org.nwolfhub.messenger.users.database.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(schema = "messenger", name = "users")
public class User {
    @Id
    public String id;
    public String firstname;
    public String lastname;
    public String username;
    public String email;
    public Date online;
    @ElementCollection
    @CollectionTable(name="ips", joinColumns=@JoinColumn(name="id"))
    @Column(name="ip")
    public List<String> ips;
    @OneToMany
    public List<User> blacklist;
    @OneToMany
    public List<User> subbed;
    @OneToMany
    public List<User> subscribers;

    public User() {}

    public User(String id, String firstname, String lastname, String username, String email, Date online, List<String> ips, List<User> blacklist, List<User> subbed, List<User> subscribers) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.email = email;
        this.online = online;
        this.ips = ips;
        this.blacklist = blacklist;
        this.subbed = subbed;
        this.subscribers = subscribers;
    }

    public String getId() {
        return id;
    }

    public User setId(String id) {
        this.id = id;
        return this;
    }

    public String getFirstname() {
        return firstname;
    }

    public User setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getLastname() {
        return lastname;
    }

    public User setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public Date getOnline() {
        return online;
    }

    public User setOnline(Date online) {
        this.online = online;
        return this;
    }

    public List<String> getIps() {
        return ips;
    }

    public User setIps(List<String> ips) {
        this.ips = ips;
        return this;
    }

    public List<User> getBlacklist() {
        return blacklist;
    }

    public User setBlacklist(List<User> blacklist) {
        this.blacklist = blacklist;
        return this;
    }

    public List<User> getSubbed() {
        return subbed;
    }

    public User setSubbed(List<User> subbed) {
        this.subbed = subbed;
        return this;
    }

    public List<User> getSubscribers() {
        return subscribers;
    }

    public User setSubscribers(List<User> subscribers) {
        this.subscribers = subscribers;
        return this;
    }
}

package org.nwolfhub.messenger.users.database.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Report {
    @Id
    public String id;
    @ManyToOne
    public User owner;
    @ManyToOne
    public User target;

    public String state;

    public Report() {}

    public Report(String id, User owner, User target, String state) {
        this.id = id;
        this.owner = owner;
        this.target = target;
        this.state = state;
    }

    public String getId() {
        return id;
    }

    public Report setId(String id) {
        this.id = id;
        return this;
    }

    public User getOwner() {
        return owner;
    }

    public Report setOwner(User owner) {
        this.owner = owner;
        return this;
    }

    public User getTarget() {
        return target;
    }

    public Report setTarget(User target) {
        this.target = target;
        return this;
    }

    public String getState() {
        return state;
    }

    public Report setState(String state) {
        this.state = state;
        return this;
    }
}

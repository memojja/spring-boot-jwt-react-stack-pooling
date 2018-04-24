package com.example.backend.backend.model;

import com.example.backend.backend.model.audit.DateAudit;

import javax.persistence.*;

@Entity
@Table(name = "votes")
public class Vote extends DateAudit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "poll_id", nullable = false)
    private PollItem poll;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "choice_id", nullable = false)
    private ChoiceItem choice;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PollItem getPoll() {
        return poll;
    }

    public void setPoll(PollItem poll) {
        this.poll = poll;
    }

    public ChoiceItem getChoice() {
        return choice;
    }

    public void setChoice(ChoiceItem choice) {
        this.choice = choice;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
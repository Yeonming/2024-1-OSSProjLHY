package com.example.duel.alarm;

import com.example.duel.BaseTimeEntity;
import com.example.duel.comment.Comment;
import com.example.duel.til.Til;
import com.example.duel.user.User;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name="alarm_tb")
public class Alarm extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "til_id")
    private Til til;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "receiver_id")
    private User receiver;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "comment_id")
    private Comment comment;

    @Column
    private boolean isRead;

    @Builder
    public Alarm(Til til, User receiver, Comment comment, boolean isRead) {
        this.til = til;
        this.receiver = receiver;
        this.comment = comment;
        this.isRead = isRead;
    }

    public void readAlarm() {
        this.isRead = true;
    }
}

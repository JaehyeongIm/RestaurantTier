package com.site.restauranttier.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "restaurant_comment_likes_tbl")
public class RestaurantCommentlike {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer likeId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name="comment_id")
    private RestaurantComment restaurantComment;

    public RestaurantCommentlike(User user, RestaurantComment restaurantComment) {
        this.restaurantComment = restaurantComment;
        this.user = user;
        this.createdAt = LocalDateTime.now();
    }

    private LocalDateTime createdAt;
}

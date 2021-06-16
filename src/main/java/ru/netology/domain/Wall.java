package ru.netology.domain;

public class Wall {
    private int id;
    private int ownerID;
    private int fromId;
    private int createdBy;
    private int date;
    private int signerId;
    private int replyOwnerId;
    private int isPinned;
    private int postponedId;
    private int replyPostId;
    private int friendsOnly;
    private CommentsInfo commentsInfo;
    private Copyright copyright;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private PostSource postSource;
    private Geo geo;
    private Donut donut;
    private ViewsInfo viewsInfo;
    private String postType;
    private String text;
    private boolean canPin;
    private boolean canDelete;
    private boolean can_edit;
    private boolean marked_as_ads;
    private boolean isFavorite;

    // + get/set на все поля
}
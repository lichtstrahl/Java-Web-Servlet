package com.ivor;

import java.util.ArrayList;
import java.util.List;

public class DAO {
    static List<Post> posts;
    static {
        posts = new ArrayList<>();
        posts.add(new Post(1, "hello"));
        posts.add(new Post(2, "home"));
        posts.add(new Post(3, "politics"));
        posts.add(new Post(4, "world"));
    }

    public static List<Post> getPosts() {
        return posts;
    }

    public static void deletePost(int id) {
        for (int i = 0; i < posts.size(); i++) {
            if (posts.get(i).getId() == id) {
                posts.remove(i);
            }
        }
    }

    public static void addPost(String content) {
        posts.add(new Post(posts.size() + 1, content));
    }
}

package ua.goit.HomeWork.models;

public class CommentModel {
    private final int postId;
    private final int id;
    private final String name;
    private final String email;
    private final String body;

    public CommentModel(int postId, int id, String name, String email, String body) {
        this.postId = postId;
        this.id = id;
        this.name = name;
        this.email = email;
        this.body = body;
    }

    @Override
    public String toString() {
        return "CommentModel{" +
                "postId=" + postId +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
package ua.goit.HomeWork.models;

public class TodoModel {
    private int userId;
    private int id;
    private String title;
    private boolean completed;

    public TodoModel() {
        this.userId = 1;
        this.id = 1;
        this.title = "to kill rus orcs";
        this.completed = true;
    }

    public TodoModel(int userId, int id, String title, boolean completed) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    public boolean isCompleted() {
        return completed;
    }

    @Override
    public String toString() {
        return "TodoModel{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", completed=" + completed +
                '}';
    }
}

/*
  {
    "userId": 1,
    "id": 1,
    "title": "delectus aut autem",
    "completed": false
  },
*/
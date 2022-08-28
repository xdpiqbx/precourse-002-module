# Module 13 Web - Home Work

## Задание 1

Программа должна содержать методы для реализации следующего функционала:

- создание нового объекта в `https://jsonplaceholder.typicode.com/users`. Возможно, вы не увидите обновлений на сайте. Метод создания работает правильно, если в ответ на JSON с объектом вернулся такой же JSON, но с полем `id` со значением на 1 больше, чем самый большой `id` на сайте. [link 1.1](https://github.com/xdpiqbx/precourse-java-goit/blob/012-web-http/src/main/java/ua/goit/HomeWork/App.java#L37)

- обновление объекта в `https://jsonplaceholder.typicode.com/users`. Возможно, обновления не будут видны на сайте напрямую. Будем считать, что метод работает правильно, если в ответ на запрос придет обновленный JSON (он должен быть точно таким же, какой вы отправляли). [link 1.2](https://github.com/xdpiqbx/precourse-java-goit/blob/012-web-http/src/main/java/ua/goit/HomeWork/App.java#L54)

- удаление объекта из `https://jsonplaceholder.typicode.com/users`. Здесь будем считать корректным результат - статус из группы `2хх` в ответ на запрос. [link 1.3](https://github.com/xdpiqbx/precourse-java-goit/blob/012-web-http/src/main/java/ua/goit/HomeWork/App.java#L70)

- получение информации обо всех пользователях `https://jsonplaceholder.typicode.com/users` [link 1.4](https://github.com/xdpiqbx/precourse-java-goit/blob/012-web-http/src/main/java/ua/goit/HomeWork/App.java#L78)

- получение информации о пользователе с определенным `id` `https://jsonplaceholder.typicode.com/users/{id}` [link 1.5](https://github.com/xdpiqbx/precourse-java-goit/blob/012-web-http/src/main/java/ua/goit/HomeWork/App.java#L95)

- получение информации о пользователе с опредленным `username` - `https://jsonplaceholder.typicode.com/users?username={username}` [link 1.6](https://github.com/xdpiqbx/precourse-java-goit/blob/012-web-http/src/main/java/ua/goit/HomeWork/App.java#L108)

---

## Задание 2 

[link 2](https://github.com/xdpiqbx/precourse-java-goit/blob/012-web-http/src/main/java/ua/goit/HomeWork/App.java#L125)

Дополните программу методом, который будет выводить все комментарии к последнему посту определенного пользователя и записывать их в файл.

`https://jsonplaceholder.typicode.com/users/1/posts` Последним будем считать пост с наибольшим `id`.

`https://jsonplaceholder.typicode.com/posts/10/comments`

Файл должен называться `user-X-post-Y-comments.json`, где `Х` - номер пользователя, `Y` - номер поста.

---

## Задание 3 

[link 3](https://github.com/xdpiqbx/precourse-java-goit/blob/012-web-http/src/main/java/ua/goit/HomeWork/App.java#L157)

Дополните программу методом, который будет выводить все открытые задачи для пользователя `Х`.

`https://jsonplaceholder.typicode.com/users/1/todos`.

Открытыми считаются все задачи, у которых `completed = false`.
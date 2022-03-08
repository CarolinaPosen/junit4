package com.mikhalevich.humanity.model;

import static org.junit.Assert.assertTrue;

import com.mikhalevich.humanity.model.Sex;
import com.mikhalevich.humanity.model.User;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple User.
 */
public class UserTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void getAllUsers() {
        //GIVEN
        //создаем тестовые данные
        User user = new User("Евгений", 35, Sex.MALE);
        User user1 = new User("Марина", 34, Sex.FEMALE);
        User user2 = new User("Алина", 7, Sex.FEMALE);

        //создаем список expected и заполняем его данными нашего метода
        List<User> expected = User.getAllUsers();

        //WHEN
        //создаем список actual в него помещаем данные для сравнения
        //то что мы предпологиаем метод должен вернуть
        List<User> actual = new ArrayList<>();
        actual.add(user);
        actual.add(user1);
        actual.add(user2);

        //THEN
        //запускаем тест, в случае если список expected и actual не будут равны
        //тест будет провален, о результатах теста читаем в консоли
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllDifferentUsers() {
        //создаем тестовые данные
        User user = new User("Евгений", 35, Sex.MALE);
        User user1 = new User("Марина", 34, Sex.FEMALE);
        User user2 = new User("Алина", 7, Sex.FEMALE);

        //создаем список expected и заполняем его данными нашего метода
        List<User> expected = User.getAllUsers();

        //создаем список actual в него помещаем данные для сравнения
        //то что мы предпологиаем метод должен вернуть
        List<User> actual = new ArrayList<>();
        actual.add(new User("User1", 1, Sex.MALE));
        actual.add(new User("User2", 2, Sex.FEMALE));
        actual.add(new User("User3", 3, Sex.MALE));

        //запускаем тест, в случае если список expected и actual не будут равны
        //тест будет провален, о результатах теста читаем в консоли
        Assert.assertEquals(expected, actual);
    }

    /**
     * Поскольку инициализация переменной Map<Integer, User> allUsers
     * происходит в конструкторе тест завершается с NllPointerException;
     */
    @Test
    public void getAllUsers_NO_NULL() {
        //добавим проверку на null
        List<User> expected = User.getAllUsers();
        Assert.assertNotNull(expected);
    }

    @Test
    public void getAllUsers_MALE() {
        User user = new User("Евгений", 35, Sex.MALE);
        User user1 = new User("Марина", 34, Sex.FEMALE);
        User user2 = new User("Алина", 7, Sex.FEMALE);

        List<User> expected = User.getAllUsers(Sex.MALE);

        List<User> actual = new ArrayList<>();
        actual.add(user);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllUsers_MALE_NO_NULL() {
        //добавим проверку на null
        List<User> expected = User.getAllUsers(Sex.MALE);
        Assert.assertNotNull(expected);
    }

    @Test
    public void getAllUsers_FEMALE() {
        User user = new User("Евгений", 35, Sex.MALE);
        User user1 = new User("Марина", 34, Sex.FEMALE);
        User user2 = new User("Алина", 7, Sex.FEMALE);

        List<User> expected = User.getAllUsers(Sex.FEMALE);

        List<User> actual = new ArrayList<>();
        actual.add(user1);
        actual.add(user2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllUsers_FEMALE_NO_NULL() {
        //добавим проверку на null
        List<User> expected = User.getAllUsers(Sex.FEMALE);
        Assert.assertNotNull(expected);
    }

    @Test
    public void getHowManyUsers() {
        User user = new User("Евгений", 35, Sex.MALE);
        User user1 = new User("Марина", 34, Sex.FEMALE);
        User user2 = new User("Алина", 7, Sex.FEMALE);

        int expected = User.getHowManyUsers();

        int actual = 3;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHowManyUsers_MALE() {
        User user = new User("Евгений", 35, Sex.MALE);
        User user1 = new User("Марина", 34, Sex.FEMALE);
        User user2 = new User("Алина", 7, Sex.FEMALE);

        int expected = User.getHowManyUsers(Sex.MALE);

        int actual = 1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHowManyUsers_FEMALE() {
        User user = new User("Евгений", 35, Sex.MALE);
        User user1 = new User("Марина", 34, Sex.FEMALE);
        User user2 = new User("Алина", 7, Sex.FEMALE);

        int expected = User.getHowManyUsers(Sex.FEMALE);

        int actual = 2;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllAgeUsers() {
        User user = new User("Евгений", 35, Sex.MALE);
        User user1 = new User("Марина", 34, Sex.FEMALE);
        User user2 = new User("Алина", 7, Sex.FEMALE);

        int expected = User.getAllAgeUsers();

        int actual = 35 + 34 + 7;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllAgeUsers_MALE() {
        User user = new User("Евгений", 35, Sex.MALE);
        User user1 = new User("Марина", 34, Sex.FEMALE);
        User user2 = new User("Алина", 7, Sex.FEMALE);

        int expected = User.getAllAgeUsers(Sex.MALE);

        int actual = 35;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllAgeUsers_FEMALE() {
        User user = new User("Евгений", 35, Sex.MALE);
        User user1 = new User("Марина", 34, Sex.FEMALE);
        User user2 = new User("Алина", 7, Sex.FEMALE);

        int expected = User.getAllAgeUsers(Sex.FEMALE);

        int actual = 34 + 7;

        Assert.assertEquals(expected, actual);
    }
}

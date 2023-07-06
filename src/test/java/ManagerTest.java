package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ManagerTest {

    ru.netology.domain.Manager manager = new ru.netology.domain.Manager();

    @Test
    public void shouldAddFilm0() {

        ru.netology.domain.Poster[] expected = new ru.netology.domain.Poster[0];
        ru.netology.domain.Poster[] actual = manager.findAll();
        System.out.println(Arrays.toString(actual));
        Assertions.assertArrayEquals(expected,actual);
    }


    @Test
    public void shouldAddFilm1() {
        manager.addFilm(new ru.netology.domain.Poster(1, "Бладшот"));

        ru.netology.domain.Poster[] expected = {(new ru.netology.domain.Poster(1, "Бладшот"))};
        ru.netology.domain.Poster[] actual = manager.findAll();
        System.out.println(Arrays.toString(actual));
        Assertions.assertArrayEquals(expected,actual);
    }


    @Test
    public void shouldAddFilm3() {
        manager.addFilm(new ru.netology.domain.Poster(1, "Бладшот"));
        manager.addFilm(new ru.netology.domain.Poster(2, "Вперёд"));
        manager.addFilm(new ru.netology.domain.Poster(3, "Отель Белград"));

        ru.netology.domain.Poster[] expected = {(new ru.netology.domain.Poster(1, "Бладшот")),(new ru.netology.domain.Poster(2, "Вперёд")),
                (new ru.netology.domain.Poster(3, "Отель Белград"))};
        ru.netology.domain.Poster[] actual = manager.findAll();
        System.out.println(Arrays.toString(actual));
        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void shouldFindMaxLast() {
        manager.addFilm(new ru.netology.domain.Poster(1));
        manager.addFilm(new ru.netology.domain.Poster(2));
        manager.addFilm(new ru.netology.domain.Poster(3));
        manager.addFilm(new ru.netology.domain.Poster(4));
        manager.addFilm(new ru.netology.domain.Poster(5));
        manager.addFilm(new ru.netology.domain.Poster(6));
        manager.addFilm(new ru.netology.domain.Poster(7));
        manager.addFilm(new ru.netology.domain.Poster(8));
        manager.addFilm(new ru.netology.domain.Poster(9));
        manager.addFilm(new ru.netology.domain.Poster(10));
        manager.addFilm(new ru.netology.domain.Poster(11));


        ru.netology.domain.Poster[] expected = {(new ru.netology.domain.Poster (11)),(new ru.netology.domain.Poster(10)),
                (new ru.netology.domain.Poster(9)),(new ru.netology.domain.Poster(8)),(new ru.netology.domain.Poster(7)),(new ru.netology.domain.Poster(6)),(new ru.netology.domain.Poster(5)),
                (new ru.netology.domain.Poster(4)),(new ru.netology.domain.Poster(3)),(new ru.netology.domain.Poster(2))};
        System.out.println(Arrays.toString(manager.findLast()));
        Assertions.assertArrayEquals(expected, manager.findLast());
    }
    @Test
    public void shouldFindLast9() {
        ru.netology.domain.Manager manager = new ru.netology.domain.Manager(9);
        manager.addFilm(new ru.netology.domain.Poster(1));
        manager.addFilm(new ru.netology.domain.Poster(2));
        manager.addFilm(new ru.netology.domain.Poster(3));
        manager.addFilm(new ru.netology.domain.Poster(4));
        manager.addFilm(new ru.netology.domain.Poster(5));
        manager.addFilm(new ru.netology.domain.Poster(6));
        manager.addFilm(new ru.netology.domain.Poster(7));
        manager.addFilm(new ru.netology.domain.Poster(8));
        manager.addFilm(new ru.netology.domain.Poster(9));
        manager.addFilm(new ru.netology.domain.Poster(10));

        ru.netology.domain.Poster[] expected = {(new ru.netology.domain.Poster(10)),(new ru.netology.domain.Poster(9)),
                (new ru.netology.domain.Poster(8)),(new ru.netology.domain.Poster(7)),(new ru.netology.domain.Poster(6)),(new ru.netology.domain.Poster(5)),(new ru.netology.domain.Poster(4)),
                (new ru.netology.domain.Poster(3)),(new ru.netology.domain.Poster(2))};
        System.out.println(Arrays.toString(manager.findLast()));
        Assertions.assertArrayEquals(expected, manager.findLast());
    }
    @Test
    public void shouldFindLast1() {
        ru.netology.domain.Manager manager = new ru.netology.domain.Manager(1);
        manager.addFilm(new ru.netology.domain.Poster(1));
        manager.addFilm(new ru.netology.domain.Poster(2));
        manager.addFilm(new ru.netology.domain.Poster(3));
        manager.addFilm(new ru.netology.domain.Poster(4));
        manager.addFilm(new ru.netology.domain.Poster(5));
        manager.addFilm(new ru.netology.domain.Poster(6));
        manager.addFilm(new ru.netology.domain.Poster(7));


        ru.netology.domain.Poster[] expected = {(new ru.netology.domain.Poster(7))};
        System.out.println(Arrays.toString(manager.findLast()));
        Assertions.assertArrayEquals(expected, manager.findLast());
    }
    @Test
    public void shouldFindLast() {
        ru.netology.domain.Manager manager = new ru.netology.domain.Manager(5);
        manager.addFilm(new ru.netology.domain.Poster(1));
        manager.addFilm(new ru.netology.domain.Poster(2));
        manager.addFilm(new ru.netology.domain.Poster(3));

        ru.netology.domain.Poster[] expected = {(new ru.netology.domain.Poster(3)),(new ru.netology.domain.Poster(2)),(new ru.netology.domain.Poster(1))};
        System.out.println(Arrays.toString(manager.findLast()));
        Assertions.assertArrayEquals(expected, manager.findLast());
    }
    @Test
    public void shouldFindLast5() {
        ru.netology.domain.Manager manager = new ru.netology.domain.Manager(7);

        ru.netology.domain.Poster[] expected = new ru.netology.domain.Poster[0];
        System.out.println(Arrays.toString(manager.findLast()));
        Assertions.assertArrayEquals(expected, manager.findLast());
    }


}

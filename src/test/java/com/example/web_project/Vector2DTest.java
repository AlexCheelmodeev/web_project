package com.example.web_project;

import org.junit.jupiter.api.*;

class Vector2DTest {

    private static Vector2D v;

    @BeforeAll
    public static void createNewVector(){
        v = new Vector2D();
    }


    @Test
    @DisplayName("Проверка создания простого обьекта вектора, значение должно быть нулевое")
    void newVectorShouldHaveZeroLength() {
        //action


        //assertion
        Assertions.assertEquals(0, v.length());
    }

    @Test
    void newVectorShouldHaveZeroPointX() {

        Assertions.assertEquals(0,v.getX());
    }

    @Test
    void newVectorShouldHaveZeroPointY() {

        Assertions.assertEquals(0,v.getX());
    }


    @AfterAll
    public static void setVectorNull(){
        v = null;
    }
}
package com.techscore.spring.di;

import org.springframework.beans.factory.xml.XmlBeanFactory;

import org.springframework.core.io.ClassPathResource;

 

public class Main {

    public static void main(String[] args) {

        ClassPathResource res = new ClassPathResource(

                "/com/techscore/spring/di/beans.xml");

        XmlBeanFactory factory = new XmlBeanFactory(res);

        Person yamada = (Person) factory.getBean("yamada");

        System.out.println("[name=" + yamada.getName() + "]");

        yamada.listenMusic();

    }

}
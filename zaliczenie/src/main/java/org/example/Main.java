package org.example;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.example.p1.Cat;
import org.example.p1.Dog;
import org.example.p1.Parrot;
import org.example.p2.Owner;

import java.util.Properties;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static Logger logger;
    private static final Owner OWNER = new Owner();

    public static void main(String[] args) {
        init();
        Scanner scanner = new Scanner(System.in);
        while (true) {

            logger.info("1. Dodaj psa\n2. Dodaj kota\n3. Dodaj papugę\n4.Wyświetl zwierzęta\n5.Wyjdź");
            int number = Integer.parseInt(scanner.nextLine());

            if (number == 1) {
                logger.info("Podaj imie psa");
                String name = scanner.nextLine();
                Dog dog = new Dog();
                dog.setName(name);
                OWNER.addDog(dog);
                logger.info("Dodano psa: "+dog);
            }

            if (number == 2) {
                logger.info("Podaj imie kota");
                String name = scanner.nextLine();
                Cat cat = new Cat();
                cat.setName(name);
                OWNER.addCat(cat);
                logger.info("Dodano kota: "+cat);
            }

            if (number == 3) {
                logger.info("Podaj imie papugi");
                String name = scanner.nextLine();
                Parrot parrot = new Parrot();
                parrot.setName(name);
                OWNER.addParrot(parrot);
                logger.info("Dodano papugę: "+parrot);
            }

            if (number == 4) {
                logger.info(OWNER);
            }

            if (number == 5) {
                System.exit(0);
            }
        }
    }
    private static void init(){
        Properties properties=new Properties();
        properties.setProperty("log4j.rootLogger","TRACE,stdout,MyFile");
        properties.setProperty("log4j.rootCategory","TRACE");

        properties.setProperty("log4j.appender.stdout",     "org.apache.log4j.ConsoleAppender");
        properties.setProperty("log4j.appender.stdout.layout",  "org.apache.log4j.PatternLayout");
        properties.setProperty("log4j.appender.stdout.layout.ConversionPattern","%d{yyyy/MM/dd HH:mm:ss.SSS} [%5p] %t (%F) - %m%n");

        properties.setProperty("log4j.appender.MyFile", "org.apache.log4j.RollingFileAppender");
        properties.setProperty("log4j.appender.MyFile.File", "my_example.log");
        properties.setProperty("log4j.appender.MyFile.MaxFileSize", "100KB");
        properties.setProperty("log4j.appender.MyFile.MaxBackupIndex", "1");
        properties.setProperty("log4j.appender.MyFile.layout",  "org.apache.log4j.PatternLayout");
        properties.setProperty("log4j.appender.MyFile.layout.ConversionPattern","%d{yyyy/MM/dd HH:mm:ss.SSS} [%5p] %t (%F) - %m%n");

        PropertyConfigurator.configure(properties);

        logger = Logger.getLogger(Main.class);
    }
}
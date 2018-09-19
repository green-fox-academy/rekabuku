
package com.greenfoxacademy.hellobean;
import com.greenfoxacademy.hellobean.services.Printer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellobeanApplication implements CommandLineRunner {

    Printer printer;
    MyColor myColor;


    public HellobeanApplication(Printer printer, MyColor myColor) {
        this.printer = printer;
        this.myColor = myColor;
    }

    public static void main(String[] args) {
        SpringApplication.run(HellobeanApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log("hello");
        myColor.printColor();
    }

  
}
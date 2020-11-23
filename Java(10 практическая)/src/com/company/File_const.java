package com.company;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.io.*;

public class File_const {
    static Logger logger;
    public static void createLogFile() {
        java.io.File filePath = new java.io.File("log");
        filePath.mkdir();
        java.io.File logfile = new java.io.File(filePath + "\\log.txt");
        try {
            logfile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileOutputStream os = new FileOutputStream("log\\log.txt")) {
            logger = Logger.getLogger(Main.class.getName());
            FileHandler fileHandler = new FileHandler("log\\log.txt");
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void PrintLogFile() {
        createLogFile();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сообщения:");
        String message = in.nextLine();
        System.out.println("Введите сообщения:");
        String message1 = in.nextLine();
        try {
            logger.log(Level.INFO,message);
            logger.log(Level.WARNING,message1);
        } catch (Exception e) {
            e.printStackTrace();
            logger.log(Level.WARNING,"Eror");
        }
    }
    public static long folderSize(File directory) {
        long length = 0;
        for (File file : directory.listFiles()) {
            if (file.isFile())
                length += file.length();
            else if (file.isDirectory())
                length += folderSize(file);
        }
        return length;
    }


    public static void File_directory() {
        Scanner in = new Scanner(System.in);
        long size = 0;
        System.out.println("Введите путь до папки");
        String path = in.nextLine();
        try {
            File file = new File(path);
            if (file.exists()) {
                size = folderSize(file);
                String answer;
                if (size < 1024) {
                    answer = String.valueOf(size) + " Bytes";
                } else if (size < 1024*1024) {
                    answer = String.valueOf(size/1024) + " KB";
                } else if (size < 1024*1024*1024) {
                    answer = String.valueOf(size/(1024*1024)) + " MBytes";
                } else if (size < (long)1024*1024*1024*1024) {
                    answer = String.valueOf(size/(1024*1024*1024)) + " GBytes";
                } else {
                    answer = String.valueOf(size/((long)1024*1024*1024*1024)) + " TBytes";
                }

                System.out.println("Размер папки " + path + " составляет " + answer);
            } else {
                System.out.println("Такого каталога нет");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void Copy_File() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите копируемый каталог");
        String source = scanner.nextLine();

        System.out.println("Куда вставить?");
        String destination = scanner.nextLine();

        try {
            copyDirectory(new File(source), new File(destination + source.substring(source.lastIndexOf("\\"))));
            System.out.println("Копирование произошло успешно");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Eror");
        }
    }

    public static void copyDirectory(File source, File destination) throws IOException {

        if (source.isDirectory()) {

            if (!destination.exists())
                destination.mkdir();

            String[] files = source.list();

            if (files == null) {
                return;
            }

            for (String file : files) {
                File srcFile = new File(source, file);
                File destFile = new File(destination, file);
                copyDirectory(srcFile, destFile);
            }

        } else {
            try {

                FileInputStream in = new FileInputStream(source);
                FileOutputStream out = new FileOutputStream(destination);

                byte[] buffer = new byte[1024];

                int length;
                while ((length = in.read(buffer)) > 0) {
                    out.write(buffer, 0, length);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}








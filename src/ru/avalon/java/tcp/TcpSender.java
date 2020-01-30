package ru.avalon.java.tcp;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.*;
import java.io.*;
import java.util.Scanner;


/**
 * Упражнение на выработку базовых умений использования
 * протокола TCP.
 *
 * @author Daniel Alpatov
 */
public final class TcpSender {

    public static void main(String[] args) throws IOException {
        // 1. Подготавливааем сообщение
        final String message = prepareMessage();
        // 2. Подготавливаем адрес
        final SocketAddress address = prepareAddress();
        // 3. Устанавливаем соединение
        Socket socket = connect(address);
        
        // 4. Отправляем сообщение
        send(socket, message);
        // 5. Закрываем соединеие
        socket.close();
    }

    /**
     * Возвращает объект сообщения.
     *
     * @return текстовое сообщение.
     */
    private static String prepareMessage() {
        System.out.println("Enter your message: ");
        Scanner in = new Scanner(System.in);
        String message = in.nextLine();
        return message;
        /*
         * TODO Реализовать метод prepareMessage класса TcpSender
         */
        //throw new UnsupportedOperationException("Not implemented yet!");
    }

    /**
     * Возвращает адрес, на который будет выполнена отправка сообщения.
     *
     * @return экземпля типа {@link SocketAddress}
     */
    private static SocketAddress prepareAddress() {
        return new InetSocketAddress("localhost", 8060);
        /*
         * TODO Реализовать метод prepareAddress класса TcpSender
         */
        //throw new UnsupportedOperationException("Not implemented yet!");
    }

    /**
     * Устанавливает соединение на указанный адрес и возвращает сокет
     * описывающий соединение.
     *
     * @param address адрес, на который будет выполено соединение.
     *
     * @return сокет, описывающий открытое соединеие.
     *
     * @throws IOException
     */
    private static Socket connect(SocketAddress address) throws IOException {
        /*
         * TODO Реализовать метод connect класса TcpSender
         */
        
        return new Socket(InetAddress.getLocalHost(), 8090);
        //throw new UnsupportedOperationException("Not implemented yet!");
    }

    /**
     * Выполняет отправку сообщения {@code message} на {@code socket}.
     *
     * @param socket соединение, через которое будет отправлено сообщение.
     * @param message сообщение
     *
     * @throws IOException
     */
    private static void send(Socket socket, String message) throws IOException {
        OutputStream stream = socket.getOutputStream();
        PrintWriter writer = new PrintWriter(stream);
        writer.write(message);
        writer.flush();
        /*
         * TODO Реализовать метод send класса TcpSender
         */
        //throw new UnsupportedOperationException("Not implemented yet!");
    }

}

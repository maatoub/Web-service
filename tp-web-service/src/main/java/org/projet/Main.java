package org.projet;

import jakarta.xml.ws.Endpoint;
import org.projet.ws.BanqueService;

public class Main {
    public static void main(String[] args)
    {
        String URL  = "http://0.0.0.0:3333/";
        Endpoint.publish(URL,new BanqueService());
        System.out.println("Starting in =>  http://0.0.0.0:3333/");
    }
}
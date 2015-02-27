package sureya.training.java;


import sureya.training.java.protos.ProtoJava;

import java.util.ArrayList;

public class ProtoBasics
{
    public static void main( String[] args )
    {
        ProtoJava.Credentials.Builder userDetails = ProtoJava.Credentials.newBuilder();

        Structure structure = new Structure();
        ArrayList<String> emailIds = new ArrayList<String>();

        emailIds.add("john@budwiser.com");
        emailIds.add("rick@jackDaniels.com");
        emailIds.add("smith@RoyalChallenge.com");

        userDetails.addAllEmail(emailIds);

        userDetails.setFirstName("Sureya");
        userDetails.setLastName("Sathiamoorthi");
        userDetails.setPassword("protoBuf is Awesome");


        System.out.println("-----------------------OutPut----------------------");

        System.out.println(userDetails.getFirstName());


        System.out.println(userDetails.getLastName());

        System.out.println(userDetails.getPassword());



    }

}

package com.example.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;


public class Main {
    public static void main(String[] args) throws Throwable {
        ObjectMapper mapper = new ObjectMapper();

//        Member buildMember = Member.builder().id("myid").name("myname").org("koscom").build();
        Member builtMember = new Member("myId", "myName", "koscom");

        //Serialize
        String json = mapper.writeValueAsString(builtMember);
        byte[] byteStream = json.getBytes();
        System.out.println("json = " + json);

//        //DeSerialize
        String inputString = new String(byteStream);
//        Map<String, Object> readObject = mapper.readValue(inputString, Member.class);
//        System.out.println("readObject = " + readObject);
        System.out.println("inputString = " + inputString);

    }
}

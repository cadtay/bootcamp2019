package com.manchsterdigital;

import org.apache.commons.lang3.StringUtils;

import java.security.MessageDigest;
import java.util.List;

public class Scratch {
    public static void main(String[] args) {
        List<String> names = List.of("Jose", "Andrew", "Emalin");

        System.out.println("Names = " + StringUtils.capitalize(names.get(0)));

        System.out.println(" = names" + StringUtils.defaultString(names.get(0), "Sam"));



    }
}

package com.xo.shop;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created By willz
 * Date : 2020/3/31
 * Time: 16:06
 */
public class Test {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println(encoder.encode("qwer1234"));
        System.out.println(encoder.encode("qwer1234"));
        System.out.println(encoder.encode("123456"));
    }
}
